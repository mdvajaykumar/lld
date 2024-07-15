package trafficsignalsystem;

public class TrafficLight {
    private  int id;
    private Signal currentSignal;
    private int redLightDuration;
    private int greenLightDuration;
    private int orangeLightDuration;


    public TrafficLight(int id, int redLightDuration, int greenLightDuration, int orangeLightDuration){
        this.id =id;
        this.currentSignal = Signal.RED;
        this.greenLightDuration = greenLightDuration;
        this.orangeLightDuration =orangeLightDuration;
    }

    public synchronized void  changeTrafficSignal(Signal signal){
        this.currentSignal =signal;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Signal getCurrentSignal() {
        return currentSignal;
    }

    public void setCurrentSignal(Signal currentSignal) {
        this.currentSignal = currentSignal;
    }

    public int getRedLightDuration() {
        return redLightDuration;
    }

    public void setRedLightDuration(int redLightDuration) {
        this.redLightDuration = redLightDuration;
    }

    public int getGreenLightDuration() {
        return greenLightDuration;
    }

    public void setGreenLightDuration(int greenLightDuration) {
        this.greenLightDuration = greenLightDuration;
    }

    public int getOrangeLightDuration() {
        return orangeLightDuration;
    }

    public void setOrangeLightDuration(int orangeLightDuration) {
        this.orangeLightDuration = orangeLightDuration;
    }

    private void notifyObservers(){
        // notify Roads about the Signals
    }
}
