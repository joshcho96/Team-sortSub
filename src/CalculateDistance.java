public class CalculateDistance {
    private StartingPoint start;
    private FinishPoint finish;

    public CalculateDistance(StartingPoint start, FinishPoint finish) {
        this.finish = finish;
        this.start = start;
    }


    public static int distance(StartingPoint start, FinishPoint finish) {
        int distance = Math.abs(finish.getRow() - start.getRow()) + Math.abs(finish.getColumn() - start.getColumn());
        return distance;
    }

}
