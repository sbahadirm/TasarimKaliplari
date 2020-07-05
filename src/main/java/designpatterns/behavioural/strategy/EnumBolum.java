package main.java.designpatterns.behavioural.strategy;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public enum EnumBolum {
    
    SOZEL("Sözel"),
    SAYISAL("Sayısal"),
    ESIT_AGIRLIK("Eşit Ağırlık"),
    ;

    private String bolum;

    EnumBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return bolum;
    }
}
