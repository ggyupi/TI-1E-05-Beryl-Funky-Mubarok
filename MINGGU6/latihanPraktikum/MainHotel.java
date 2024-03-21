package MINGGU6.latihanPraktikum;
import java.util.Scanner;
/**
 * MainHotel
 */
public class MainHotel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelService list = new HotelService();
        Hotel H1 = new Hotel("ASIK", "Bungkus city", 500000, (byte)4);
        Hotel H2 = new Hotel("SENANG", "Galon city", 450000, (byte)3);
        Hotel H3 = new Hotel("SERU", "Shampoo city", 300000, (byte)2);
        Hotel H4 = new Hotel("GEMBIRA", "Sabun city", 250000, (byte)2);
        Hotel H5 = new Hotel("MANTAP", "Mejikom city", 400000, (byte)3);
        
        list.tambah(H1);
        list.tambah(H2);
        list.tambah(H3);
        list.tambah(H4);
        list.tambah(H5);

        System.out.println("Data penginapan sebelum sorting = ");
        list.tampil();

        while(true){

            String garis = "------------------------";
            System.out.println(garis+"\nPilih penginapan berdasarkan preferensi anda = ");
            System.out.println("1. Harga termurah");
            System.out.println("2. Rating tertinggi");
        System.out.print("Pilih nomor (1-2) = ");
        int nomor = sc.nextInt();
        switch (nomor) {
            case 1:
            System.out.println("Berikut adalah daftar dari penginapan dari hingga termurah = ");
            System.out.println("---> sorting harga berdasarkan bubblesort");
            list.bubbleSortHarga();
            list.tampil();
            System.out.println("---> sorting harga berdasarkan selectionsort");
            list.selectionSortHarga();
            list.tampil();
            break;
            case 2:
            System.out.println("Berikut adalah daftar dari penginapan dari rating tertinggi hingga terendah = ");
            System.out.println("---> sorting rating berdasarkan brute force");
            list.bubbleSortRating();
            list.tampil();
            System.out.println("---> sorting rating berdasarkan selectionsort");
            list.selectionSortRating();
            list.tampil();
            break;
            
            default:
            break;
        }
    }
    }
}