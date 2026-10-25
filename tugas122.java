//Kelola bioskop
import java.util.Scanner;
public class tugas122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        int jumlahTiketTerjual = 0;    
        double totalPendapatan = 0;

        System.out.println("== Sistem Penjualan Tiket Bioskop ==");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan: ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                System.out.println("Tidak ada tiket yang dibeli. Transaksi selesai.");
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Silakan masukkan jumlah tiket yang benar.");
                continue;
            }

            double totalHarga = jumlahTiket * hargaTiket;
            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15; 
                System.out.println("Diskon 15% diterapkan.");
            } else if (jumlahTiket > 4) {
                diskon = 0.10; 
                System.out.println("Diskon 10% diterapkan.");
            } else {
                diskon = 0; 
                System.out.println("Tidak ada diskon yang diterapkan.");
            }

            totalHarga = totalHarga - (totalHarga * diskon);

            jumlahTiketTerjual += jumlahTiket;
            totalPendapatan += totalHarga;

            System.out.println("Jumlah tiket yang dibeli: " + jumlahTiket);
            System.out.println("Harga tiket sebelum diskon: Rp" + (jumlahTiket * hargaTiket));
            System.out.println("Diskon yang diterapkan: " + (diskon * 100) + "%");
            System.out.println("Total harga untuk transaksi ini: Rp" + totalHarga);
        }
        System.out.println("Total tiket yang terjual: " + jumlahTiketTerjual);
        System.out.println("Total pendapatan: Rp" + totalPendapatan);   
    }
}
