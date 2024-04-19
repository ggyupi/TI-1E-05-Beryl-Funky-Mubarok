package MINGGU8.LatihanPraktikum;
import java.util.Scanner;
/**
 * Utama
 */
public class Utama {

    public static void main(String[] args) {
        Gudang05 gudang = new Gudang05(7);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Lihat barang terbawah");
            System.out.println("6. Cari barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang:");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang:");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori:");
                    String kategori = scanner.nextLine();
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
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.print("Masukkan kode atau nama barang yang ingin dicari: ");
                    String keyword = scanner.nextLine();
                    Barang05 barangDicari = gudang.cariBarang(keyword);
                    if (barangDicari != null) {
                        System.out.println("Barang ditemukan: " + barangDicari.nama);
                    }
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}