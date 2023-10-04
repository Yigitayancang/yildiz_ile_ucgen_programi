import java.util.Scanner;
public class ödev {
    public static void main(String[] args) {
        // kullanıcı verisi 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elmasın yüksekliğini girin (tek sayı olmalı): ");
        int yukseklik = scanner.nextInt();
        if (yukseklik % 2 == 0) {
            System.out.println("Hatalı giriş: Yükseklik tek bir sayı olmalıdır.");
            return;
        }
        int ortaSira = (yukseklik / 2) + 1;
        // Elmasın üst yarısı
        for (int i = 1; i <= ortaSira; i++) {
            for (int j = 1; j <= ortaSira - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Elmasın alt yarısı
        for (int i = ortaSira - 1; i >= 1; i--) {
            for (int j = 1; j <= ortaSira - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
