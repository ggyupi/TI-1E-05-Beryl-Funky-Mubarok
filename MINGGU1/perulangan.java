import java.util.Scanner;
/**
 * perulangan
 */
public class perulangan {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        long n = 0;
        System.out.print("Masukkan NIM : ");
        String separator = ("======================");
        long nim = input05.nextLong();
        System.out.println(separator);
        n = (nim%100);
        if (n<10){
            n+=10;
        } System.out.println("n : " + n);
        // long i=0;
        for (long i=1; i<=n; i++) {
            if(i == 6 || i == 10){
                continue;
            }if(i%2 !=0){
                System.out.print("* ");
            }else{
                System.out.print(i+" ");
                input05.close();
            }
        }
    }
}
