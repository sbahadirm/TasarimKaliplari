package main.java.designpatterns.structural.proxy;

import java.math.BigDecimal;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class GercekYonetici implements SirketBilgileri {

    @Override
    public BigDecimal getCiro() {
        return BigDecimal.valueOf(10000);
    }
}
