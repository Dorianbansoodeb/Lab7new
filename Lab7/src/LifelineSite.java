public class LifelineSite extends Site {

    public LifelineSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    protected double getBaseAmount() {
        return _units * _rate * 0.5;
    }

    @Override
    protected double getTaxAmount(double base) {
        return base * Site.TAX_RATE * 0.2;
    }
}