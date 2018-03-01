import java.lang.reflect.Array;
import java.util.*;


public class Map {
    private int rows;
    private int columns;
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Line> passengers = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> efficiency =  new ArrayList<>();


    //car to start
    //Finish time - current time
    //distance
    //bonus time (finishtime  - current time - distance)



    public ArrayList<ArrayList<Integer>> getEfficient() {
        for (int i = 0; i < cars.size(); i ++) {
            efficiency.add(cars.get(i).getEffiency());
        }
        return efficiency;
    }

    public void compare() {
        int[] place = {0,0};
        int mostEfficient = efficiency.get(0).get(0);

        for (int i = 0; i < efficiency.size(); i++) {
            if (!cars.get(i).hasPassenger()){
                for (int j = 0; j < efficiency.get(i).size(); j++) {
                    if (mostEfficient > efficiency.get(i).get(j)) {
                        place[0] = i;
                        place[1] = j;
                        mostEfficient = efficiency.get(i).get(j);
                    }
                }
            }
        }



    }


    public Map(int rows, int columns, ArrayList<Line> passengers, int noOfCars) {
        this.rows = rows;
        this.columns = columns;
        this.passengers = passengers;
        for (int i = 0; i < noOfCars; i++) {
            Car car = new Car();
            cars.add(car);
        }
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

    public ArrayList<Line> getPassengers() {
        return passengers;
    }
}