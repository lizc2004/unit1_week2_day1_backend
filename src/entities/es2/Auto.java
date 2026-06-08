package entities.es2;

public class Auto {
    private double km;
    private double litri;

    public Auto(double km, double litri) {
        this.km = km;
        this.litri = litri;
    }

    public double kmPerLitro() {
        if (litri == 0) {
            throw new ArithmeticException("Divisione per zero: litri non può essere 0");
        }
        return km / litri;
    }

}
