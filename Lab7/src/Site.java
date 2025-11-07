public abstract class Site {
    protected double _units;
    protected double _rate;
    public static final double TAX_RATE = 0.13;

    public Site(double units, double rate) {
        this._units = units;
        this._rate = rate;
    }

    // Every subclass must implement its own billing rule
    public abstract double getBillableAmount();
}