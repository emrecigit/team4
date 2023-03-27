package D3_MethodOlusturma_Arrays_Lists;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_MethodOlusturma {

    public static void main(String[] args) {

        // Dondurme Methodları
        System.out.println("Dondurme 1-Toplam : " + toplama(35, 67));    // Döndürme 1-Toplam
        System.out.println("Dondurme 2-Ortalama : " + ortalama(new double[]{2.4, 1.5, 5.6, 4.8})); //Dondurme 2-Ortalama
        System.out.println("Dondurme 3-TekSayi : " + tekSayi(41));        // Dondurme 3-TekSayi
        System.out.println("Döndürme 4-Çarpma : "+carpma(5, 65));  // Döndürme 4-Çarpma
        System.out.println("==========================");
        // Yazdirma Methodları
        yazdir("Yazdirma 1-Yazdır : java ne javaymış");// Yazdirma 1-Yazdır
        System.out.print("Yazdirma 2-Dizi Yazdır : ");diziYazdir(new int[]{2, 4, 5, 7}); //Yazdirma 2-Dizi Yazdır
        System.out.print("Yazdirma 3-Sayi Yazdir : ");sayiYazdir(5); // Yazdirma 3-Sayi Yazdir
        System.out.print("Yazdirma 4-BolmeSonucuYazdir : ");bolmeSonucuYazdir(25, 0);//Yazdirma 4-BolmeSonucuYazdir
    }
    // Dondurme Methodları
    public static int toplama(int sayi1, int sayi2) { // Döndürme 1-Toplam
        int toplam = sayi1 + sayi2;
        return toplam;
    }
    public static double ortalama(double[] dizi) { // Döndurme 2-Ortalama
        double toplam = 0;
        for (int i = 0; i <=dizi.length-1; i++) {
            toplam += dizi[i];
        }
        double ortalama = toplam / dizi.length;
        return ortalama;
    }
    public static boolean tekSayi(int sayi) {  // Döndürme 3-TekSayi
        if (!(sayi % 2 == 0)) {
            return true;
        }
        return false;
    }
    public static int carpma(int sayi1, int sayi2) { // Döndürme 4-Çarpma Methodu
        int carpim = sayi1 * sayi2;
        return carpim;
    }
    // Yazdirma Methodları
    public static void yazdir(String metin) { // Yazdirma 1-Yazdır
        System.out.println(metin);
    }
    public static void diziYazdir(int[] dizi) { //Yazdirma 2-Dizi Yazdır
        for (int i = 0; i <=dizi.length-1 ; i++) {
            System.out.print(dizi[i]+" ");
        }
        System.out.println();
    }
    public static void sayiYazdir(int i) { // Yazdirma 3-Sayi Yazdir
        System.out.println(i);
    }
    public static void bolmeSonucuYazdir(int sayi1, int sayi2) { //Yazdirma 4-BolmeSonucuYazdir
        if (!(sayi2==0)){
            double bolmeSonucuYazdir = (double) (sayi1 / sayi2);
            System.out.println(bolmeSonucuYazdir);
        }
        else{
            throw new ArithmeticException("Bir sayi sıfıra bolunemez");
        }
    }
}

