package calisma.methodOlusturmaOrnekler;

import java.util.Scanner;

public class m02_ikiSayiToplami {
    public static void main(String[] args) {
        // kullanicidan 2 sayi alip
        // toplamlari yazdiran bir method olusturun

        ikiSayiTopla(); // kac kere cagrilirsa  okadar calisir method lar cagrilmadan calismaz
        // class in icinde ve main method un disinda olmali
        ikiSayiTopla(); // kac kere yazildiysa islemi o kadar yapar
    }
    public static void ikiSayiTopla() {  // void sadece bir işlem yapacak veya yazdiracaksa
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen toplamak uzere sırasiyla 2 sayi giriniz!");
        System.out.print("Lutfen 1.sayiyi giriniz : ");
        double sayi1 = scan.nextDouble();
        System.out.print("Lutfen 2.sayiyi giriniz : ");
        double sayi2 = scan.nextDouble();
        System.out.println("Iki sayinin toplami : " + (sayi1 + sayi2));
    }
}