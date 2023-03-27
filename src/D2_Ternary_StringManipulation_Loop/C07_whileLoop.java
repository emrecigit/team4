package D2_Ternary_StringManipulation_Loop;

import java.util.Scanner;

public class C07_whileLoop {
    public static void main(String[] args) {
        //1- Kullanicidan Q harfi yazana kadar girdiği ayiların toplamını döndüren bir while döngüsü yazalım
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        String input = "";

        while (!input.equalsIgnoreCase("Q")) {
            System.out.print("Bir sayı girin (Çıkmak için 'Q' harfine basın): ");
            input = scan.nextLine();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            int num = Integer.parseInt(input);
            sum += num;
        }

        System.out.println("Girdiğiniz sayıların toplamı: " + sum);

        System.out.println("===================\n===================");

        //2- kullanicidan sayı alıp  Q veya q harfini yazana kadar olan toplamları yazdıran
        // arada girdiği sayilarin toplamı kullanicinin  belirlediği bir sayiyi bulduğunda da işlemi bitrip
        // o ana kadar sayiların toplamini
        // girdiği sayıların adetini ve sayiları yazdiran do while döngüsünü paylaşır mısın

        int toplam = 0;
        String girisstr = "";
        int kacadet = 0;
        System.out.println("Toplanmak Uzere Tamsayi Girisi Uygulaması " +
                "\n(Girdiğiniz max sayıya ulastıgında yada Q ya bastıgınızda giris islemi duracak)");
        System.out.println("Sayı girisini kesmek icin ulasacağı maksimum toplam sayiyi giriniz");
        int max = scan.nextInt();
        while(true) {
            System.out.println("Lutfen toplanmak uzere bir sayi giriniz : (Q veya q tuşladığınızda isşem bitecektir ");
            girisstr = scan.next();
            if (girisstr.equalsIgnoreCase("q")) {
                System.out.println( "Çıkış yaptınız");
                break;
            }
            int girissayi = Integer.parseInt(girisstr);
            toplam += girissayi;
            kacadet++;
            girisstr += girissayi + ",";
            if (toplam > max) {
                break;
            }
        }System.out.println("Girdiğiniz sayiların toplamı : " + toplam);
    }
}





































