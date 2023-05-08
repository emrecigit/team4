package D8_Inheritance;

public class Gp_Intern {
    String Biyoloji;                                              // Variable
    static String ilac;                                           // Variable
    String unvan ;                                                // Variable
    public Gp_Intern(){                                           // Constructor
        System.out.println("Gp_Intern Constructor");
        this.Biyoloji = "Biyoloji Bilir";
        this.unvan = "Grand Parent Methodundan Gelen Unvan : Intern";
    }

    static {                                                       // Static Block
        ilac = "Standart ilaclari yazar";
    }
    public static void muayene(String tani){                        // Method1
        System.out.println("Intern basit muayene yapar : "+tani);
    }
    public String grandParentMethodu(){                             // Method2
        return this.unvan;
    }
}
