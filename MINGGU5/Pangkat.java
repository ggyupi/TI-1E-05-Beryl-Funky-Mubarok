package MINGGU5;
import java.util.Scanner;
public class Pangkat {
    int nilai, pangkat;
    public Pangkat(int a, int n){
        nilai = a;
        pangkat = n;
    }
    static int pangkatBF(int a, int n){
        int hasil = 1;
        for(int i=0; i<n; i++){
            hasil*=a;
        }
        return hasil;
    }
    static int pangkatDC(int a, int n){
        if(n==1){
            return a;
        }else{
            if(n%2==1){
                return (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a);
            }else{
                return (pangkatDC(a,n/2)*pangkatDC(a,n/2));
        }
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("Masukkan jumlah elemen yang dihitung : ");
        int elemen = sc.nextInt();
        Pangkat[] png = new Pangkat[elemen];
        for(int i=0; i<elemen; i++){
            System.out.println("Masukkan nilai yang hendak dipangkatkan : ");
            int nilai = sc.nextInt();
            System.out.println("masukkan nilai pemangkat : ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }
        System.out.println("Pilih METODE untuk melakukan operasi pangkat : ");
        System.out.println("1. BRUTE FORCE");
        System.out.println("2. DIVIDE AND CONQUER");
        System.out.println("Pilih nomor : ");
        int nomor = sc.nextInt();
        switch (nomor) {
            case 1:
            System.out.println("HASIL PANGKAT - BRUTE FORCE");
            for(int i = 0; i<elemen; i++){
                System.out.println("Hasil dari " + png[i].nilai+
                " pangkat "+png[i].pangkat+" adalah "+
                png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }
                break;
            case 2:  
            System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
            for(int i = 0; i<elemen; i++){
                System.out.println("Hasil dari " + png[i].nilai+
                " pangkat "+png[i].pangkat+" adalah "+
                png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            }
                break;
            default:
                break;
        }
    }
}
