package D5_Constructor;

public class Ogretmen {
    String isim="isim belirtilmedi";
    String soyIsim="soyisim belirtilmedi";
    String brans="brans belirtilmedi";
    public Ogretmen() {
    }
    public Ogretmen(String ism, String soyIsm, String brns) {
        isim = ism;
        soyIsim = soyIsm;
        brans = brns;
    }
    public Ogretmen(String isim, String soyIsim) { // overloading olmamasi icin parametre sayisi azaltildi
        this.isim = isim;
        this.soyIsim = soyIsim;
    }
}
