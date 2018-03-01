public class Car {
    private int currentColumn;
    private int currentRow;
    private boolean hasPassenger;
    private Passenger passenger;

    private Car() {
        this.currentColumn = 0;
        this.currentRow = 0;
        this.hasPassenger = false;
        this.passenger = null;
    }

    public void moveRight() {
        currentColumn++;
    }
    public void moveLeft() {
        currentColumn--;
    }

    public void moveUp() {
        currentRow++;
    }
    public void moveDown() {
        currentRow--;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }
    public int getCurrentRow() {
        return currentRow;
    }
    public boolean hasPassenger() {
        return hasPassenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
        hasPassenger = true;
    }

    public void dropPassenger() {
        hasPassenger = false;
    }


}