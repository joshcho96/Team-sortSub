public class Passenger extends Line{

    private EarliestStart es;
    private LatestFinish ls;
    private StartingPoint sp;
    private FinishPoint fp;
    private boolean inTheCar;
    private Car car;
    private int distance;
    private int finishTime;

    public int timeToFinish(int currentTime) {
         finishTime = ls.getLatestTime() - currentTime;
         return finishTime;
    }

    public int bonusTime(int currentTime) {
        return finishTime - distance;
    }



    Passenger(StartingPoint sp, FinishPoint fp, EarliestStart es, LatestFinish ls) {
        super(sp,fp,es,ls);
        this.sp = sp;
        this.fp = fp;
        this.es = es;
        this.ls = ls;
        inTheCar = false;
        distance = Math.abs(fp.getRow() - sp.getRow()) + Math.abs(fp.getColumn() - sp.getColumn());
    }

    public StartingPoint getSp() {
        return sp;
    }

    public EarliestStart getEs() {
        return es;
    }

    public FinishPoint getFp() {
        return fp;
    }

    public LatestFinish getLs() {
        return ls;
    }

    public boolean checkIfInTheCar() {
        return inTheCar;
    }

    public void ride(Car car) {
        this.car = car;
        inTheCar = true;
    }

    public void getOutFromTheCar() {
        this.car = null;
        inTheCar = false;
    }

    public int getDistance() {
        return distance;
    }
}