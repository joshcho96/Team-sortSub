public class CalcDistance {
    private StartingPoint start;
    private FinishPoint finish;

    public CalcDistance(StartingPoint start, FinishingPoint finish) {
        this.finish = finish;
        this.start = start;
    }

    #comment
    public int Distance() {
        int distance = Math.abs(finish.getRow() - start.getRow()) + Math.abs(finish.getColumn() - start.getColumn());
        return distance;
    }



}