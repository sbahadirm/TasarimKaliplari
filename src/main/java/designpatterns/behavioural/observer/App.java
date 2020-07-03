package main.java.designpatterns.behavioural.observer;

import java.math.BigDecimal;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class App {

    public static void main(String[] args) {
        BigDecimal minSicaklik = BigDecimal.valueOf(23);
        BigDecimal maxSicaklik = BigDecimal.valueOf(28);

        Termometre termometre = new Termometre(minSicaklik, maxSicaklik);

        Ebeveyn anne = new Ebeveyn("Anne");
        Ebeveyn baba = new Ebeveyn("Baba");

        termometre.ekle(anne);
        termometre.ekle(baba);

        for (int i = termometre.getAnlikSicaklik().intValue(); i <= 30; i++){
            termometre.setAnlikSicaklik(BigDecimal.valueOf(i));
        }

        for (int i = termometre.getAnlikSicaklik().intValue(); i >= 22; i--){
            termometre.setAnlikSicaklik(BigDecimal.valueOf(i));
        }
    }
}
