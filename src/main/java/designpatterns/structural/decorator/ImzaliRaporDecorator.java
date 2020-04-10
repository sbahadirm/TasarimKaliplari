package main.java.designpatterns.structural.decorator;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class ImzaliRaporDecorator extends RaporDecorator {

    public ImzaliRaporDecorator(Rapor rapor) {
        super(rapor);
    }

    @Override
    public String getMetin() {

        String metin = super.getMetin();

        String imzaliMetin = RaporUtil.sonaImzaliMetinEkle(metin);

        return imzaliMetin;
    }
}
