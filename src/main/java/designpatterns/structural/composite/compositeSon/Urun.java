package main.java.designpatterns.structural.composite.compositeSon;

import java.math.BigDecimal;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Urun implements Fiyatlanabilir{

    private String adi;
    private BigDecimal fiyat;

    public Urun(String adi, BigDecimal fiyat) {
        this.adi = adi;
        this.fiyat = fiyat;
    }

    @Override
    public BigDecimal getFiyat() {
        return this.fiyat;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }
}
