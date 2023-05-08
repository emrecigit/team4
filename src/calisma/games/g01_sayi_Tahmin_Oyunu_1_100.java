package calisma.games;

import java.util.Random;
import java.util.Scanner;

public class g01_sayi_Tahmin_Oyunu_1_100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int maxTahmin = 10; // toplam tahmin hakkı
        int sayi = rand.nextInt(100) + 1; // rastgele bir sayı seçme

        System.out.println("1-100 arasında bir sayı seçildi, tahmin etmeye başlayın! (\n10 Tahmin hakkınız bulunmaktadir : ");

        int tahmin = 0;
        int tahminSayisi = 0;
        while (tahmin != sayi && tahminSayisi < maxTahmin) {
            System.out.print("Tahmininizi girin: ");
            tahmin = input.nextInt();
            tahminSayisi++;

            if (tahmin < sayi) {
                System.out.println("Daha büyük bir sayı girin.");
            } else if (tahmin > sayi) {
                System.out.println("Daha küçük bir sayı girin.");
            }
        }

        if (tahmin == sayi) {
            System.err.println("Tebrikler, " + tahminSayisi + " tahminde doğru sayıyı buldunuz!");
        } else {
            System.err.println("Maalesef, " + maxTahmin + " tahmin hakkınız bitti. Doğru sayı " + sayi + " idi.");
        }
    }
}

