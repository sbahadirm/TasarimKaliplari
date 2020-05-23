package main.java.designpatterns.behavioural.command;

import java.math.BigDecimal;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class ModCommand implements Islem {

    @Override
    public BigDecimal islem(BigDecimal sayi1, BigDecimal sayi2) {
        return sayi1.remainder(sayi2);
    }
}
