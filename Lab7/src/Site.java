public abstract class Site {
    protected double _units;
    protected double _rate;
    public static final double TAX_RATE = 0.13;

    public Site(double units, double rate) {
        this._units = units;
        this._rate = rate;
    }

    // Template method
    public double getBillableAmount() {
        double base = getBaseAmount();
        double tax = getTaxAmount(base);
        return base + tax;
    }

    // Primitive operations to be implemented by subclasses
    protected abstract double getBaseAmount();
    protected abstract double getTaxAmount(double base);
}