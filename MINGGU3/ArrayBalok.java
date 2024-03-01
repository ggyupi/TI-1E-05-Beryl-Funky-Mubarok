class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;
    public Balok(){

    }
    public Balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    int hitungVolume(){
        return panjang * lebar * tinggi;
    }
}
public class ArrayBalok {
    public static void main(String[] args) {
        Balok[] blArray = new Balok[3];
        blArray[0] = new Balok(100, 30, 12);
        blArray[1] = new Balok(120, 40, 15);
        blArray[2] = new Balok(210, 50, 25);
        for (int i = 0; i<3; i++){
            System.out.println("Volume balok ke-"+ i +" : " +blArray[i].hitungVolume());
        }
        // main untuk menjawab soal 3-5 pada percobaan 3 jobsheet minngu ke-3
        segitiga[] sgArray = new segitiga[4];
        sgArray[0] = new segitiga(10, 4);
        sgArray[1] = new segitiga(20, 10);
        sgArray[2] = new segitiga(15, 6);
        sgArray[3] = new segitiga(25, 10);
        for (int i = 0; i<4; i++){
            System.out.println("Luas segitiga ke-" +i+ " : " + sgArray[i].hitungLuas());
            System.out.println("Keliling segitiga ke-" +i+" : "+sgArray[i].hitungKeliling());
        }
    }
}
// code untuk menjawab soal 3-5 pada percobaan 3 jobsheet minngu ke-3
class segitiga {
    public int alas;
    public int tinggi;
    public segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }
    double hitungLuas(){
        return 0.5 * alas * tinggi;
    }
    double hitungKeliling(){
        double s = alas + tinggi + Math.sqrt(alas*alas+tinggi*tinggi);
        return s;
    }
}