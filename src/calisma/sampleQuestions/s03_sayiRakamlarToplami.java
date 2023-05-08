package calisma.sampleQuestions;

import calisma.methodOlusturmaOrnekler.m07_rakamlarToplami;

import java.util.Scanner;

public class s03_sayiRakamlarToplami {

    public static void main(String[] args) {
        // modulus ile bulma
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 3 basamakli pozitif bir tamsayi giriniz (modulus1) :");
        int ilkSayi = scan.nextInt(); //135
        int grilenSayi=ilkSayi;
        int rakam = grilenSayi % 10; //135/10==>5
        int rakamlarToplami = rakam; //5
        //==================(Rakamlar toplamına birler basamagindaki 5 i aldık
        grilenSayi = grilenSayi / 10; //135/10==>13
        rakam = grilenSayi % 10; //13/10==>3
        rakamlarToplami = rakamlarToplami + rakam; // 8
        //================(Rakamlar toplamina birler basamagindaki 3 u aldik
        grilenSayi = grilenSayi / 10;//13/10==>1
        rakam = grilenSayi % 10;//1/10==> 1 (kalan sayi 1)
        rakamlarToplami = rakamlarToplami + rakam; // 9
        System.out.println("Girilen " + ilkSayi + " sayisinin rakamlar toplami : " + rakamlarToplami);

        System.out.println("================================================================");

        // while loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun
        System.out.print("Lutfen pozitif bir tamsayi giriniz (while loop2) :");
        int sayiGir = scan.nextInt();
        int sayi = sayiGir;
        int birlerBasamak = 0;
        int toplamrakam = 0;
        while (sayi != 0) { // sayi>0 da olabilir
            birlerBasamak = sayi % 10;
            toplamrakam += birlerBasamak;
            sayi = sayi / 10;
        }
        System.out.println("Girilen " + sayiGir + " sayisinin rakamlar toplami : " + toplamrakam);

        System.out.println("================================================================");

        System.out.print("Lutfen pozitif bir tamsayi giriniz (for loop3) :");
        int sg = scan.nextInt();
        int sy = sg;
        int bb = 0;
        int tr = 0;
        int basamakSayisi=(sy+"").length(); // i nereye kadar gidecek?Bunun için basamak sayisini,
                                            // "" ile Stringe cevirip lenght() ile basamak sayisini buluyoruz.
        for (int i = 1; i <=basamakSayisi; i++) { // i nereye kadar gidecek?Bunun için basamak sayisini,
                                                  // "" ile Stringe cevirip lenght() ile basamak sayisini buluyoruz.
            bb = sy% 10;
            tr += bb;
            sy = sy / 10;
        }
        System.out.println("Girilen " + sg + " sayisinin rakamlar toplami : " + tr);

        System.out.println("================================================================");

        System.out.println(m07_rakamlarToplami.rakamlarToplami(sg)); // method cagrilarak yapildi

        System.out.println("================================================================");

    }
    }
