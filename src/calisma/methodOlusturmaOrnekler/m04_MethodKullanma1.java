package calisma.methodOlusturmaOrnekler;

import java.util.Scanner;

public class m04_MethodKullanma1 {
    public static void main(String[] args) {
        // Kullanicidan iki pozitif tamsayi alip
        // faktoryel degerlerini toplayin

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen faktoryelini bulup toplamini alacagin ilk sayiyi giriniz : ");
        int sayi1= scan.nextInt();
        System.out.print("Lutfen faktoryelini bulup toplamini alacagin ikinci sayiyi giriniz : ");
        int sayi2= scan.nextInt();

        int sonuc=m03_FaktoryelHesapla.faktoryelHesapla(sayi1)+m03_FaktoryelHesapla.faktoryelHesapla(sayi2);
        System.out.println("\"Girilen iki sayinin faktoryellerinin toplami : \""+sonuc);
    }
}
