package D7_Inheritance;

public class P_Kuslar extends GP_Hayvanlar {
    public String beslenme= "Kuslar hem ot hem etle beslenirler";
    public String hareket= "Kuslar hem yuruyerek hem uçarak hareket ederler";
    public String solunum = "Kuslar akcigerle nefes alirlar";
    public String omur = "Kuslarin ortalama omru 10 yildir";
    public String cogalma= "Kuslar yumurtayla cogalirlar";
    public static String sindirim = "Kuslarin sindirim sistemleri kuvvetli asidiktir";
    public String gaga= "Kuslarin gagalari vardir"; // Hayvalara gore Ekstra



    public void beslenme(){System.out.println("Kuslar hem ot hem etle beslenirler");}
    public void hareket(){System.out.println("Kuslar hem yuruyerek hem uçarak hareket ederler");}
    public void solunum(){System.out.println("Kuslar akcigerle nefes alirlar");}
    public void omur(){System.out.println("Kuslarin ortalama omru 10 yildir");}
    public void cogalma(){System.out.println("Kuslar yumurtayla cogalirlar");}
    public static void sindirim(){System.out.println("Kuslarin sindirim sistemleri kuvvetli asidiktir");}
    public void gaga(){System.out.println("Kuslarin gagalari vardir");} // Hayvalara gore Ekstra
}
