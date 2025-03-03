import java.util.Scanner; //Untuk membaca input pengguna
import java.time.LocalDate; //Untuk import tahun saat ini

public class Modul1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menutup scanner
        // scanner.close();

        // Menghitung umur pengguna
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin
        String jenisKelaminStr;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminStr = "Laki-laki"; //Kondisi jika inputan adalah L atau l, maka program berjalan sebagai laki-laki
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminStr = "Perempuan"; //Kondisi jika inputan adalah P atau p, maka program berjalan sebagai perempuan
        } else {
            jenisKelaminStr = "Tidak diketahui"; //Kondisi jika inputan bukan dari dua pilihan diatas, maka program akan selesai dengan text 'tidak diketahui'
        }

        // Menampilkan hasil
        System.out.println("\nData Diri:");
        System.out.printf("Nama         \t: " + nama + "\n");
        System.out.printf("Jenis Kelamin\t: " + jenisKelaminStr + "\n");
        System.out.printf("Umur         \t: " + umur + " tahun");
    }
}