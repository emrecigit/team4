package calisma.Notlar;

public class n05_MethodOverloading {
    public static void main(String[] args) {
        /*
            Bir class'da ayni isme sahip
            farkli islem yapan method'lar olabilir
            Java bu method'lardan hangisinin calisacagina
            parametrelere gore karar verir
            Bir class'da ismi ayni, parametreleri farkli method'lar olmasina
            Method OVERLOADING denir.
         */
// Method Signature : 1-Method Adı , 2-Parametrelerin sayisi 3-paremetrelerin data turu
// Method Overloadin sadece method signature degistirerek yapılır
        /*
            Java overloading kurallari
            1- isim ve parametreleri ayni olan birden fazla method olusturulamaz
            2- data turleri farkli olan parametrelerin yerlerini degistirirsek
               java yeni bir method olarak kabul eder (int, double) (double,int)
            Overloading olan class'larda
            Java hangi method'un calistirilacagina su sekilde karar verir
            1- cagrilan isimde method var mi ? //topla
            2- method call'da kullanilan arguments (parantez içine yazılanlar) ile method'lardaki
               parametrelerin (parantez içine yazılanlar) %100 uyumlu oldugu var mi ? // (int a , int b)
            3- argument ile parametre ayni olmasa bile
               verilen argumentleri kabul edecek parametre var mi ? // char variable'lar ASCII tablosuna göre int davranabilir
            4- Casting ile birden fazla method'u kullanabiliyorsa
               daha az casting ile calisacak method'u kullanir

         */
    }
}
