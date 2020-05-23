package main.java.designpatterns.behavioural.command;

import java.math.BigDecimal;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public interface Islem {

    BigDecimal islem(BigDecimal sayi1, BigDecimal sayi2);
}
