package D7_Inheritance;

public class runner2_DataveConstructorFarkli {
    public static void main(String[] args) {


            // Data ve Consctructor Farkli;

            //Avci Kuslar sinifindan Kuslar Data Turune sahip obje olusturuluyor.

            P_Kuslar kartalAvci= new QC_AvcıKuslar();

            // Object Uzerinden Variable;

            System.out.println(kartalAvci.beslenme);  //Kuslar hem ot hem etle beslenirler
            System.out.println(kartalAvci.hareket);   //Kuslar hem yuruyerek hem uçarak hareket ederler
            System.out.println(kartalAvci.solunum);   //Kuslar akcigerle nefes alirlar
            System.out.println(kartalAvci.omur);      //Kuslarin ortalama omru 10 yildir
            System.out.println(kartalAvci.cogalma);   //Kuslar yumurtayla cogalirlar
            System.out.println(kartalAvci.sindirim);  //Kuslarin sindirim sistemleri kuvvetli asidiktir
            System.out.println(kartalAvci.gaga);      //Kuslarin gagalari vardir
         // System.out.println(kartalAvci.pence);     //can't resolve
         // System.out.println(kartalAvci.kanat);     //can't resolve
/// Object Uzerinden Method ;
            System.out.println("1**************************************************************");
            kartalAvci.beslenme();      //Avci Kuslar etle beslenirler
            kartalAvci.hareket();       //Avci Kuslar uçarak hareket ederler
            kartalAvci.solunum();       //Avci Kuslarin cigerleri daha genistir
            kartalAvci.omur();          //Avci Kuslar uzun omurludur
            kartalAvci.cogalma();       //Avci Kuslar yumurta sayilari azdir
            kartalAvci.sindirim();      //Kuslarin sindirim sistemleri kuvvetli asidiktir
            kartalAvci.gaga();          //Avci Kuslar sivri gagalidir
       //   kartalAvci.pence();         //can't resolve
       //   kartalAvci.kanat();         //can't resolve

//************************************************************************************************
            System.out.println("2**************************************************************");
            //Avci Kuslar sinifindan Hayvanlar Data Turune sahip obje olusturuluyor.

            GP_Hayvanlar kartalAvci2 = new QC_AvcıKuslar();

            // Object Uzerinden Variable;

            System.out.println(kartalAvci2.beslenme);   //Hayvanlar beslenirler
            System.out.println(kartalAvci2.hareket);    //Hayvanlar hareket ederler
            System.out.println(kartalAvci2.solunum);    //Hayvanlar nefes alirlar
            System.out.println(kartalAvci2.omur);       //Hayvanlar yasarlar ve olurler
            System.out.println(kartalAvci2.cogalma);    //Hayvanlar cogalirlar
            System.out.println(kartalAvci2.sindirim);   //Hayvanlarin sindirim sistemleri vardir
     //     System.out.println(kartalAvci2.gaga);               //can't resolve
     //     System.out.println(kartalAvci2.pence);              //can't resolve
     //     System.out.println(kartalAvci2.kanat);              //can't resolve

            // Object Uzerinden Method ;
            System.out.println("3**************************************************************");

            kartalAvci2.beslenme();             //Avci Kuslar etle beslenirler
            kartalAvci2.hareket();              //Avci Kuslar uçarak hareket ederler
            kartalAvci2.solunum();              //Avci Kuslarin cigerleri daha genistir
            kartalAvci2.omur();                 //Avci Kuslar uzun omurludur
            kartalAvci2.cogalma();              //Avci Kuslar yumurta sayilari azdir
            kartalAvci2.sindirim();             //Hayvanlarin sindirim sistemleri vardir
     //     kartalAvci2.gaga();                 //can't resolve
     //     kartalAvci2.pence();                //can't resolve
     //     kartalAvci2.kanat();                //can't resolve

//*************************************************************************************************
            System.out.println("4**************************************************************");
            //Kuslar sinifindan Hayvanlar Data Turune sahip obje olusturuluyor.

            GP_Hayvanlar kuslar = new P_Kuslar();

            // Object Uzerinden Variable;

            System.out.println(kuslar.beslenme);        //Hayvanlar beslenirler
            System.out.println(kuslar.hareket);         //Hayvanlar hareket ederler
            System.out.println(kuslar.solunum);         //Hayvanlar nefes alirlar
            System.out.println(kuslar.omur);            //Hayvanlar yasarlar ve olurler
            System.out.println(kuslar.cogalma);         //Hayvanlar cogalirlar
            System.out.println(kuslar.sindirim);        //Hayvanlarin sindirim sistemleri vardir
      //    System.out.println(kuslar.gaga);            //can't resolve
      //    System.out.println(kuslar.pence);           //can't resolve
      //    System.out.println(kuslar.kanat);           //can't resolve

            // Object Uzerinden Method ;

            System.out.println("5**************************************************************");

            kuslar.beslenme();          //Kuslar hem ot hem etle beslenirler
            kuslar.hareket();           //Kuslar hem yuruyerek hem uçarak hareket ederler
            kuslar.solunum();           //Kuslar akcigerle nefes alirlar
            kuslar.omur();              //Kuslarin ortalama omru 10 yildir
            kuslar.cogalma();           //Kuslar yumurtayla cogalirlar
            kuslar.sindirim();          //Hayvanlarin sindirim sistemleri vardir
    //      kuslar.gaga();              //can't resolve
    //      kuslar.pence();             //can't resolve
    //      kuslar.kanat();             //can't resolve

//=====================================================================================================
            System.out.println("6**************************************************************");
            // Class Uzerinden Variable;

      //      System.out.println(QC_AvcıKuslar.beslenme);         //static
      //      System.out.println(QC_AvcıKuslar.hareket);          //static
      //      System.out.println(QC_AvcıKuslar.solunum);          //static
      //      System.out.println(QC_AvcıKuslar.omur);             //static
      //      System.out.println(QC_AvcıKuslar.cogalma);          //static
              System.out.println(QC_AvcıKuslar.sindirim);         //Avci Kuslarin sindirim enzimleri tüm bakterileri yok eder
      //      System.out.println(QC_AvcıKuslar.gaga);             //static
      //      System.out.println(QC_AvcıKuslar.pence);            //private
      //      System.out.println(QC_AvcıKuslar.kanat);            //can't resolve
            System.out.println("7**************************************************************");

      //      System.out.println(P_Kuslar.beslenme);              //static
      //      System.out.println(P_Kuslar.hareket);               //static
      //      System.out.println(P_Kuslar.solunum);               //static
      //      System.out.println(P_Kuslar.omur);                  //static
      //      System.out.println(P_Kuslar.cogalma);               //static
              System.out.println(P_Kuslar.sindirim);              //Kuslarin sindirim sistemleri kuvvetli asidiktir
      //      System.out.println(P_Kuslar.gaga);                  //static
      //      System.out.println(P_Kuslar.pence);                 //can't resolve
      //      System.out.println(P_Kuslar.kanat);                 //can't resolve

            System.out.println("8**************************************************************");
      //     System.out.println(GP_Hayvanlar.beslenme);          //static
      //     System.out.println(GP_Hayvanlar.hareket);           //static
      //     System.out.println(GP_Hayvanlar.solunum);           //static
      //     System.out.println(GP_Hayvanlar.omur);              //static
      //     System.out.println(GP_Hayvanlar.cogalma);           //static
             System.out.println(GP_Hayvanlar.sindirim);          //Hayvanlarin sindirim sistemleri vardir
      //     System.out.println(GP_Hayvanlar.gaga);              //can't resolve
      //     System.out.println(GP_Hayvanlar.pence);             //can't resolve
      //     System.out.println(GP_Hayvanlar.kanat);             //can't resolve

//*************************************************************************************************
            System.out.println("9**************************************************************");
            // Class Uzerinden Method ;

      //     QC_AvcıKuslar.beslenme();                   //static
      //     QC_AvcıKuslar.hareket();                    //static
      //     QC_AvcıKuslar.solunum();                    //static
      //     QC_AvcıKuslar.omur();                       //static
      //     QC_AvcıKuslar.cogalma();                    //static
             QC_AvcıKuslar.sindirim();                   //Avci Kuslarin sindirim enzimleri tüm bakterileri yok eder
      //     QC_AvcıKuslar.gaga();                       //static
      //     QC_AvcıKuslar.pence();                      //private
      //     QC_AvcıKuslar.kanat();                      //can't resolve

            System.out.println("10**************************************************************");
      //     P_Kuslar.beslenme();                        //static
      //     P_Kuslar.hareket();                         //static
      //     P_Kuslar.solunum();                         //static
      //     P_Kuslar.omur();                            //static
      //     P_Kuslar.cogalma();                         //static
             P_Kuslar.sindirim();                        //Kuslarin sindirim sistemleri kuvvetli asidiktir
      //     P_Kuslar.gaga();                            //static
      //     P_Kuslar.pence();                           //can't resolve
      //     P_Kuslar.kanat();                           //can't resolve

            System.out.println("11**************************************************************");
     //       GP_Hayvanlar.beslenme();                    //static
     //       GP_Hayvanlar.hareket();                     //static
     //       GP_Hayvanlar.solunum();                     //static
     //       GP_Hayvanlar.omur();                        //static
     //       GP_Hayvanlar.cogalma();                     //static
              GP_Hayvanlar.sindirim();                    //Hayvanlarin sindirim sistemleri vardir
     //       GP_Hayvanlar.gaga();                        //can't resolve
     //       GP_Hayvanlar.pence();                       //can't resolve
     //       GP_Hayvanlar.kanat();                       //can't resolve

//=====================================================================================================
        }
    }
