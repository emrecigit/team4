package calisma.Notlar;

public class n0000_OOP_Concept {
  /*
        Ide (İntegrated Devolopment Enviroment = Birleştirilmiş(Bütünleştirilmiş)Geliştirme Ortamı)
        JDK (Java Devolopment Kit) Java Dilini Derleyerek (Compile) Bilgisayarın Anlayacağı Hale Getirir
        OOP Concept Definition (Tanim,Tanimlama,Tarif,Açıklama) (Obje Odaklı(Amaçlı,Yönlü) Programlama)
******************************************************************************************************************

        OOP Concept 4 temel ozellige sahiptir.
    1-Java da Class Uyelerine ve ozelliklerine (cons ,variable ve methodlar) erisimi sınırlandırabiliriz.
       a-Access Modifier / b-Static ve Instance ozellik / c-Encapsulation
    2-Inheritance ile Daha once Olusturulmus Class'larin tum ozelliklerini (cons,variable ve methodlar) miras alabiliriz.
    3-Inheritance ile bir objeyi farklı Class'larla olan iliskisine bagli olarak farklı rollerde kullanabiliriz.
    4-Overriding(=Method Overriding) ile bir obje,parent class'lardan aldigi ozellikleri
      kendisine gore uyarlayabilir.(IMPLEMENT etmek)(Parent'deki method etkisiz hale gelir)

******************************************************************************************************************

1-Java da Class Uyelerine ve ozelliklerine (variable ve methodlar) erisimi sınırlandırabiliriz.

    1.1-Access Modifier Erisim İzni ==> *(READ-only (Okuma) ve UPDATE (Yazma) yetkisini ayırt etmez.
        1.1.a-Private A.M    : Sadece bulunulan Class'tan erisime izin verir
        1.1.b-Default A.M    : Bulunulan Class' ve Package' dan erisime izin verir.
        1.1.c-Protected A.M  : Bulunulan Class' , Package' ve Child Class'lardan erisime izin verir.
        1.1.d-Public A.M     : Proje dahilindeki heryerden ulasima izin verir.
        ***Variable ve Methodlar tum bu A.M 'leri alabilirken Class'lar sadece public ve Default alirlar.
        ***Class level de her Class uyesinin A.M 'leri olur gorunmuyorsa Java Default isaretler.

    1.2-Encapsulation ile bir Class uyesinin veya tum Class'in
    READ-only(okuma) ve UPDATE(=WRİTE-only)(Yazma) ozelliklerine erisimi sinirlandirabiliriz.
    (Immutable Class'lar da Encapsulation yardimi ile UPDATE 'lere karsi korunmustur)
    Encapsulation kullanabilmek icin;
        1.2.a-Sinirlandirilmak istenen class uyelerini private olarak tanimlariz.
        1.2.b-Class Uyelerinin sadece READ (okunmasini) istiyorsak getter methodlari olustururuz.
        1.2.c-Class Uyelerinin sadece UPDATE (yazilmasini) istiyorsak setter methodlari olustururuz.
        1.2.d-Class Uyelerinin hem READ (okunmasini) hem de UPDATE (yazilmasini) istiyorsak
        hem getter hem de setter methodlari olusturabiliriz. (Aslinda erisimi public yapmis da olur)
        Booelan data turu icin getter yerine is kullanil
******************************************************************************************************************

2-Inheritance ile Daha once Olusturulmus Class'larin tum ozelliklerini (cons,variable ve methodlar) miras alabiliriz.

    2.1-Parent Edinerek Tum Ozellikleri Kullanabilme icin Dikkat Edilecek Hususlar;

        2.1.a-Istedigi ozelligi alabilmek icin Child Class Parent'i secer.(Parent Child'i belirlemez)
            extends keyword'u ile parent secilir ve parent deki tum ozellikleri direk kullanabilir
        2.1.b-Java single inheritance 'a izin verir (tek parent secilebilir-Bir cocugun tek ailesi olur
            ama ayni parent'i birden fazla class inherit edebilir-child Class'in kardesi olabilir)
        2.1.c-Java multi-level inheritance'a da izin verir.(Birden fazla class'in ozelliklerini almak
            istersek bu durumda dikey,multi-level yani GrandParent,Parent iliskisi kurulabilir)
        2.1.d-Class uyeleri inherit edilirken ACCESS MODIFIER'i uygun olanlar inherit edilebilir.

    2.2-Bir Class ozellikleri (Constructor,Method veya Variable) inherit edilirken dikkat edilecekler***

        2.2.a-Access Modifier Ozellik;
            2.2.a.i-Private A.M Class uyeleri inherit edilemez,
            2.2.a.ii-Default A.M Class uyeleri ancak ayni Class ve Package icinden Inherit edilebilir
            2.2.a.iii-Protected A.M Class uyeleri ayni Class ve Package'lar ile Child Class'lardan inherit edilebilir.
            2.2.a.iv-Public A.M Class uyeleri Poject icindeki heryerden inherit edilebilir.

        2.2.b-Static veya Instance Ozellik;
            2.2.b.i-Parent Class Uyesi Static ise;

                ***Static keyword u olan variable ve methodlar Obje uzerinden***
                Otomatik çıkmazlar ancak yazildiginda gelirler,
                Variable lar Direk kullanilamazlar ya bir degere atanir kullanilir ya da ancak yazdrilir.
                Methodlar direk kullanilabilir.

                ***Static keyword u olan variable ve methodlar Class üzerinden***
                Otomatik cikar,
                Variable lar Direk kullanilamazlar ya bir degere atanir kullanilir ya da ancak yazdrilir.
                Methodlar direk kullanilir

            2.2.b.ii-Parent Class Uyesi Instance ise;

                ***Instance keyword u olan variable ve methodlar Obje uzerinden***
                Otomatik cikar,
                Variable lar Direk kullanilamazlar ya bir degere atanir kullanilir ya da ancak yazdrilir.
                Methodlar direk kullanilir

                ***Instance keyword u olan variable ve methodlar Class üzerinden***
                Cagrilamazlar.

!!!Class uzerinden bir variable 'a deger atarsak!!!
    O class 'tan olusturulacak olan class'in tum objeler'inden cagrilacak olan,
    O variable'in degeri ayni olacaktir

    2.3-Inheritance Yapilandirmasi temelde iki yolla olur.
        2.3.1-Surekli kullanacagimiz ozellikleri (Cons,Variable ve Method) bir DepoClass'ta toplayip
        olusturdugumuz tum Class'lari DepoClass'a Child yaparak,yapilandirilir.
        2.3.2-Ozellikleri acisindan birbirini kapsayan obje gruplarini inheritance ile yapilandirarak
        daha az kod ile istedigimiz islemleri yapabiliriz.
        Eger cok Class İceren bir Proje ise (Ornegin:Univeriste
        (*Ogrenci İsleri(=Fakulte,=Bolum),*Personel(=İdari,=Akademik,=Personel))
        Her Parent Class'a temel spesifik ozellikler (Univeriste icin;adi,adresi,etc...),
        (Ogrenci Isleri icin;Fakulte-isimleri,bolum-isimleri,ogrenci-no'lari etc.) eklenerek yapilandirilir

    2.4-Inheritance 'in Faydalari Neler*
        2.4.a-Tekrardan kurtuluruz
        2.4.b-Daha az kod yazarak islemlerimizi yapabiliriz
        2.4.c-Kolaylikla UPDATE yapabiliriz.
        2.4.d-Application Maintenance kolaylasir( Bakim ve Surdurulmesi)


*********************************************************************************************************************
3-Inheritance ile bir objeyi farklı Class'larla olan iliskisine bagli olarak farklı rollerde kullanabiliriz.
    Objenin olusturuldugu Class ve data turu olarak sececegimiz Class,
    objenin tasiyacagi ozellikleri belirler(Anneye gore evlat,kızına gore anne,ablasina gore kardes, etc.)
    Obje olusturuken kullanilan Constructor ve data turu olarak sececegimiz Class,o objenin
    hangi ozelliklerini tasiyacagini belirler.
    *Constructor objenin hangi Class'tan olusturuldugunu belirtirken
    *Data turu de Hangi Class'tan ozellik alacagini gosterir,Constructor O Class'a gidip
    Data turu yazili olan Class ve onun parentlerinin ozelliklerini objeye tasir
******************************************************************************************************************

4-Overriding(=Method Overriding) ile bir obje,parent class'lardan aldigi ozellikleri
        kendisine gore uyarlayabilir.(IMPLEMENT etmek)(Parent'deki method etkisiz hale gelir)
        Java da Child class'imizda olusturacagimiz (Parent Class'ta bulunan) AYNI ISIMDEKI method'lar ile
        Parent Class'larda varolan Method'lari kendi Class'imiza (implement edebiliriz)uyarlayabiliriz
        Bunun icin parent Class'taki ayni signature a sahip method kullanilmalidir.

    4.1-Child Class'ta olusturulacak objeler icin variable ve method Kullanimi ikiye ayrilir

        4.1.1-Data Turu ve Constructor ayni Class'a ait ise;
            Direk o Class'a gidip o Class ve parent Class'larina bakilir ve en gunceli alinir.
            (Overriding dikkate alinmaz)
        4.1.2-Data Turu ve  Constructor farkli ise;
            (*Data turu parent Class'lar olabilir ancak Constructor olusturuldugu Class'a ait olmalidir*)
            Once Data Turunun oldugu Class'a gidilip,o Class ve Parent Class'larinda aranan Class uyesi bulunur
            4.1.2.i-Aranan Class uyesi Variable ise ilk bulunan Variable'a ait deger alinir
            4.1.2.ii-Aranan Class uyesi Method ise once Data Turunun oldugu Class'a gidilip,
            o Class ve Parent Class'larinda aranan Class uyesi bulunur ilk bulunan Method calistirilmadan once
            override edilmis mi diye bakilir ,edilmisse en son override eden Method calistirilir,
            (En guncel Methodu bulmak icin objenin olusturuldugu Constructor Class'ine kadar
            Method takip edilir ve override eden en guncel Method alinir,Method hic bulunm
            ***Static Method ve Variable'lar override edilemezler,cunku objeden bagimsizdirlar.***
******************************************************************************************************************
*/
}