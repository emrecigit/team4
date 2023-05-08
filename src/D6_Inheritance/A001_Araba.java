package D6_Inheritance;

public class A001_Araba {
//*******************************
    private int hiz;
    public int hizx = 100;
    public static int hizy;
//******************************
    private void setHiz(int hiz) {
        this.hiz = hiz;
        System.out.println("Hiz Methodu ile : "+hiz+" olarak update edildi");
    }
    public void setHizx(int hiz) {
        hizx = hiz;
        System.out.println("Hizx Methodu ile : "+hizx+" olarak update edildi");
    }
    public static void setHizy(int hiz) {
        hizy = hiz;
        System.out.println("Hizy Static Methodu ile : "+hizy+" olarak update edildi");
    }
}
