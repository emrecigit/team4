package D6_Inheritance;

public class runner1_DataVeConstructorAyni {
    public static void main(String[] args) {


        // Data ve Consctructor Ayni;

        //Avcı Kuslar sinifindan obje olusturuluyor.
        QC_AvcıKuslar kartalAvci= new QC_AvcıKuslar();

        // Object Uzerinden Variable;

        System.out.println(kartalAvci.beslenme); //Avci Kuslar etle beslenirler
        System.out.println(kartalAvci.hareket);  //Avci Kuslar uçarak hareket ederler
        System.out.println(kartalAvci.solunum);  //Avci Kuslarin cigerleri daha genistir
        System.out.println(kartalAvci.omur);     //Avci Kuslar uzun omurludur
        System.out.println(kartalAvci.cogalma);  //Avci Kuslar yumurta sayilari azdir
        System.out.println(kartalAvci.sindirim); //Avci Kuslarin sindirim enzimleri tüm bakterileri yok eder
        System.out.println(kartalAvci.gaga);     //Avci Kuslar sivri gagalidir
     // System.out.println(kartalAvci.pence);    //private
     // System.out.println(kartalAvci.kanat);    //can't resolve
//*************************************************************************************************
        System.out.println("1*************************************************************************");
        // Object Uzerinden Method ;

        kartalAvci.beslenme();  //Avci Kuslar etle beslenirler
        kartalAvci.hareket();   //Avci Kuslar uçarak hareket ederler
        kartalAvci.solunum();   //Avci Kuslarin cigerleri daha genistir
        kartalAvci.omur();      //Avci Kuslar uzun omurludur
        kartalAvci.cogalma();   //Avci Kuslar yumurta sayilari azdir
        kartalAvci.sindirim();  //Avci Kuslarin sindirim enzimleri tüm bakterileri yok eder
        kartalAvci.gaga();      //Avci Kuslar sivri gagalidir
    //  kartalAvci.pence();     //private
    //  kartalAvci.kanat();     //can't resolve
//=====================================================================================================
        System.out.println("2*************************************************************************");
        // Class Uzerinden Variable;

    //    System.out.println(QC_AvcıKuslar.beslenme); //static
    //    System.out.println(QC_AvcıKuslar.hareket);  //static
    //    System.out.println(QC_AvcıKuslar.solunum);  //static
    //    System.out.println(QC_AvcıKuslar.omur);     //static
    //    System.out.println(QC_AvcıKuslar.cogalma);  //static
          System.out.println(QC_AvcıKuslar.sindirim); //Avci Kuslarin sindirim enzimleri tüm bakterileri yok eder
    //    System.out.println(QC_AvcıKuslar.gaga);     //static
    //    System.out.println(QC_AvcıKuslar.pence);    //private
    //    System.out.println(QC_AvcıKuslar.kanat);    //can't resolve



//*************************************************************************************************
        System.out.println("3*************************************************************************");
        // Class Uzerinden Method ;

     //   QC_AvcıKuslar.beslenme();   //static
     //   QC_AvcıKuslar.hareket();    //static
     //   QC_AvcıKuslar.solunum();    //static
     //   QC_AvcıKuslar.omur();       //static
     //   QC_AvcıKuslar.cogalma();    //static
          QC_AvcıKuslar.sindirim();   //Avci Kuslarin sindirim enzimleri tüm bakterileri yok eder
     //   QC_AvcıKuslar.gaga();       //static
     //   QC_AvcıKuslar.pence();      // private
     //   QC_AvcıKuslar.kanat();      //can't resolve

//=====================================================================================================
//=====================================================================================================

        //Kuslar sinifindan obje olusturuluyor.
        P_Kuslar kuslar = new P_Kuslar();

        // Object Uzerinden Variable;
        System.out.println("4*************************************************************************");
        System.out.println(kuslar.beslenme);    //Kuslar hem ot hem etle beslenirler
        System.out.println(kuslar.hareket);     //Kuslar hem yuruyerek hem uçarak hareket ederler
        System.out.println(kuslar.solunum);     //Kuslar akcigerle nefes alirlar
        System.out.println(kuslar.omur);        //Kuslarin ortalama omru 10 yildir
        System.out.println(kuslar.cogalma);     //Kuslar yumurtayla cogalirlar
        System.out.println(kuslar.sindirim);    //Kuslarin sindirim sistemleri kuvvetli asidiktir
        System.out.println(kuslar.gaga);        //Kuslarin gagalari vardir
    //  System.out.println(kuslar.pence);       //can't resolve
    //  System.out.println(kuslar.kanat);       //can't resolve
//*************************************************************************************************

        // Object Uzerinden Method ;
        System.out.println("5*************************************************************************");
        kuslar.beslenme();  //Kuslar hem ot hem etle beslenirler
        kuslar.hareket();   //Kuslar hem yuruyerek hem uçarak hareket ederler
        kuslar.solunum();   //Kuslar akcigerle nefes alirlar
        kuslar.omur();      //Kuslarin ortalama omru 10 yildir
        kuslar.cogalma();   //Kuslar yumurtayla cogalirlar
        kuslar.sindirim();  //Kuslarin sindirim sistemleri kuvvetli asidiktir
        kuslar.gaga();      //Kuslarin gagalari vardir
    //   kuslar.pence();    //can't resolve
    //   kuslar.kanat();    //can't resolve
//=====================================================================================================

        // Class Uzerinden Variable;
        System.out.println("6*************************************************************************");
     //   System.out.println(P_Kuslar.beslenme);      //static
     //   System.out.println(P_Kuslar.hareket);       //static
     //   System.out.println(P_Kuslar.solunum);       //static
     //   System.out.println(P_Kuslar.omur);          //static
     //   System.out.println(P_Kuslar.cogalma);       //static
          System.out.println(P_Kuslar.sindirim);      //Kuslarin sindirim sistemleri kuvvetli asidiktir
     //   System.out.println(P_Kuslar.gaga);          //static
     //   System.out.println(P_Kuslar.pence);         //can't resolve
     //   System.out.println(P_Kuslar.kanat);         //can't resolve

//*************************************************************************************************

        // Class Uzerinden Method ;
        System.out.println("7*************************************************************************");
     //   P_Kuslar.beslenme();        //static
     //   P_Kuslar.hareket();         //static
     //   P_Kuslar.solunum();         //static
     //   P_Kuslar.omur();            //static
     //   P_Kuslar.cogalma();         //static
          P_Kuslar.sindirim();        //Kuslarin sindirim sistemleri kuvvetli asidiktir
     //   P_Kuslar.gaga();            //static
     //   P_Kuslar.pence();           //can't resolve
     //   P_Kuslar.kanat();           //can't resolve
//=====================================================================================================
//=====================================================================================================

        //Kuslar sinifindan obje olusturuluyor.
        GP_Hayvanlar hayvan = new GP_Hayvanlar();

        // Object Uzerinden Variable;
        System.out.println("8*************************************************************************");
        System.out.println(hayvan.beslenme);    //Hayvanlar beslenirler
        System.out.println(hayvan.hareket);     //Hayvanlar hareket ederler
        System.out.println(hayvan.solunum);     //Hayvanlar nefes alirlar
        System.out.println(hayvan.omur);        //Hayvanlar yasarlar ve olurler
        System.out.println(hayvan.cogalma);     //Hayvanlar cogalirlar
        System.out.println(hayvan.sindirim);    //Hayvanlarin sindirim sistemleri vardir
    //  System.out.println(hayvan.gaga);        //can't resolve
    //  System.out.println(hayvan.pence);       //can't resolve
    //  System.out.println(hayvan.kanat);       //can't resolve
//*************************************************************************************************

        // Object Uzerinden Method ;
        System.out.println("9*************************************************************************");
        hayvan.beslenme();  //Hayvanlar beslenirler
        hayvan.hareket();   //Hayvanlar hareket ederler
        hayvan.solunum();   //Hayvanlar nefes alirlar
        hayvan.omur();      //Hayvanlar yasar ve olurler
        hayvan.cogalma();   //Hayvanlar cogalirlar
        hayvan.sindirim();  //Hayvanlarin sindirim sistemleri vardir
    //  hayvan.gaga();      //can't resolve
    //  hayvan.pence();     //can't resolve
    //  hayvan.kanat();     //can't resolve
//=====================================================================================================

        // Class Uzerinden Variable;
        System.out.println("10*************************************************************************");
     //   System.out.println(GP_Hayvanlar.beslenme);  //static
     //   System.out.println(GP_Hayvanlar.hareket);   //static
     //   System.out.println(GP_Hayvanlar.solunum);   //static
     //   System.out.println(GP_Hayvanlar.omur);      //static
     //   System.out.println(GP_Hayvanlar.cogalma);   //static
          System.out.println(GP_Hayvanlar.sindirim);  //Hayvanlarin sindirim sistemleri vardir
     //   System.out.println(GP_Hayvanlar.gaga);      //can't resolve
     //   System.out.println(GP_Hayvanlar.pence);     //can't resolve
     //   System.out.println(GP_Hayvanlar.kanat);     //can't resolve

//*************************************************************************************************

        // Class Uzerinden Method ;
        System.out.println("11*************************************************************************");
     //  GP_Hayvanlar.beslenme();    //static
     //  GP_Hayvanlar.hareket();     //static
     //  GP_Hayvanlar.solunum();     //static
     //  GP_Hayvanlar.omur();        //static
     //  GP_Hayvanlar.cogalma();     //static
         GP_Hayvanlar.sindirim();    //Hayvanlarin sindirim sistemleri vardir
     //  GP_Hayvanlar.gaga();        //can't resolve
     //  GP_Hayvanlar.pence();       //can't resolve
     //  GP_Hayvanlar.kanat();       //can't resolve
    }
}
