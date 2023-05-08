package D6_Inheritance;

public class A012_Encapsulatiion {
    private int satisTutari;
    private int satisMiktari;
    private int satisToplami;
    public String isim;
    private String soyIsim;

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
    }
    public void setSatisMiktari(int satisMiktari) {
        this.satisMiktari = satisMiktari;
    }
    public String getSoyisim() {
        return soyIsim;
    }
    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }
    public int getSatisToplami() {
        satisToplami = satisTutari * satisMiktari;
        return satisToplami;
    }
}

