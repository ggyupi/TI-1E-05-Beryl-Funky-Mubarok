package MINGGU8;
import java.util.Scanner;
/**
 * PostfixMain05
 */
public class PostfixMain05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String P, Q;
        System.out.println("Masukan ekspresi matematika (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";
    
        int total = Q.length();
    
        Postfix05 post = new Postfix05(total);
        P = post.konversi(Q);
        System.out.println("Posftix: " + P);
        }
}