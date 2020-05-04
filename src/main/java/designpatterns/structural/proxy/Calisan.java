package main.java.designpatterns.structural.proxy;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Calisan {

    private String kullaniciAdi;
    private String sifre;
    private boolean isYonetici;

    public Calisan(String kullaniciAdi, String sifre, boolean isYonetici) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.isYonetici = isYonetici;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public boolean isYonetici() {
        return isYonetici;
    }

    public void setYonetici(boolean yonetici) {
        isYonetici = yonetici;
    }
}
