package MINGGU8;
import java.util.Scanner;
/**
 * Utama05
 */
public class Utama05 {

    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        System.out.print("Masukkan jumlah kapasitas gudang : ");
        Gudang05 gudang = new Gudang05(Integer.parseInt(sc05.nextLine()));

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. lihat barang teratas");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = sc05.nextInt();
            sc05.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang:");
                    int kode = sc05.nextInt();
                    sc05.nextLine(); 
                    System.out.print("Masukkan nama barang:");
                    String nama = sc05.nextLine();
                    System.out.print("Masukkan nama kategori:");
                    String kategori = sc05.nextLine();
                    Barang05 barangBaru = new Barang05(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break; 
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}