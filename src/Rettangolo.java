public class Rettangolo extends Forma {

    private double base;
    private double altezza;

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea(double base, double altezza) {
        return super.calcolaArea(base, altezza);
    }
}