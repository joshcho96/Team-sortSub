import java.util.ArrayList;

public class SortFunction {
    ArrayList<Passenger> passengers;
    private int carToStart;
    private int timeToFinish;
    private int distance;
    private int bonusTime;


    public SortFunction(int carToStart, int timeToFinish, int distance, int bonusTime){
        this.carToStart = carToStart;
        this.timeToFinish = timeToFinish;
        this.distance = distance;
        this.bonusTime = bonusTime;
    }

    public int getEfficiency() {
        return carToStart + timeToFinish + distance + bonusTime;
    }


}
