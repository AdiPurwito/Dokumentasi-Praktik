public class KalkulatorSuhu {
    // 1. Encapsulate Field: Menyembunyikan data suhu
    private double celsius;

    // 2. Replace Magic Number: Mengganti angka dengan konstanta
    private static final double FAKTOR_PENGALI = 1.8;
    private static final int TITIK_BEKU_OFFSET = 32;

    public KalkulatorSuhu(double celsius) {
        this.celsius = celsius;
    }

    // 3. Move Method: Logika konversi dipindahkan ke sini
    public double konversiKeFahrenheit() {
        return (this.celsius * FAKTOR_PENGALI) + TITIK_BEKU_OFFSET;
    }
}