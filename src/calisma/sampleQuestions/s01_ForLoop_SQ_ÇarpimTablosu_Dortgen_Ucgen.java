package calisma.sampleQuestions;

import java.util.Scanner;

public class s01_ForLoop_SQ_ÇarpimTablosu_Dortgen_Ucgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        1- Verilen satir ve sutun sayisina göre çarpim tablusu olusturun

        1 2 3 4
        2 4 6 8
        3 6 9 12
        4 8 12 16
        */
        System.out.print("Lutfen olusturulacak olan carpim tablosunun satir sayisini giriniz : ");
        int satirSayisi = scan.nextInt();
        System.out.print("Lutfen olusturulacak olan carpim tablosunun sutun sayisini giriniz : ");
        int  sutunSayisi= scan.nextInt();
        for (int i = 1; i <= satirSayisi; i++) { // satir sayisini
            for (int j = 1; j <= sutunSayisi; j++) { // sutun sayisini
                System.out.print(i * j + " ");
            }
            System.out.println(""); // bir satirdaki sutunlar bitince alt satira gecer
        }

        /*2- Verilen satir ve sutun sayisina gore
          yildizlardan bir dikdortgen olusturun
          * * * *
          * * * *
          * * * *
          * * * *
         */


        System.out.print("Lutfen *'lardan olusturulacak olan carpim tablosunun satir sayisini girinz : ");
        int satirS = scan.nextInt();
        System.out.print("Lutfen *'lardan olusturulacak olan carpim tablosunun sutun sayisini giriniz : ");
        int sutunS = scan.nextInt();
        for (int i = 1; i <= satirS; i++) { // satir sayisini
            for (int j = 1; j <= sutunS; j++) { // sutun sayisini
                System.out.print("* ");
            }
            System.out.println(""); // bir satirdaki sutunlar bitince alt satira gecer
        }


        /* 3- Verilen satir sayisina göre sayilardan oluşan bir dik ucgen olusturun
        1                   1. satir 1’den 1’e kadar yazdir ,satir numarasi kadar sutun sayisi
        1  2                2. satir 1’den 2’e kadar yazdir ,satir numarasi kadar sutun sayisi
        1  2  3             3. satir 1’den 3’e kadar yazdir ,satir numarasi kadar sutun sayisi
        1  2  3  4          4. satir 1’den 4’e kadar yazdir ,satir numarasi kadar sutun sayisi
        */

        System.out.print("Lutfen olusturulacak olan Ucgen sayısal tablonun satir sayisini giriniz : ");
        int satirSa = scan.nextInt();

        for (int k = 1; k <= satirSa; k++) {  // satirlar
            for (int l = 1; l <= k; l++) { // her satirda satir numarasi kadar sutun sayisi var
                System.out.print(l + " ");  // Sekildeki ucgen icin sutun sayisina gore yazdirilir
            }
            System.out.println("");
        }


        /*4- Verilen satir sayisina göre *yıldızlardan oluşan bir dik ucgen olusturun


         *                   1. satir 1’den 1’e kadar yazdir ,satir numarasi kadar sutun sayisi
         *  *                2. satir 1’den 2’e kadar yazdir ,satir numarasi kadar sutun sayisi
         *  *  *  *          3. satir 1’den 3’e kadar yazdir ,satir numarasi kadar sutun sayisi
         *  *  *  *  *       4. satir 1’den 4’e kadar yazdir ,satir numarasi kadar sutun sayisi
         */

        System.out.print("Lutfen olusturulacak olan * Ucgen  tablonun satir sayisini giriniz : ");
        int satirSayi = scan.nextInt();
        for (int k = 1; k <= satirSayi; k++) {  // satirlar
            for (int l = 1; l <= k; l++) { // her satirda satir numarasi kadar sutun sayisi var
                System.out.print("* ");  // Sekildeki ucgen icin sutun sayisina gore yazdirilir
            }
            System.out.println("");
        }


        /*
        5- Verilen satir sayisina göre sayilardan oluşan bir ters dik ucgen olusturun
         1  2  3  4          1. satir toplam satir sayisi kadar sutun sayisi
         1  2  3             2. satir sutun sayisi azalir
         1  2                3. satir sutun sayisi azalir
         1                   4. satir sutun sayisi azalir
         */

        System.out.print("Lutfen olusturulacak olan Ters Ucgen sayi tablonun satir sayisini giriniz : ");
        int satirSayDu = scan.nextInt();
        for (int p = satirSayDu; p>=1 ; p--) {  // satirlar
            for (int q=1; q <= p; q++) { // Sutun sayisi her satirda azalir
                System.out.print(q + " ");  // Sekildeki ucgen icin sutun sayisina gore yazdirilir
            }
            System.out.println("");
        }


        /*
        6- Verilen satir sayisina göre * yıldızlardan  oluşan bir ters dik ucgen olusturun
         *  *  *  *          1. satir toplam satir sayisi kadar sutun sayisi
         *  *  *             2. satir sutun sayisi azalir
         *  *                3. satir sutun sayisi azalir
         *                   4. satir sutun sayisi azalir
         */

        System.out.print("Lutfen olusturulacak olan Ters Ucgen * tablonun satir sayisini giriniz : ");
        int satirSayTdu = scan.nextInt();

        for (int m = satirSayTdu; m>=1; m--) {  // satirlar
            for (int n = 1; n <= m; n++) { // Sutun sayisi her satirda azalir
                System.out.print("* ");  // Sekildeki ucgen icin sutun sayisina gore yazdirilir
            }
            System.out.println("");
        }

        /*
        7- Verilen satir ve sutun sayisina göre *yıldızlardan oluşan bir eskenar ucgen olusturun

         *
         ***
         *****
         *******

         */
        System.out.print("Lutfen olusturulacak olan Eşkenar Ucgen * tablonun satir sayisini giriniz : ");
        int satirSayEu = scan.nextInt();
        System.out.print("Lutfen olusturulacak olan Eşkenar Ucgen * tablonun sutun sayisini giriniz : ");
        int sutunSayEu = scan.nextInt();
        for (int i = 1; i <= satirSayEu; i++) {
            for (int j = 1; j <= sutunSayEu; j++) {
                if (j <= satirSayEu - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


        /*
        8- Verilen satir ve sutun sayisina göre *yıldızlardan oluşan bir eskenar dörtgen olusturun
         *
         ***
         *****
         ***
         *
         */

        System.out.print("Lutfen olusturulacak olan Eşkenar Dortgen * tablonun satir sayisini giriniz : ");
        int satirSayEd = scan.nextInt();
        System.out.print("Lutfen olusturulacak olan Eşkenar Dortgen * tablonun sutun sayisini giriniz : ");
        int sutunSayEd = scan.nextInt();

        for (int i = 1; i <= satirSayEd; i++) {
            for (int j = 1; j <= sutunSayEd; j++) {
                if (j <= satirSayEd - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            for (int k = sutunSayEd; k >= 1; k--) {
                if (k > satirSayEd - i + 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}