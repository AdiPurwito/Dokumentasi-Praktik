public class KalkulatorSuhu {
    private double celsius;

    private static final double FACTOR_PENGALI = 1.8;
    private static final int TITIK_BEKU = 32;

    public KalkulatorSuhu(double celsius) {
        this.celsius = celsius;
    }

    public double konversiKeFahrenheit() {
        return (this.celsius * FACTOR_PENGALI) + TITIK_BEKU;
    }
}
