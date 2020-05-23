package main.java.designpatterns.behavioural.command;

import java.math.BigDecimal;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class HesapMakinesi2 {

    public static BigDecimal islem(Islem islem, BigDecimal sayi1, BigDecimal sayi2){
        return islem.islem(sayi1, sayi2);
    }
}
