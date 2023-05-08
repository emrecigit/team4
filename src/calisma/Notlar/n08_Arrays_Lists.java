package calisma.Notlar;

public class n08_Arrays_Lists {
    public static void main(String[] args) {
// Birden fazla deger iceren diziler olusturma ihtiyacı icin java da arrays kullanilir.
// Array non-primitive bir data turudur.
// Data turunun yanina veya variable adindan sonra [] bu ifade array oldugunu gosterir.
// Ornegin String[] isimler = { "Emre", "Ali", "Ahmet"}; String isimler[] = { "Emre", "Ali", "Ahmet"};gibi
// Array'i new keyword ile kullanacaksak UZUNLUGUNU yazmak zorundayiz
// String[] arr = new String[5]; gibi
// Bir array tanimlanan uzunluktan daha fazla veya az eleman alamaz.
// Bir array'i yazdirmak istersek; array'ler direk yazdirilamaz,System.out.println(isimler); yazdirmaz referansı verir
// System.out.println(Arrays.toString(isimler)); seklinde yazdirilabilir.  [Emre, Ali, Ahmet] koseli parantez ile yazdirir.
// Bir array'in tek bir elentini yazdirmak istersek ise yazdirabiliriz. -->
// System.out.println(isimler[0]); Emre yazdirabilir
// Array'deki elementlere index ile ulasiriz. isimler[0]="Recep";
// System.out.println(Arrays.toString(isimler)); -->[Recep, Ali, Ahmet] seklinde yazdirir.
// Olmayan index'e atama yaparsak ArrayIndexOfBoundsException mesaji verir.-->isimler[3]="Recep"; //ArrayIndexOfBoundsException
// Array de silme veya ekleme olmaz.
// Array'i degilde elementlerini yazdirmak istersek bir for loop ile yazdirabiliriz.
        String[] isimler = {"Emre", "Ali", "Ahmet"};
        for (int i = 0; i < isimler.length; i++) {
            System.out.print(isimler[i]+" ");
        }










    }

}
