public class FirstLine {
    private int row;
    private int column;
    private int vehicles;
    private int ride;
    private int bonus;
    private int steps;

    public FirstLine(String[] firstLineArray) {
        row = Integer.parseInt(firstLineArray[0]);
        column = Integer.parseInt(firstLineArray[1]);
        vehicles = Integer.parseInt(firstLineArray[2]);
        ride = Integer.parseInt(firstLineArray[3]);
        bonus = Integer.parseInt(firstLineArray[4]);
        steps = Integer.parseInt(firstLineArray[5]);
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }


    public int getVehicles() {
        return vehicles;
    }

    public int getRide() {
        return ride;
    }

    public int getBonus() {
        return bonus;
    }

    public int getSteps() {
        return steps;
    }
}
