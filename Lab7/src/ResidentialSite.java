public class ResidentialSite extends Site {

    public ResidentialSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    protected double getBaseAmount() {
        return _units * _rate;
    }

    @Override
    protected double getTaxAmount(double base) {
        return base * Site.TAX_RATE;
    }
}