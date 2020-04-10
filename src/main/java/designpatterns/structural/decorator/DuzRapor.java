package main.java.designpatterns.structural.decorator;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class DuzRapor implements Rapor {

    private String metin;

    public DuzRapor(String metin) {
        this.metin = metin;
    }

    @Override
    public String getMetin() {
        return metin;
    }
}
