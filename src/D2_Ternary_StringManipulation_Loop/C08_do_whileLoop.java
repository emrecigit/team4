package D2_Ternary_StringManipulation_Loop;

import java.util.Scanner;

public class C08_do_whileLoop {
    public static void main(String[] args) {
        // 1- Kullanıcının 1'den 10'a kadar olan sayılardan birini seçene kadar seçim yapmasını isteyen
        // ve 1-10 arasında seçim yaptığında işlemi durdurup kaç adet sayı seçtiğini ve bu sayıları gösteren
        // do-while döngüsü örneği
        Scanner scan = new Scanner(System.in);
        int select;
        int countsayi = 0;
        String sayilar = "";
        do {
            System.out.print(">Bir sayı seçin (Seçtiğiniz sayi 1-10 arasında bir sayı ise seçim işlemi bitecek: ");
            select = scan.nextInt();
            countsayi++;
            sayilar += select + ",";
        } while (!(select >= 1 && select <= 10));
        System.out.println("1-10 arasında seçilen ve islemi durduran sayı: " + select);
        System.out.println("İşlem durana kadar seçtiğiniz sayı adeti : " + (countsayi - 1));
        String selectstr = select + "";
        System.out.println("Bu sayilar ise sırasıyla : " + sayilar.substring(0, sayilar.length() - 2 - selectstr.length())+" sayilaridir");

        System.out.println("===================\n===================");

    }
}