import java.util.Scanner;

public class dragon {
    static int
        x = 5,
        y = 5,
        width = 10,
        height = 10;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Start\nKamu berada di sebuah ruangan yang penuh semak-semak\nmisimu adalah mencari sebuah peti yang berisi harta karun\n");
        while (true) {
            System.out.println("arahkan nagamu");
            System.out.println("1. atas");
            System.out.println("2. bawah");
            System.out.println("3. kiri");
            System.out.println("4. kanan");
            System.out.print("pilih nomor :");
            int n = scan.nextInt();

            switch (n) {
                case 1:
                    atas();
                    break;
                case 2:
                    bawah();
                    break;
                case 3:
                    kiri();
                    break;
                case 4:
                    kanan();
                    break;
                default:
                    System.out.print("pilih nomer");
                    break;
            }
            detectCollison(x, y);
        }
    }

    static void atas() {
        y -= 1;
    }
    static void bawah() {
        y += 1;
    }
    static void kiri() {
        x -= 1;
    }
    static void kanan() {
        x += 1;
    }

    static void detectCollison(int x, int y){
        if (width < x || x < 0 || height < y || y < 0) {
            System.out.println("wkwkwk nabrak GAME OVER");
            System.exit(0);
        } else {
            System.out.println("\nlanjutkan\n");
        }
    }
}

