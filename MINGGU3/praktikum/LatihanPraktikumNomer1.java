import java.util.Scanner;
class BangunRuang {
    double luasPermukaan(){
        return 0;
    }
    double hitungVolume(){
        return 0;
    }
}
class kerucut extends BangunRuang{
    public double sisiMiring;
    public double jariJari;
    public double phi = Math.PI;

    public kerucut (double sm, double r){
        sisiMiring = sm;
        jariJari = r;
    }
    double luasPermukaan(){
        return phi * sisiMiring * (jariJari + sisiMiring);
    }
    double hitungVolume(){
        return (1.0/3.0) * phi * Math.pow(jariJari, 2) * Math.sqrt(Math.pow(sisiMiring, 2)-Math.pow(jariJari, 2));
    }
}
class limasPersegi extends BangunRuang{
    public double sisiAlas;
    public double tinggi;
    public limasPersegi(double sa, double t){
        sisiAlas = sa;
        tinggi = t;
    }
    double luasPermukaan(){
        return Math.pow(sisiAlas, 2) + 4 *(0.5 * sisiAlas * Math.sqrt(Math.pow(tinggi, 2)+Math.pow(sisiAlas*0.5, 2)));
    }
    double hitungVolume(){
        return (1.0/3.0) * Math.pow(sisiAlas, 2) * tinggi;
    }
}
class bola extends BangunRuang{
    public double jariJari;
    public double phi = Math.PI;
    public bola(double r){
        jariJari = r;
    }
    double luasPermukaan(){
        return 4 * phi * Math.pow(jariJari, 2);
    }
    double hitungVolume(){
        return (4.0/3.0) * phi * Math.pow(jariJari, 3);
    }
}
public class LatihanPraktikumNomer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String garis = "------";
        BangunRuang[] brArray = new BangunRuang[3];
        for(int i = 0; i<3; i++){
            if (i==0){
                System.out.println(garis+"Kerucut"+garis);
                System.out.print("Masukkan sisi miring kerucut : ");
                double sisiMiring = sc.nextInt();
                System.out.print("Masukkan jari-jari kerucut : ");
                double jariJari = sc.nextInt();
                brArray[i] = new kerucut(sisiMiring,jariJari);
            }
            else if(i==1){
                System.out.println(garis+"Limas segi empat sama sisi"+garis);
                System.out.print("Masukkan sisi alasnya : ");
                double sisiAlas = sc.nextInt();
                System.out.print("Masukkan tingginya : ");
                double tinggi = sc.nextInt();
                brArray[i] = new limasPersegi(sisiAlas,tinggi);
            }
            else if(i==2){
                System.out.println(garis+"Bola"+garis);
                System.out.print("Masukkan jari-jari bola : ");
                double jariJari = sc.nextInt();
                brArray[i] = new bola(jariJari);
            }
            System.out.println(garis+"hasil");
            System.out.println("luas permukaan : " +brArray[i].luasPermukaan());
            System.out.println("volume : " +brArray[i].hitungVolume());
        }
}
}
    
