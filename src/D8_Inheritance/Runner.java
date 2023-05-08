package D8_Inheritance;

public class Runner {
    public static void main(String[] args) {
        Gp_Intern gp = new Gp_Intern();
        P_Doctor p = new P_Doctor();
        C_Prof c = new C_Prof();

        System.out.println("\n");

        gp.grandParentMethodu(); // Gp_Intern Constructor
        p.grandParentMethodu();  // Gp_Intern Constructor
        p.parentMethodu();       // P_Doctor Constructor
        c.grandParentMethodu();  // Gp_Intern Constructor
        c.parentMethodu();       // P_Doctor Constructor
        c.childMethodu();        // C_Prof Constructor

    }
}
