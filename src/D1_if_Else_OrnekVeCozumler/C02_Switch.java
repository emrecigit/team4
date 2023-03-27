package D1_if_Else_OrnekVeCozumler;

import java.util.Scanner;

public class C02_Switch {
    public static void main(String[] args) {

    //1-     Kullanıcının girdiği ay numarasına göre ayın adını ekrana yazdıran bir program yazın.
Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir ay numarası giriniz :");

        int ay = scan.nextInt();

        switch (ay) {

            case 1:
                System.out.println("Ocak");
            break;

            case 2:
                System.out.println("Subat");
            break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasimn");
                break;
            case 12:
                System.out.println("Aralik");
                break;
            default :
                System.out.println("Gecersiz giriş");
                break;
        }


    //2-     Kullanıcının girdiği sayının pozitif, negatif veya sıfır olduğuna göre ekrana yazdıran bir program yazın.
        System.out.println("Lutfen bir sayı giriniz :");

        int sayi= scan.nextInt();

        switch (Integer.signum(sayi)) { // sayinin negatif pozitif veya o oldugunu gösteren fonksiyon
            case 1:
                System.out.println("Girdiginiz sayi pozitiftir");
                break;
            case -1:
                System.out.println("Girdiginiz sayi negatiftir");
                break;
            case 0:
                System.out.println("Girdiginiz sayi sıfırdır");
            break;
        }




    //3-    Kullanıcının girdiği bir işlem türüne göre
    //      iki sayının toplamını, çarpımını, farkını veya bölümünü hesaplayan bir program yazın.

       System.out.println("Lutfen bir işlem türü giriniz (+ , - , * ; / :");

        char islem =scan.next().charAt(0);
        System.out.println("Lutfen birinci sayiyi giriniz :");
        double sayi1 = scan.nextDouble();
        System.out.println("Lutfen ikinci sayiyi giriniz :");
        double sayi2 = scan.nextDouble();

        switch ( islem) {

            case '+':
                System.out.println("Toplam ="+(sayi1+sayi2));
                break;
            case '-'  :
                System.out.println("Fark ="+(sayi1-sayi2));
                break;
            case '*'   :
                System.out.println("Carpim ="+(sayi1*sayi2));
                break;
            case '/' :
                System.out.println("Bolum ="+(sayi1/sayi2));
                break;
        }


    //4- Kullanıcının girdiği bir sayının çift mi tek mi olduğunu ekrana yazdıran bir program yazın.System.out.print("Lütfen bir sayı girin: ");

        System.out.println("Lutfen bir sayi giriniz :");
        int sayii= scan.nextInt();

        switch (sayii %2) {

            case 0:
                System.out.println(sayii+" çift bir sayidir");
                break;
            case 1:
                System.out.println(sayii+" tek bir sayidir ");
                break;
        }
    }
}
