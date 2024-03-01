import java.util.Scanner;
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
        sc.close();
}
}
    
