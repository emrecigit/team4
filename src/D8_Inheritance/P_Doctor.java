package D8_Inheritance;

public class P_Doctor extends Gp_Intern {
    String Biyoloji;                                                   // Variable
    String Biyokimya = "Biyokimya Bilgisi iyidir";                     // Variable
    static String ilac;                                                // Variable
    String unvan ;                                                     // Variable
    public P_Doctor(){                                                 // Constructor
        //super();
        System.out.println("P_Doctor Constructor");
        this.Biyoloji = "Biyoloji Bilir";
        this.unvan ="Parent Methodundan Gelen Unvan : Doctor";
    }

    static {                                                            // Static Block
        ilac = "Uzmanlik İlaclarini yazar";
    }
    public static void tahlil(String sonucOkuma){                        // Method1
        System.out.println("Doctor tahlil sonuçlarini okur : "+sonucOkuma);
    }
    public String parentMethodu(){                                       // Method2
        return this.unvan;
    }
}


