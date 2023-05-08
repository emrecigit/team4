package D6_Inheritance;

public class QC_KumesHayvanlari extends P_Kuslar{

        public String beslenme= "Kumes Kuslari otla beslenirler";
        public String hareket= "Kumes Kuslari yuruyerek hareket ederler";
        public String solunum = "Kumes Kuslarin cigerleri daha dardir";
        public String omur= "Kumes Kuslari besin icin kullanilir, max 1 senedir";
        public String cogalma= "Kumes Kuslarinin yumurta sayilari coktur";
        public static String sindirim="Avci Kuslarin sindirim enzimleri tüm bakterileri yok eder";
        public String gaga = "Kumes Kuslari kut gagalidir";
        private String kanat= "Kumes Kuslari kanatlidirlar"; // Kuslara gore Ekstra Avcı Kuslarda Yok


    public void beslenme(){System.out.println("Kumes Kuslari otla beslenirler");}
    public void hareket(){System.out.println("Kumes Kuslari yuruyerek hareket ederler");}
    public void solunum(){System.out.println("Kumes Kuslarin cigerleri daha dardir");}
    public void omur(){System.out.println("Kumes Kuslari besin icin kullanilir, max 1 senedir");}
    public void cogalma(){System.out.println("Kumes Kuslarinin yumurta sayilari coktur");}
    public static void sindirim(){System.out.println("Kumes kuslarinin sindirim sistemlerinde taslik bulunur");}
    public void gaga(){System.out.println("Kumes Kuslari kut gagalidir");}
    private void kanat(){System.out.println("Kumes Kuslari kanatlidirlar");} // Kuslara gore Ekstra Avcı Kuslarda Yok
}
