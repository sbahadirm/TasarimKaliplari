package main.java.designpatterns.structural.facade.gecikme;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class GecikmeZammiOraniEntityService {

    public BigDecimal getGecikmeZammiOran() {

        BigDecimal oran = new BigDecimal("1.6");

        oran = oran.divide(new BigDecimal(100), 4 , RoundingMode.HALF_DOWN);

        return oran;
    }
}
