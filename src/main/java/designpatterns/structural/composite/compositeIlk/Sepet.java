package main.java.designpatterns.structural.composite.compositeIlk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Sepet {

    private String adi;
    private List<Urun> urunList;
    private List<Paket> paketList;
    private List<Kumanya> kumanyaList;

    public Sepet(String adi) {
        this.adi = adi;
        this.urunList = new ArrayList<>();
        this.paketList = new ArrayList<>();
        this.kumanyaList = new ArrayList<>();

    }

    public BigDecimal getToplamTutar(){

        BigDecimal toplamTutar = BigDecimal.ZERO;

        for (Urun urun : urunList) {
            toplamTutar = toplamTutar.add(urun.getFiyat());
        }

        for (Paket paket : paketList) {

            List<Urun> urunList = paket.getUrunList();

            for (Urun urun : urunList) {
                toplamTutar = toplamTutar.add(urun.getFiyat());
            }
        }

        for (Kumanya kumanya : kumanyaList) {

            List<Urun> urunList = kumanya.getUrunList();
            List<Paket> paketList = kumanya.getPaketList();

            for (Urun urun : urunList) {
                toplamTutar = toplamTutar.add(urun.getFiyat());
            }

            for (Paket paket : paketList) {
                List<Urun> urunList2 = paket.getUrunList();

                for (Urun urun : urunList2) {
                    toplamTutar = toplamTutar.add(urun.getFiyat());
                }
            }

        }

        return toplamTutar;

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
