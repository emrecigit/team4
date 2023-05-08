package D5_Constructor;

public class D02_Constructor {
    /*
    Constructor bir Class'tan obje olusturuldugunda objeye
    ilk deger atamasini (initialize) yapmak icin kullanilir
    ilk deger atamak ve obje olusturmak icin de new keyword 'unu kullaniriz

    Constructor declaration, method'a cok benzer bu yuzden cok ozel bir method'dur diyenler de vardir
    2 Temel Ozellik mutlaka olmalidir
    * Ismı mutlaka Class ismi ile ayni olamlidir
    * Return Type'i olmamalidir
       public Ogretmen (){ }    // {} body'si vardir bos olabilir
                                // () icine de istenire parametre yazilabilir istenirse yazilmaz
                                // Access modifier constructor calismasi icin degil baska class'lardan erisim ile ilgilidir.
     */

    //Data Turu ve Class       Obje Adı     Keyword   Constructor ,olmazsa obje olusturulmaz
    //    Ogretmen               ogr1   =    new               Ogretmen();
    // <-------------Obje-------------->  <-------------Deger-------------->

    public static void main(String[] args) {
      //   Ogretmen ogr1; Java bu sekilde de obje olusturur ancak bu obje kullanilamaz
      //   System.out.println(ogr1.isim); CTE verir altini cizer
      //   Ogretmen ogr2 = null;       // null point 'a esitleyebiliriz CTE vermez ancak;
      //   System.out.println(ogr2.isim);  // RTE verir NullPointerException
      //   ogr2.isim="Ali Celik";          // RTE verir NullPointerException
      //  Sonucta kullanmak istersek bu objeyi mutlaka Constructor ile ilk degerini atamaliyiz.
      //  Constructor new keyword ile kaynak class'dan bir obje olusturacak once kaynak class'a gider
      //  kaynak class'ta belirlenen ozellikleri bize getirir ve bu ozeliikleri objeye atamamizi saglar.

        /*
        Constructor cesitleri
        1- Default constructor :
           Bir class'ta obje olusturabilmesi icin
           Java tarafindan olusturulan gorunmeyen , parametresiz bir constructor 'dir.
           Arka planda calisir , parametresi () yoktur ve body'sinde {} de asla hic bir atama (kod)  yoktur
           Default Cons.ile olusturlan objeler kaynak Class'ta ilk atanan degerlere sahip olurlar.

        2- Parametresiz Constructor :
           Defult Cons. ile ayni ozelliktedir,
           1.farkı bunu biz olustururken, default Cons.'i Java olusturur.
           2.fark ise {} icine genelde atama yapilmaz ancak istenirse yapilabilir de isim="Ahmet"; gibi;
             Ancak bu durumda bu parametresiz Cons. ile olusturulan tum objelerin ismi Ahmet olmak durumundadir.
        */
        Ogretmen ogr1 = new Ogretmen();
        System.out.println("Paremetresiz Cons.Isim : "+ogr1.isim);    // isim belirtilmedi
        System.out.println("Paremetresiz Cons.Soyisim : "+ogr1.soyIsim); // soyisim belirtilmedi
        System.out.println("Paremetresiz Cons.Brans : "+ogr1.brans);   // brans belirtilmedi
        // Kaynak Class 'taki degerler geldi eger yeni deger almasini istersek yeni deger atariz
        System.out.println("************************************************");
        ogr1.isim = "Veli";       // yeni deger atandi
        System.out.println("Yeni Deger Atama Sonrasi Paremetresiz Cons.Isim : "+ogr1.isim); // yeni deger geldi  // Veli
        System.out.println("************************************************");
        /*
        3- Parametreli Constructor :
            Cons. icinde bizim parametre olarak gonderdigimiz degerleri instance variable'lara atama yaparak
            bizi her bir deger icin tek tek atama zorunlulugundan kurtarir.
            Ogretmen Class'i icinde olusturdugumuz asagidaki parametreli Cons.goruldugu uzere variable isimleri
            kaynak Class'taki instance variable 'dan farklı olup Java bu sekilde kabul eder,
            ***Thıs. Keword***
            Eger ayni variable isimlerini kullanmak istersek this. keyword'u kullaniriz basina konuldugu
            variable'in instance variable oldugunu belirtir.
            public Ogretmen(String ism, String soyIsm, String brns) {
            isim = ism;
           soyIsim = soyIsm;
           brans = brns;
         */
        Ogretmen ogr3 = new Ogretmen("Ali","Celik","Kimya");
        System.out.println("Paremetreli Cons.Isim : "+ogr3.isim);
        System.out.println("Paremetreli Cons.Soyisim : "+ogr3.soyIsim);
        System.out.println("Paremetreli Cons.Brans : "+ogr3.brans);
        System.out.println("************************************************");
        Ogretmen ogr4 = new Ogretmen("Can","Bircan");
        System.out.println("This.Keyword'lu Paremetreli Cons.Isim : "+ogr4.isim);
        System.out.println("This.Keyword'lu Paremetreli Cons.Soyisim : "+ogr4.soyIsim);
        System.out.println("This.Keyword'lu Paremetreli Cons.Brans : "+ogr4.brans);
    }
}
