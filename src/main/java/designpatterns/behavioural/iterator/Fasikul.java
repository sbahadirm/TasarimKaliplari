package main.java.designpatterns.behavioural.iterator;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Fasikul {

    private String adi;
    private Soru[] sorular;

    public Fasikul(String adi) {
        this.adi = adi;
        this.sorular = new Soru[10];

        sorular[0] = new Soru(6L);
        sorular[1] = new Soru(7L);
        sorular[2] = new Soru(8L);
        sorular[3] = new Soru(9L);
        sorular[4] = new Soru(10L);
        sorular[5] = new Soru(11L);
        sorular[6] = new Soru(12L);
        sorular[7] = new Soru(13L);
        sorular[8] = new Soru(14L);
        sorular[9] = new Soru(15L);
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public SoruIterator getSoruIterator() {
        return new SoruIterator(sorular);
    }

}
