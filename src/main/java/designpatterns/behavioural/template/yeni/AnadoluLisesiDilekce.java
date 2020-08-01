package main.java.designpatterns.behavioural.template.yeni;

import java.util.Date;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class AnadoluLisesiDilekce extends DevamsizlikDilekceTemplate {

    private String sinif;
    private String numara;
    private String isim;

    public AnadoluLisesiDilekce(String sinif, String numara, String isim) {
        this.sinif = sinif;
        this.numara = numara;
        this.isim = isim;
    }

    @Override
    public Date getTarih() {
        return new Date();
    }

    @Override
    public String getKurumAdi() {
        return "Çankırı Anadolu Lisesi";
    }

    @Override
    public String getSehir() {
        return "Çankırı";
    }

    @Override
    public String getSinifAdi() {
        return "12 Fen-A";
    }

    @Override
    public String getOkulNumarasi() {
        return "1093";
    }

    @Override
    public String getOgrenimYili() {
        return "2020";
    }

    @Override
    public String getYariyil() {
        return "Birinci";
    }

    @Override
    public String getOgrenciAdSoyad() {
        return "Sadık Bahadır Memiş";
    }
}
