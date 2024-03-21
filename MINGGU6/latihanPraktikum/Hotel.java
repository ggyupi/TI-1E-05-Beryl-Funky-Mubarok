package MINGGU6.latihanPraktikum;
/**
 * Hotel
 */
public class Hotel {

    String nama, kota;
    int harga;
    Byte bintang;

    Hotel(String n, String k, int h, byte b){
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }
    void tampil(){
        System.out.println("Nama = "+nama);
        System.out.println("Kota = "+kota);
        System.out.println("Harga = "+harga);
        System.out.println("Rating = "+bintang);
    }
}