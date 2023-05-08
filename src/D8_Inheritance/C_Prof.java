package D8_Inheritance;

public class C_Prof extends P_Doctor {
    String Biyoloji;                                              // Variable
    String Biyokimya = "Biyokimya Bilgisi iyidir";                // Variable
    static String ilac;                                           // Variable
    String unvan ;                                                // Variable
    public C_Prof(){                                              // Constructor
        //super();
        System.out.println("C_Prof Constructor");
        this.Biyoloji = "Biyolojide Uzmandir";
        this.unvan="Child Methodundan Gelen Unvan : Prof";
    }

    static {                                                       // Static Block
        ilac = "Tüm ilac gruplarini yazabilir";
    }
    public static void ameliyat(String operasyon){                 // Method1
        System.out.println("Prof Ameliyat yapabilir : "+operasyon);
    }
    public String childMethodu(){                                  // Method2
        return this.unvan;
    }
}

