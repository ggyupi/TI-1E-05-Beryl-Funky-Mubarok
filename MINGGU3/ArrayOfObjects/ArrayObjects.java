package ArrayOfObjects;

import java.util.Scanner;
public class ArrayObjects {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Masukkan panjang array : ");
          int panjangArray = sc.nextInt();
          Persegipanjang[] ppArray = new Persegipanjang[panjangArray];
         for(int i = 0; i<panjangArray; i++){
              ppArray[i] = new Persegipanjang();
              System.out.println("Persegi panjang ke-"+i);
              System.out.print("Masukkan panjang : " );
              ppArray[i].panjang = sc.nextInt();
              System.out.print("Masukkan lebar : " );
              ppArray[i].lebar = sc.nextInt();
          }
          for (int i = 0; i<panjangArray; i++){
               System.out.println("Persegi panjang ke-"+i);
               System.out.println("panjang: " +ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
          }
          sc.close();
     }
}
