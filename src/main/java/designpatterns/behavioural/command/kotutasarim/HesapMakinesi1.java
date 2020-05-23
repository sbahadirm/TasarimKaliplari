package main.java.designpatterns.behavioural.command.kotutasarim;

import java.math.BigDecimal;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class HesapMakinesi1 {

    public static BigDecimal islem(IslemTuru islemTuru, BigDecimal sayi1, BigDecimal sayi2){

        BigDecimal sonuc = BigDecimal.ZERO;

        if (IslemTuru.TOPLAMA.equals(islemTuru)){
            sonuc = sayi1.add(sayi2);
        } else if (IslemTuru.CIKARMA.equals(islemTuru)){
            sonuc = sayi1.subtract(sayi2);
        } else if (IslemTuru.CARPMA.equals(islemTuru)){
            sonuc = sayi1.multiply(sayi2);
        } else if (IslemTuru.BOLME.equals(islemTuru)){
            sonuc = sayi1.divide(sayi2);
        } else if (IslemTuru.UST.equals(islemTuru)){
            sonuc = sayi1.pow(sayi2.intValue());
        } else if (IslemTuru.MOD.equals(islemTuru)){
            sonuc = sayi1.remainder(sayi2);
        }

        return sonuc;
    }
}
