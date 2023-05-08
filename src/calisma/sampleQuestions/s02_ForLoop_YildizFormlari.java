package calisma.sampleQuestions;

public class s02_ForLoop_YildizFormlari {
    public static void main(String[] args) {
        System.out.println("Hello Wisequarter");
        System.out.println("Java cok kolay");
        System.out.println("");

        int sayi = 6;
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }System.out.println("");
        }
        for (int i = sayi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            } System.out.println("");
        }
    }
}
