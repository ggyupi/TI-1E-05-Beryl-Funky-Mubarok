package MINGGU15.Praktikum2;
import java.util.Scanner;
public class GraphMain05 {
    public static void main(String[] args) throws Exception {
        Scanner sc05 = new Scanner(System.in);
        // Percobaan 1
        // Graph05 gedung = new Graph05(6);
        // gedung.addEdge(0,1,50);
        // gedung.addEdge(0,2,100);
        // gedung.addEdge(1,3,70);
        // gedung.addEdge(2,3,40);
        // gedung.addEdge(3,4,60);
        // gedung.addEdge(4,5,80);
        // gedung.degree(0);
        // gedung.printGraph();

        // gedung.removeEdge(1,3);
        // gedung.printGraph();

        // System.out.println("Masukkan gedung asal :");
        // int asal = sc05.nextInt();
        // System.out.println("Masukkan gedung tujuan :");
        // int tujuan = sc05.nextInt();
        // gedung.checkIsPathExist(asal,tujuan);

        // Percobaan 2
        GraphMatriks05 gdg = new GraphMatriks05(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.degree(0);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.degree(0);
        gdg.printGraph();
    }
}
