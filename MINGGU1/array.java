import java.util.Scanner;
/**
 * array
 */
public class array {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        String separator = "======================";
        String huruf;
        double bobotNilai, totalNilai = 0, sks = 18;
        String[][] matKul = new String[9][4];
        double[][] angka = new double[9][3];
        matKul[1][0] = "Pancasila";
        matKul[2][0] = "Konsep Teknologi Informasi";
        matKul[3][0] = "Critical Thinking and Problem Solving";
        matKul[4][0] = "Matematika Dasar";
        matKul[5][0] = "Bahasa Inggris";
        matKul[6][0] = "Dasar Pemrograman";
        matKul[7][0] = "Praktikum Dasar Pemrograman";
        matKul[8][0] = "Keselamatan dan Kesehatan Kerja";

        matKul[0][0] = "MK";
        matKul[0][1] = "Nilai Angka";
        matKul[0][2] = "Nilai Huruf";
        matKul[0][3] = "Bobot Nilai";

        System.out.println(separator);
        System.out.println("Program Menghitung IP Semester");
        System.out.println(separator);
        for (int i = 1; i < matKul.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + matKul[i][0] + " : ");
            angka[i][0] = input05.nextDouble();
            System.out.print("Masukkan bobot sks : ");
            angka[i][1] = input05.nextDouble();
            if (angka[i][0] > 80) {
                huruf = "A";
                bobotNilai = 4;
            } else if (angka[i][0] > 73) {
                huruf = "B+";
                bobotNilai = 3.5;
            } else if (angka[i][0] > 65) {
                huruf = "B";
                bobotNilai = 3;
            } else if (angka[i][0] > 60) {
                huruf = "C+";
                bobotNilai = 2.5;
            } else if (angka[i][0] > 50) {
                huruf = "C";
                bobotNilai = 2;
            } else if (angka[i][0] > 39) {
                huruf = "D";
                bobotNilai = 1;
            } else {
                huruf = "E";
                bobotNilai = 0;
            }
            matKul[i][2] = huruf;
            angka[i][2] = bobotNilai;
        }
        for (int i = 1; i < angka.length; i++) {
            totalNilai += angka[i][2] * angka[i][1];
        }
        double totalIP = totalNilai / sks;
        System.out.println(separator);
        System.out.println("Hasil Konversi Nilai");
        System.out.println(separator);
        System.out.printf("%-40s %-14s  %-14s  %s\n", matKul[0][0], matKul[0][1], matKul[0][2], matKul[0][3]);
        for (int i = 1; i < angka.length; i++) {
            System.out.printf("%-40s %-19s  %-13s  %s\n", matKul[i][0], angka[i][0], matKul[i][2], angka[i][2]);
        }

        System.out.println(separator);
        totalIP = Math.round(totalIP * 100) / 100d;
        System.out.println("IP Semester : " + totalIP);
        input05.close();
    }
}