package D2_Ternary_StringManipulation_Loop;

import java.util.Scanner;

public class C05_forLoop_whileLoop_doWhileLoop {
    //for loop 'da yazdirma asamasi for loop 'dongusu icindeyse i sayisinca yazdirir,disinda 1 kez yazdirir.
    //while loop ta body calışma sayisindan 1 fazla kontrol olur
    // do while loop ta ise önce calisir kontrolu sonra yapar body calistigi sayida islem yaoar
    //do while loop 'un dezanvati ise while sarti sağlanmasa da birkez mutlaka calisir.
    // for_Loop Tercih edilir başlangıç bitiş değerleri ve artış miktarları bellidir.
    // adım sayısı ,başlangıç bitiş degerleri belli değilse while_Loop / doWhileLoop kullanılabilir
    // tekrar tekrar deger alınacaksa while_Loop / doWhileLoop kullanılabilir
    // 1 kez mutlaka çalıssın istiyorsak do while loop kullanıilir.
    public static void main(String[] args) {
        //forLoop
        // 1'den 10'a kadar olan sayıları ekrana yazdıran ve toplamlarını bulan for döngüsü örneği
        int toplam = 0;
        String sayidizisi = "";
        for (int i = 1; i <= 10; i++) {
            sayidizisi += i + ",";
            toplam += i;

        }
        System.out.print("Birden 10 'a kadar olan sayılar :" + sayidizisi.substring(0, sayidizisi.length() - 1));
        System.out.println("");
        System.out.println("For Loop ile Sayıların Toplamı = " + toplam);

        System.out.println("=======================================");

        //whileLoop
        // 1'den 10'a kadar olan sayıları ekrana yazdıran while döngüsü örneği
        int i = 1;
        int topl = 0;
        while (i <= 10) {
            System.out.print(i + ",");
            topl += i;
            i++;
        }
        System.out.println("");
        System.out.println("While Loop ile Sayiların Toplam =" + topl);

        System.out.println("=======================================");

        //do whileLoop
        // 1'den 10'a kadar olan sayıları ekrana yazdıran do while döngüsü örneği
        int j = 1;
        int tplm = 0;
        do {
            System.out.print(j + ",");
            tplm += j;
            j++;
        } while (j <= 10);
        System.out.println("");
        System.out.println("do While Loop ile Sayıların toplamı: " + tplm);

    }
}