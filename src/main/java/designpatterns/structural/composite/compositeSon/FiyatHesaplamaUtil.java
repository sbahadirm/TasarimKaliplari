package main.java.designpatterns.structural.composite.compositeSon;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class FiyatHesaplamaUtil {

    public static BigDecimal getToplamUrunFiyati(List<Urun> urunList){

        BigDecimal toplamTutar = BigDecimal.ZERO;

        for (Urun urun : urunList) {
            toplamTutar = toplamTutar.add(urun.getFiyat());
        }

        return toplamTutar;
    }

    public static BigDecimal getToplamPaketFiyati(List<Paket> paketList){

        BigDecimal toplamTutar = BigDecimal.ZERO;

        for (Paket paket : paketList) {
            toplamTutar = toplamTutar.add(paket.getFiyat());
        }

        return toplamTutar;
    }
}
