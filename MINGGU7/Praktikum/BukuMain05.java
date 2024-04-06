package MINGGU7.Praktikum;
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
                String kodeBuku = s1.nextLine();
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
            while (true) {
                
                System.out.println("_________________________________________");
                System.out.println("_________________________________________");
                System.out.println("Pencarian Data : ");
                System.out.println("Masukkan Kode Buku yang dicari : ");
                System.out.print("Kode Buku :");
                String cariKode = s1.nextLine();            
                System.out.println("Masukkan Judul Buku yang dicari : ");
                System.out.print("Judul Buku :");
                String cariJudul = s1.nextLine();            
                System.out.println("-------------------------");
                System.out.println("KODE BUKU");
                System.out.println("-------------------------");
                System.out.println("menggunakan sequential Search");
                int posisi = data.findSeqSearch(cariKode);
                data.tampilPosisi(posisi);
                data.tampilData( posisi);
                // Buku05 dataBuku05 = data.FindBuku(cariKode);
            // dataBuku05.tampilDataBuku();
            System.out.println("=================================");
            System.out.println("menggunakan binary Search");
            data.insertionSortJudul();
            posisi = data.findBinarySearch(cariKode, 0, posisi);
            data.tampilPosisi(posisi);
            data.tampilData(posisi);
            System.out.println("-------------------------");
            System.out.println("JUDUL BUKU");
            System.out.println("-------------------------");
            System.out.println("menggunakan sequential Search");
            posisi = data.findSeqSearchJudul(cariJudul);
            data.tampilPosisi(posisi);
            data.tampilData( posisi);
            // Buku05 dataBuku05 = data.FindBuku(cariJudul);
            // dataBuku05.tampilDataBuku();
            System.out.println("=================================");
            System.out.println("menggunakan binary Search");
            data.insertionSortJudul();
            posisi = data.findBinarySearchJudul(cariJudul, 0, posisi);
            data.tampilPosisi(posisi);
            data.tampilData(posisi);
        }
            
        }
}