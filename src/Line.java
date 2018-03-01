public class Line {

    private StartingPoint sp;
    private LatestFinish lp;
    private EarliestStart es;
    private FinishPoint fp;

    public Line(StartingPoint sp, FinishPoint fp, EarliestStart es, LatestFinish lp) {
        this.sp = sp;
        this.fp = fp;
        this.lp = lp;
        this.es = es;
    }

    public StartingPoint getSp() {
        return sp;
    }

    public LatestFinish getLp() {
        return lp;
    }

    public EarliestStart getEs() {
        return es;
    }

    public FinishPoint getFp() {
        return fp;
    }
}
