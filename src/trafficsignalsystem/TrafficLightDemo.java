package trafficsignalsystem;

public class TrafficLightDemo {


    public static void main(String[] args) {

        TrafficControl trafficControl = TrafficControl.getInstance();

        TrafficLight l1 = new TrafficLight(1, 3000,4000, 500);
        TrafficLight l2 = new TrafficLight(2, 3000, 6000, 7000);
        TrafficLight l3 = new TrafficLight(3, 4000, 6000, 4000);
        TrafficLight l4 = new TrafficLight(4, 3000, 3000,4000);


        Road r1 = new Road(1, "mainRoad", l1);
        Road r2 = new Road(2, "mainRoad2", l2);
        Road r3 = new Road(3, "mainRoad3", l3);
        Road r4 = new Road(4, "mainRoad4", l4);


        trafficControl.addRoad("1",r1);
        trafficControl.addRoad("2",r2);
        trafficControl.addRoad("3",r3);
        trafficControl.addRoad("4",r4);


        trafficControl.startTrafficControl();








    }


}
