import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 4. Extract Method: Memanggil method untuk menjalankan aplikasi
        jalankanAplikasi();
    }

    public static void jalankanAplikasi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam Celsius: ");

        double Celsius = scanner.nextDouble();

        // 6. Extract Class: Membuat objek dari kelas yang sudah diekstrak
        KalkulatorSuhu kalkulator = new KalkulatorSuhu(Celsius);
        double suhuFahrenheit = kalkulator.konversiKeFahrenheit();

        System.out.println("Hasil konversi ke Fahrenheit: " + suhuFahrenheit);
    }
}