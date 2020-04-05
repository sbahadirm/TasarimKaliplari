package main.java.designpatterns.structural.composite.compositeSon;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Sepet {

    private String adi;
    private List<Fiyatlanabilir> fiyatlanabilirList;

    public Sepet(String adi) {
        this.adi = adi;
        this.fiyatlanabilirList = new ArrayList<>();
    }

    public BigDecimal toplamOdenecekTutar(){

        BigDecimal toplamTutar = BigDecimal.ZERO;

        for (Fiyatlanabilir fiyatlanabilir : fiyatlanabilirList) {
            toplamTutar = toplamTutar.add(fiyatlanabilir.getFiyat());
        }

        return toplamTutar;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Fiyatlanabilir> getFiyatlanabilirList() {
        return fiyatlanabilirList;
    }

    public void setFiyatlanabilirList(List<Fiyatlanabilir> fiyatlanabilirList) {
        this.fiyatlanabilirList = fiyatlanabilirList;
    }
}
