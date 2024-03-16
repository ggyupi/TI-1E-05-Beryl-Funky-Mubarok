package MINGGU5;
import java.util.Scanner;
public class sum {
    int elemen; 
    double keuntungan[], total; 
    public sum(){

    }
    public sum(int elemen){
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }
    double totalBF(double arr[]){
        for (int j=0; j<elemen; j++){
            total = total + arr[j];
        }
        return total;
    }
    double totalDC(double arr[], int l, int r){
        if(l==r){
            return arr[l];
        }else if(l<r){
            int mid = (l+r)/2;
            double lsum = totalDC(arr, l, mid-1);
            double rsum = totalDC(arr, mid+1, r);
            return lsum+rsum+arr[mid];
        }
        return 0;
    }
    public static class MainSum{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("===============================================================");
            System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
            System.out.print("Masukkan jumlah perusahaan : ");
            int jumlah = sc.nextInt();
            sum[] perusahaan = new sum[jumlah];
            for (int i = 0; i < perusahaan.length; i++) {
                System.out.println("\nPerusahaan ke-" + (i + 1) + ": ");
                System.out.print("Masukkan jumlah bulan: ");
                perusahaan[i] = new sum(sc.nextInt());
                System.out.println("=================================================================");
                for (int j = 0; j < perusahaan[i].elemen; j++) {
                    System.out.print("Masukkan untung bulanan ke-" + (j + 1) + ": ");
                    perusahaan[i].keuntungan[j] = sc.nextDouble();
                }
            }
            System.out.println("Perhitungan keuntungan setiap perusahaan: ");
            for(int i=0; i<perusahaan.length;i++){
                System.out.println("\n\nPerusahaan ke-"+(i+1));
                System.out.println("=============================================================");
                System.out.println("Algorita Brute force");
                System.out.print("Total keuntungan perusahaan selama "+perusahaan[i].elemen+" bulan adalah = "+perusahaan[i].totalBF(perusahaan[i].keuntungan));
                System.out.println("\n=============================================================");
                System.out.println("Algoritma Divide Conquer");
                System.out.print("Total keuntungan perusahaan selama "+perusahaan[i].elemen+" bulan adalah = "+perusahaan[i].totalDC(perusahaan[i].keuntungan, 0, perusahaan[i].elemen-1));
            }
        }
    }
}
