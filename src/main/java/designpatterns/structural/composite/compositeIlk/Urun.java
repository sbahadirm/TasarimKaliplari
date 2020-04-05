package main.java.designpatterns.structural.composite.compositeIlk;

import java.math.BigDecimal;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Urun {

    private String adi;
    private BigDecimal fiyat;

    public Urun(String adi, BigDecimal fiyat) {
        this.adi = adi;
        this.fiyat = fiyat;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }
}
