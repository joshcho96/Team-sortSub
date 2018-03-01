public class Passenger extends Line {

    private EarlisetStart es;
    private LatestStart ls;
    private StartingPoint sp;
    private FinishPoint fp;
    private boolean inTheCar;
    private Car car;

    Passenger(StartingPoint sp, FinishPoint fp, EarlisetStart es, LatestStart ls) {
        this.sp = sp;
        this.fp = fp;
        this.es = es;
        this.ls = ls;
        inTheCar = false;
    }

    public StartingPoint getSp() {
        return sp;
    }

    public EarlisetStart getEs() {
        return es;
    }

    public FinishPoint getFp() {
        return fp;
    }

    public LatestStart getLs() {
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
}
