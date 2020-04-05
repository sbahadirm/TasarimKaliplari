package main.java.designpatterns.structural.composite.compositeSon;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Kumanya implements Fiyatlanabilir {

    private String adi;
    private List<Urun> urunList;
    private List<Paket> paketList;

    public Kumanya(String adi) {
        this.adi = adi;
        this.urunList = new ArrayList<>();
        this.paketList = new ArrayList<>();
    }

    @Override
    public BigDecimal getFiyat() {

        BigDecimal toplamUrunFiyati = FiyatHesaplamaUtil.getToplamUrunFiyati(urunList);
        BigDecimal toplamPaketFiyati = FiyatHesaplamaUtil.getToplamPaketFiyati(paketList);

        BigDecimal toplamFiyat = toplamUrunFiyati.add(toplamPaketFiyati);

        return toplamFiyat;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Urun> getUrunList() {
        return urunList;
    }

    public void setUrunList(List<Urun> urunList) {
        this.urunList = urunList;
    }

    public List<Paket> getPaketList() {
        return paketList;
    }

    public void setPaketList(List<Paket> paketList) {
        this.paketList = paketList;
    }
}
