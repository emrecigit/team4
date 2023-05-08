package D6_Inheritance;

public class A001_Sonuc {
    public static void main(String[] args) {

        A001_Araba.setHizy(10); // Hizy Static Methodu ile : 10 olarak update edildi

        // Class uzerinden bir variable 'a deger atarsak
        // o class 'tan olusturulacak tum objeler'inden cagrilacak olan,
        // o variable'in degeri ayni olacaktir

        A001_Araba araba = new A001_Araba();
        A001_Araba araba1 = new A001_Araba();
        A001_Araba araba2 = new A001_Araba();

        System.out.println("Class'a  verilen hiz 10 ile araba1 objesi : "+araba1.hizy);
        System.out.println("Class'a  verilen hiz 10 ile araba2 objesi : "+araba2.hizy);

        // Obje Uzerinden  Variable ve Method Cagirma

        // Variable veya Methodun bulundugu Class'tan olusturulan
        // Obje uzerinden variable cagrildiginda; (static veya instance farketmez)
        // ya bir degere atanir kullanilir ya da ancak yazidrilir.
        // Obje uzerinden method cagrildiginda direk kullanilabilir (static veya instance farketmez)
        // Static keyword u olan variable ve methodlar obje uzerinden otomatik çıkmazlar ancak yazildiginda gelirler.


        // Obje Uzerinden  Variable Cagirma

        // araba.hiz   // private oldugu icin gelmedi

        int hizx = araba.hizx; // Atama yapilarak cagrilip kullanilabildi veya ancak yazdirilabildi
        System.out.println("Araba Class uzerinden olusturulan araba objesinin  atanmis hizx variable hizi : "+hizx);
        System.out.println("Araba Class uzerinden olusturulan araba objesinin yazdirilmis hizx hizi : "+araba.hizx);

        int hizy = araba.hizy; //// Atama yapilarak cagrilip kullanilabildi veya ancakyazdirilabildi
        System.out.println("Araba Class uzerinden olusturulan araba objesinin  atanmis (static) hizy variable hizi : "+hizy);
        System.out.println("Araba Class uzerinden olusturulan araba objesinin (static) hizy hizi : "+araba.hizy);

        System.out.println("****************************");

        // Obje Uzerinden  Method Cagirma

        // araba.setHiz // private oldugu icin gelmedi

        araba.setHizx(50); // Hizx Methodu ile: 50 olarak update edildi

        araba.setHizy(75);// Hizy Static Methodu ile: 75 olarak update edildi

        System.out.println("****************************");

        // Class Uzerinden  Variable ve Method Cagirma

        // Variable veya Methodun bulundugu Class uzerinden
        // variable cagrildiginda; (Static cagrilabilir ,instance cagrilamaz)
        // Ya bir degere atanir kullanilir ya da ancak yazidrilir.
        // Class uzerinden method cagrildiginda
        // (Static cagrilabilir ,instance cagrilamaz) direk kullanilabilir

        /* Class uzerinden bir variable 'a deger atarsak
           o class 'tan olusturulacak tum objeler'inden cagrilacak olan,
           o variable'in degeri ayni olacaktir */

        // Class Uzerinden  Variable Cagirma

        // A003_Araba.hiz    // private oldugu icin gelmedi

        // A003_Araba.hizx   // variable static olmadigi icin gelmedi

        int hizy1 = A001_Araba.hizy; // Atama yapilarak cagrilabildi ve yazdirilabildi
        System.out.println("Araba Class uzerinden cagrilip atanarak (static) hizy variable hizi : "+hizy1);
        System.out.println("Araba Class uzerinden cagrilip yazdirilan (static) hizy hizi : "+ A001_Araba.hizy);

        System.out.println("****************************");

        // Class Uzerinden  Method Cagirma

        //A003_Araba.setHiz(); // private oldugu icin gelmedi

        // A003_Araba.setHizx(50) // Method static olmadigi icin gelmedi

        A001_Araba.setHizy(75);// Hizy Static Methodu ile: 75 olarak update edildi
        System.out.println("****************************");




    }
}
