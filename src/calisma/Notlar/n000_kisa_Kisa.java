package calisma.Notlar;

import java.util.Scanner;

public class n000_kisa_Kisa {
        // data türü , variable , değer , atama , class , obje ilişkisi
        /*
                                                Data türleri
        Primitive Data Türü                                                     Non Primitve Data Turu ( Object  )
        boolean                     Boolean(Wrapper Classs)             Annotations                     Arrays
        char                        Character                   (Kodun özellik ve davranışlarını        Strings
        float ,double               Floating Point               belirten özel etiketlerdir)            Classes
        byte short int long         Integers                                                            Interfaces
                                                                                                        Enums
                                                                                                        Objects
         Non primitve data turleri  class'lardan
         (örneğin String data turu String ismli class'dan oluşturulan bir objedir) olusturulan objelerdir.
         Class'lar variable ve method'lar içerdiğinden non primitve data turleri bu variable ve methodları kullanabilir
        Java'da, bir değişken (variable) tanımlamak için öncelikle veri tipini belirtmeniz gerekir. Örneğin:
        int sayi; // int : data turu  // sayi : variable ve varible'in ismi sayi
        variable'a değer atamak için =kullanilir ve buna atama denir
        sayi=10; // sayi isimli int bir variable'ina 10 değeri atandı.
        //=============================================================================================
        Class :class anahtar kelimesi ile oluşturulan bir kalıptır (objelerin örneği) ve belirli bir veri yapısını tanımlar.
        Bu veri yapısını kullanarak oluşturulan objelerin;
        *objelerin özelliklerini tutmak icin variable kullanır Class uyesidir.
        *objelerin davranışlarını tanımlamak için methodaları kullanır Class uyesidir.

        Örneğin, bir "Ogrenci" class'ı, bir öğrencinin isminin, yaşının ve notlarının tutulduğu variable'lari içerebilir
        öğrenciye ait not eklemek veya not hesaplamak gibi davranışları tanımlayan methodları içerebilir.

        Objeler, class'larin örneğidir.
        Bir class'tan obje yaratmak, o class'in bir örneğini oluşturur.*/

        //public class Ogrenci {
        //String isim;
        //int yas;
        //public static int notekle(int sayi) {
        //    int not1 = 10;
        //    return not1;
        //}}
        //Ogrenci ogrenci1 = new Ogrenci(); //Ogrenci Class adı // ogrenci1 class'dan olusturulan obje
        //Class uyeleri olan variable ve methodlar objeler tarafından kullanilabilir,
        //Ornegin oluşturulan ogrenci1 objesi isim ve yas variable'lrına erişebilir ve notekle methodunu kullanabilir.
        //ogrenci1.isim= "Ahmet";
        //ogrenci1.yas = 18;

        /*Örneğin, yukarıda "Ogrenci" class'indan "ogrenci1" adında bir obje yaratıldı.
         Bu obje, "Ogrenci" class'inin bir örneğidir ve "isim" ve "yas" gibi variable'lari
         ve sınıfta tanımlanan notekle metodları içerir.
         */


        //bir variable hem class'in bir özelliği hem de objeye özel bir özellik olabilir

        // örneğin araba class ina ait bir variable olan uretimyili (class variaable)
        // tüm arabalar1 ,arabalar2 objeleri icin ortak aynı ozellik olabilirken;

        // marka ve model isimli variable'lar her arabalar objelerine ait farklı tanımlanabilir(instance variable)

        // bir class objenin örneği kalıbı olarak kullanilir, class'tan obje oluşturulur
        // bir obje de hem bir obje hem de bir variable olabilir (Biri hem doktor hem muzisyen hemde bir baba olabilir)
        //(Orneğin wrapper class'tan oluşturulan Character objesi hem obje hemde char değer atanan bir variable' olabilir)

        // bir variable hem bir obje hem bir variable olabilir(obje olabilmesi yönuyle class ozelliğini taşir)

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Scanner class'indan new keyword'u ile Scanner objesi oluşturulmuş
                                               // ve bu obje input variable'ina atanmıştır,ve bu şekilde
                                               // input variable 'i atama ile object halini almıştır.
        //int sayi= input.nextInt();
        //String str= input.nextLine();
        //char chr=input.next().charAt(0);
        //==============================================================================================
        /* String str= scan.nextLine() den sonra int sayi1=scan.nextint() kullanilirsa  atlama sorunu ve çözümü
         scanner adı ne tanımlandıysa ona göre örnegin scan.nextLine(); nextint() den bir alt satira yazilir.
         ya da int sayi1=scan.nextint() yerine Integer.parseInt(scanner.nextLine()); kullanılarak çözülebilir
         */
         //===================================================================================================
         //                                                 Data Casting
         //         Implicit Data Casting (Auto widening)                   Explicit Data Casting (Explicit NArroving)

        // flag sifre gibi durumlarda 3-4 sart varsa flag kullanilir

        // == non-primitive data turlerinde kullanilmaz. (equals kullanilabilir)

        // String_Manipulation da replace (regex kullanilamaz,sadece replaceAll) ve replace all tum karakterleri degistirir

        // ancak replaceAll char karakteri degistirmez

        // null pointer ile isaretlenen bir String sadece yazdirilabilir veya + ile kullanilabilir

        // index 0'dan Lenght 1 den baslar
        //=========================================================================================
        /*
        Bagimsiz if :
        sartlar birbirinden bagimsizdir
        uygun sartlar olursa tum if body'si de calisabilir
        bazen de hic bir if body'si devreye girmeyebilir.
        ancak kod kontrolu yapar sadece konsol yazdrımaz
        */
        //==================================================================================
        /*
        for i ile örneğin i+"," yazdırılırken print te son ","çıkmaması için
        2 yöntem vardır
        1.YÖNTEM:
        sayilar+=sayi+","; DİREK SAYILAR YAZDIRILMAZ
        System.out.println(sayilar.substring(0,sayilar.length()-1)); ŞEKLİNDE YAZDIRILIR
        2.YÖNTEM:
         for (int i = 0; i < valueArr.length-1 ; i++) {

                yeniValue += valueArr[i]+"-";
            }

            yeniValue += valueArr[valueArr.length-1]; // - koymamak için sadece enson elemanı "-" olmadan ekleriz





         */

    }
}
