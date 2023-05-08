package calisma.Notlar;

public class n07_scope_localVariable_classVariable {
    public static void main(String[] args) {

    //Scope bir variable’in erisilebildigi calisabildigi alandir.
    //Scope, variable’in olusturuldugu yer goz
    //onunde bulundurularak 2 ana gruba ayrilir.
    /*
    A- Local variable’lar
    Local variable’lar bir method veya kod blogu icerisinde olusturulan variable’lardir.
    Local variable’larin scope’u icerisinde olusturulduklari kod blogudur ve o blogun disinda kullanilamazlar.

            1- bir method icerisinde olusturulan variable'in scope'u o method'dur
               baska bir method'dan KULLANILAMAZ
               bu variable'lara local variable denir.
            2- Her ne kadar bir method icinde olsalar da
               Loop'larin da ayri bir scope'u vardir
               Loop icerisinde olusturulan variable'lar
               Loop disinda KULLANILAMAZLAR
            3- Local variable'lari deger atamadan olusturabiliriz
               ancak deger atamadan KULLANAMAYIZ

    B- Class level variable’lar
    Class level variable’lar method ve kod bloklarinin disinda olusturulurlar ve scope’lari tum class’dir.
    Ancak static keyword kullanilip kullanilmamasina gore erisimleri ve kullanimlari farkli olur


        Bir class icinde tum method'larin erisebilecegi variable'lar istenirse
        Class Level'da (Class'in icinde ama method'larin disinda) olusturulmalidir
        1- Class Level'da olusturulan variable'larin scope'u tum class'dir
        2- Class level'da olusturulan variable'lara deger atanmasa bile
           Java onlar icin tanimlanmis DEFAULT DEGERLER atar (String(non-primitive turler icin)=null ,
           boolean=false , char="" , int=0)
        3- Class level'da olusturulan variable'lar static veya instance(static olmayan) olabilir
        4- static olarak tanimlanan variable'lar tum method'larda direk kullanilabilir
        5- method static ise, icerisine static olmayan hicbir sey almaz
        (variable static ise , static veya olmayan her methodda kullanilir
        Method static ise , icinde sadece static variable kullanilir,instance variable kullanilamaz)
                                                                                                */
        // Static variable'lar icin tavisye edilen erisim yontemi ;
        // classAdi.StaticUyeAdi(StaticUyeAdi Variable veya method adi olabilir Adoktor.fakulte gibi) seklinde yazilir,
        // bu kullanim bicimine static yontem denir.
        // Static bir variable 'in degeri degistiginde yeni atama yapidigi satirdan itibaren
        // tüm objeler icinde degisir(Hastane adı tip fakültesi gibi)
        // Static variable lar sadece class level'lard olusturulabilir,local de olusturulamazlar.

        /* Class Level Variables 3 kural:
        Kural 1-
        *Static veya Instance variable'lara deger atama mecburiyeti yoktur.
        Deger atarsak o degeri,deger atamasi yapmazsak Java default degerler atar.
        (String(non-primitive turler icin)=null ,boolean=false , char="" , int=0)

        Kural 2-
        *Static variable'lar,static olduklari icin tum class'dan direk kullanilabilirler.
        (tum static ve static olmayan method'lardan )

        *Instance variable'lar Static olmayan methodlardan direk kullanilabilirler ancak
        static olmadiklari icin static method'lardan direk kullanilamazlar, obje olusturarak kullanılabilriler.
        ( Ornegin, ADoktor dok1 =new ADoktor();  // dok1.persIsım ....gibi )

        Kural 3-
        Static variable'lar farklı bir class'dan cagrilacaksa classAdi.StaticVAriableAdi yazmamiz yeterlidir.
        (StaticUyeAdi Variable veya method adi olabilir Adoktor.fakulte gibi))
         */




   }
}