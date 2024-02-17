import java.util.Scanner;
/**
 * pemilihan
 */
public class pemilihan {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        String separator = "======================";
        System.out.println("Program menghitung nilai akhir");
        System.out.println(separator);
        System.out.print("Masukkan nilai tugas : ");
        float tugas = input05.nextFloat();
        System.out.print("Masukkan nilai kuis : ");
        float kuis = input05.nextFloat();
        System.out.print("Masukkan nilai uts : ");
        float uts = input05.nextFloat();
        System.out.print("Masukkan nilai uas : ");
        float uas = input05.nextFloat();
        System.out.println(separator);
        System.out.println(separator);
        if (tugas <= 100 && kuis <= 100 && uts <= 100 && uas <= 100) {
            float nilaiAkhir = (tugas * 0.2F) + (kuis * 0.2F) + (uts * 0.3F) + (uas * 0.3F);
            String huruf;
        if (nilaiAkhir > 80) {
            huruf = "A";           
        } else if (nilaiAkhir > 73) {
            huruf = "B+";
        } else if (nilaiAkhir > 65) {
            huruf = "B";           
        } else if (nilaiAkhir > 60) {
            huruf = "C+";           
        } else if (nilaiAkhir > 50) {
            huruf = "C";           
        }else if (nilaiAkhir > 39) {
            huruf = "D";           
        }else {
            huruf = "E";
        }
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + huruf);
            System.out.println(separator);
            System.out.println(separator);           
            input05.close();
            
            if (nilaiAkhir > 50) {
                System.out.println("Selamat anda lulus");
            } else {
                System.out.println("Maaf anda tidak lulus");
            }
        } else {
            System.out.println("Nilai tidak valid");
            System.out.println(separator);
            System.out.println(separator);
        }
    }
}
