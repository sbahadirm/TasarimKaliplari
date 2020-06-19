package main.java.designpatterns.behavioural.mediator;

import java.math.BigDecimal;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public abstract class Halci {

    private String adi;
    private EnumUrun urun;
    private BigDecimal fiyat;

    private Araci araci;

    public Halci(String adi, EnumUrun urun, BigDecimal fiyat, Araci araci) {
        this.adi = adi;
        this.urun = urun;
        this.fiyat = fiyat;
        this.araci = araci;
    }

    public void urunAl(){
        araci.haleSat(this);
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
