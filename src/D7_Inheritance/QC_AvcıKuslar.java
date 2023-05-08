package D7_Inheritance;

public class QC_AvcıKuslar extends P_Kuslar {
    public String beslenme= "Avci Kuslar etle beslenirler";
    public String hareket= "Avci Kuslar uçarak hareket ederler";
    public String solunum = "Avci Kuslarin cigerleri daha genistir";
    public String omur= "Avci Kuslar uzun omurludur";
    public String cogalma= "Avci Kuslar yumurta sayilari azdir";
    public static String sindirim="Avci Kuslarin sindirim enzimleri tüm bakterileri yok eder";
    public String gaga= "Avci Kuslar sivri gagalidir";
    private String pence= "Avci Kuslar pencelidir"; // Kuslara gore Ekstra Kumes Kuslarinda Yok


    public void beslenme(){System.out.println("Avci Kuslar etle beslenirler");}
    public void hareket(){System.out.println("Avci Kuslar uçarak hareket ederler");}
    public void solunum(){System.out.println("Avci Kuslarin cigerleri daha genistir");}
    public void omur(){System.out.println("Avci Kuslar uzun omurludur");}
    public void cogalma(){System.out.println("Avci Kuslar yumurta sayilari azdir");}
    public static void sindirim(){System.out.println("Avci Kuslarin sindirim enzimleri tüm bakterileri yok eder");}
    public void gaga(){
        System.out.println("Avci Kuslar sivri gagalidir");
    }
    private void pence(){System.out.println("Avci Kuslar pencelidir");} // Kuslara gore Ekstra Kumes Kuslarinda Yok
}
