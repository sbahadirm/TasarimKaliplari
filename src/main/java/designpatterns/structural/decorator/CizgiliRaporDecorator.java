package main.java.designpatterns.structural.decorator;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class CizgiliRaporDecorator extends RaporDecorator {

    public CizgiliRaporDecorator(Rapor rapor) {
        super(rapor);
    }

    @Override
    public String getMetin() {

        String metin = super.getMetin();

        String cizgiliMetin = RaporUtil.getCizgiliMetin(metin);

        return cizgiliMetin;
    }
}
