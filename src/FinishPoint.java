public class FinishPoint {

    private int row;
    private int column;

    /**
     * The constructor of the FinishPoint.    
     */
    FinishPoint(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void setRow(int row) {
        this.row = row;
    }
    
    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
