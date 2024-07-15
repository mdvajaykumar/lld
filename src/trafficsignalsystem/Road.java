package trafficsignalsystem;

public class Road {
    private  int id;
    private String name;
    private TrafficLight trafficLight;

    public Road(int id, String name, TrafficLight light){
        this.id = id;
        this.name =name;
        this.trafficLight =light;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TrafficLight getTrafficLight() {
        return trafficLight;
    }

    public void setTrafficLight(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }
}
