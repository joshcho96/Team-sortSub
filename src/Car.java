import java.util.ArrayList;

import static java.lang.Math.abs;

public class Car {
    private static ArrayList<Line> passengers = new ArrayList<>();
    private ArrayList<Integer> effiency = new ArrayList<>();
    private int currentColumn;
    private int currentRow;
    private boolean onJourney;
    private Passenger passenger;
    private int carToStart;
    private int moves;
    private int distanceFromTarget;

    public Car() {
        this.currentColumn = 0;
        this.currentRow = 0;
        this.onJourney = false;
        moves = 0;
    }

    public boolean checkMoves() {
        if (moves == passenger.getDistance()) {
            dropPassenger();
            return true;
        }
        return false;
    }

    public int getMoves() {
        return moves;
    }

    public void setPassengers(ArrayList<Line> passengers2) {
        passengers = passengers2;
        distanceFromTarget = passenger.getDistance();
    }

    public void passengerTravel(Passenger passenger) {
        distanceFromTarget =  Math.abs(currentRow - passenger.getSp().getRow()) + Math.abs(currentColumn - passenger.getSp().getColumn());
        moves++;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }
    public int getCurrentRow() {
        return currentRow;
    }
    public boolean hasPassenger() {
        return onJourney;
    }

    public void setPassenger(Passenger passenger){
        this.passenger = passenger;
        onJourney = true;
    }


    public void dropPassenger() {
        onJourney = false;
        currentRow = passenger.getFp().getRow();
        currentColumn = passenger.getFp().getColumn();
        moves = 0;
    }


    public int getCarToStart(int row, int column) {
        carToStart = Math.abs(currentRow - row) + Math.abs(currentColumn - column);
        return carToStart;
    }

    public ArrayList<Integer> getEffiency() {
        for (int i = 0; i < passengers.size(); i++) {
            SortFunction sorter = new SortFunction(carToStart, ((Passenger) passengers.get(i)).timeToFinish(Main.getCurrentTime()), ((Passenger) passengers.get(i)).getDistance(), ((Passenger) passengers.get(i)).bonusTime(Main.getCurrentTime()));
            effiency.add(sorter.getEfficiency());
        }
        return effiency;
    }

    public Passenger getPassenger() {
        return passenger;
    }
}