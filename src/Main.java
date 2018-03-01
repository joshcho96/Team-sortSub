import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    private static int currentTime = 0;
    private static HashMap<Car, ArrayList<Integer>> journeyList = new HashMap<>();
    private static ArrayList<ArrayList<Integer>> efficiency = new ArrayList<>();

    public static int getCurrentTime(){
        return currentTime;
    }

    public static void main(String[] args) throws FileNotFoundException {
        ReadFile fileReader = new ReadFile("a_example.in");

        FirstLine firstLine = fileReader.getFirstLine();
        ArrayList<Line> list = fileReader.getLines();
        int something = 0;


        Map map = new Map(firstLine.getRow(), firstLine.getColumn(), list, firstLine.getVehicles());
        for (int time = 0; time < firstLine.getSteps(); time++) {
            for (int i = 0; i < list.size(); i++) {
                efficiency = map.getEfficient();
                for (int carNo = 0; carNo < firstLine.getVehicles(); carNo++) {
                    map.getCars().get(carNo).setPassenger((Passenger)list.get(i));
                    System.out.println(efficiency.get(i));
                    journeyList.put(map.getCars().get(carNo), efficiency.get(i)); //problem
                    something = i;
                }
            }

            //update cars
            for (int car = 0; car <  firstLine.getVehicles(); car++) {
                if (map.getCars().get(car).hasPassenger()) {
                    map.getCars().get(car).checkMoves();
                }
                map.getCars().get(car).passengerTravel(map.getCars().get(car).getPassenger());
            }

            for (Car c: journeyList.keySet()) {
                //System.out.println("Car :" + c + "Journey : " + list.indexOf(efficiency.get(something))); //problem
            }
        }



    }
}
