package main.java.designpatterns.behavioural.mediator;

import java.math.BigDecimal;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public abstract class Uretici {

    private String adi;
    private EnumUrun urun;
    private BigDecimal fiyat;

    private Araci araci;

    public Uretici(String adi, EnumUrun urun, BigDecimal fiyat, Araci araci) {
        this.adi = adi;
        this.urun = urun;
        this.fiyat = fiyat;
        this.araci = araci;
    }

    public void urunSat(){
        araci.ureticidenAl(this);
    }

    public String getAdi() {
        return adi;
    }

    public EnumUrun getUrun() {
        return urun;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }
}
