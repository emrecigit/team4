package calisma.methodOlusturmaOrnekler;

import java.util.Scanner;

public class m05_MethodKullanma2 {
    public static void main(String[] args) {
        // Verilen bir String'in Palindrome olup olmadigini yazdirin
        // Palindrome : duzden ve tersten ayni sekilde yazilan
        // madam, 12321, kabak
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir metin giriniz : ");
        String metin = scan.nextLine();
        String tersMetin = m01_stringiTerseCevirme.stringTersineCevir(metin);
        System.out.println((metin.equals(tersMetin) ? "Girmis oldugunuz metin olan : " +"\""+ metin +"\""+" metni"+" Palindrome'dur"
                                                : "Girmis oldugunuz metin olan : "+"\""+ metin +"\""+" metni"+" Palindrome degildir"));
    }
    }

