package main.java.designpatterns.behavioural.visitor.saglikbankanligi;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Hasta {

    private String adi;
    private EnumHastalik hastalik;
    private EnumHastaDurumu durumu;

    public Hasta(String adi, EnumHastalik hastalik, EnumHastaDurumu durumu) {
        this.adi = adi;
        this.hastalik = hastalik;
        this.durumu = durumu;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public EnumHastalik getHastalik() {
        return hastalik;
    }

    public void setHastalik(EnumHastalik hastalik) {
        this.hastalik = hastalik;
    }

    public EnumHastaDurumu getDurumu() {
        return durumu;
    }

    public void setDurumu(EnumHastaDurumu durumu) {
        this.durumu = durumu;
    }
}
