package MINGGU7;
import java.util.Scanner;
/**
 * BukuMain05
 */
public class BukuMain05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku05 data = new PencarianBuku05();
        int jumBuku = 5;

        System.out.println("==============================================");
        System.out.println("Masukkan data Buku secara Urut dari KodeBuku Terkecil");
        for(int i=0; i<jumBuku;i++){
            System.out.println("----------------------------");
            System.out.print("Kode Buku \t: ");
            String kodeBuku=s1.nextLine();
            System.out.print("Judul Buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t: ");
            int stock = s.nextInt();

            Buku05 m = new Buku05(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        // System.out.println("-----------------------------------------");
        // System.out.println("Data keseluruhan Mahasiswa : ");
        System.out.println("-----------------------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();
        System.out.println("_________________________________________");
        System.out.println("_________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari : ");
        System.out.print("Kode Buku :");
        String cari = s1.nextLine();            
        System.out.println("menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPosisi(cari,posisi);
        data.tampilData(cari, posisi);
        Buku05 dataBuku05 = data.FindBuku(cari);
        dataBuku05.tampilDataBuku();
        System.out.println("=================================");
        System.out.println("menggunakan binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku-1);
        data.tampilPosisi(cari,posisi);
        data.tampilData(cari,posisi);
    
    }
}
