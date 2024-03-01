import java.util.Scanner;
public class LatihanPraktikum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BangunRuang[] brArray = new BangunRuang[3];
        System.out.println("Masukkan jenis bangun ruang untuk kotak pertama : ");
        System.out.println("1. kerucut");
        System.out.println("2. limas segi empat sama sisi");
        System.out.println("3. bola");
        System.out.print("pilih nomor :");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Masukkan sisi miring kerucut : ");
                double sisiMiring = sc.nextInt();
                System.out.println("Masukkan jari-jari kerucut : ");
                double jariJari = sc.nextInt();
                brArray
                break;
            case 2:
                limasPersegi();
                break;
            case 3:
                bola();
                break;
            default:
}
    }
}
class BangunRuang {
    public double kerucut;
    public double limasPersegi;
    public double bola;
}
class kerucut{
    public double sisiMiring;
    public double jariJari;
    public double phi = 22/7;

    public kerucut (double sm, double r){
        sisiMiring = sm;
        jariJari = r;
    }
    double luasPermukaan(){
        return phi * sisiMiring * (jariJari + sisiMiring);
    }
    double hitungVolume(){
        return 1/3 * phi * Math.pow(jariJari, 2) * Math.sqrt(Math.pow(sisiMiring, 2)*Math.pow(jariJari, 2));
    }
}