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
    public void calcolaArea() {
        System.out.println("L' area del Rettangolo è " + base * altezza );

    }
}

