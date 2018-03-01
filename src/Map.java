import java.util.*;


public class Map {
    private int rows;
    private int columns;
    private ArrayList<Car> cars;
    private ArrayList<Passenger> passengers;

    public Map(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public void addCar(Car car) {
        cars.add(car);
    }
    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
    public int getNumberOfCars() {
        return cars.size();
    }
    public int getNumberOfPassengers() {
        return passengers.size();
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
}