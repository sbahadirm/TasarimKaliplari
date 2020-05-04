package main.java.designpatterns.structural.proxy;

import java.math.BigDecimal;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class YoneticiProxy implements SirketBilgileri {

    private GercekYonetici gercekYonetici;

    private String kullaniciAdi;
    private String sifre;

    public YoneticiProxy(String kullaniciAdi, String sifre) {
        this.gercekYonetici = new GercekYonetici();
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }

    private boolean isKullaniciYonetici(){

        boolean isKullaniciYonetici = false;

        boolean isKullaniciValid = CalisanUtil.isKullaniciValid(kullaniciAdi, sifre);

        if (isKullaniciValid){
            Calisan calisan = CalisanUtil.getCalisanByKullaniciAdi(kullaniciAdi);

            isKullaniciYonetici = calisan.isYonetici();
        }

        return isKullaniciYonetici;
    }

    @Override
    public BigDecimal getCiro() throws IllegalAccessException {

        boolean kullaniciYonetici = isKullaniciYonetici();

        if (kullaniciYonetici){
            return gercekYonetici.getCiro();
        } else {
            throw new IllegalAccessException();
        }

    }
}
