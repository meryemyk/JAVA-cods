import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int rastgeleSayi = (int) (Math.random() * 100) + 1;
        int tahmin;
        int deneme = 0;

        System.out.println("Sayı Tahmin Oyununa Hoş Geldiniz!");

        do {
            System.out.print("Tahmininizi girin: ");
            tahmin = scn.nextInt();
            deneme++;

            if (tahmin == rastgeleSayi) {
                System.out.println("Tebrikler!Doğru tahmin " + deneme + " denemede buldunuz.");
            }
            else if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir sayı girin.");
            }
            else {
                System.out.println("Daha küçük bir sayı girin.");
            }
        }
        while (tahmin != rastgeleSayi);

        System.out.println("Oyun bitti.");
        scn.close();

























    }
}
