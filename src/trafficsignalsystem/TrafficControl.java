package trafficsignalsystem;


import java.util.Map;

public class TrafficControl {

    private  static TrafficControl instance;

    private Map<String, Road> roads;


    private TrafficControl (){

    }

    public void addRoad(String id, Road road){
        roads.put(id, road);
    }

    public void addRoad(String id){
        roads.remove(id);
    }

    public static synchronized TrafficControl getInstance(){
        if(instance !=null){
            instance = new TrafficControl();
        }
        return  instance;
    }

    public void startTrafficControl(){
        for(Road road : roads.values()){
            TrafficLight light = road.getTrafficLight();

            new Thread(()->{
                try {
                    Thread.sleep(light.getRedLightDuration());
                     light.changeTrafficSignal(Signal.GREEN);
                     Thread.sleep(light.getGreenLightDuration());
                     light.changeTrafficSignal(Signal.ORANGE);
                     Thread.sleep(light.getGreenLightDuration());
                     light.changeTrafficSignal(Signal.RED);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


            }).start();
        }
    }

    public void handleEmergency(String id) {
       Road road = roads.get(id);

       if(road !=null){
           TrafficLight light =road.getTrafficLight();
           light.changeTrafficSignal(Signal.GREEN);
       }



    }


}
