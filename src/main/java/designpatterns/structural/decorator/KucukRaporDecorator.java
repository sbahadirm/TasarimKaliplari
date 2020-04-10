package main.java.designpatterns.structural.decorator;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class KucukRaporDecorator extends RaporDecorator {

    private int genislik;

    public KucukRaporDecorator(Rapor rapor) {
        super(rapor);
        this.genislik = 30;
    }

    @Override
    public String getMetin() {

        String metin = super.getMetin();

        String kucukMetin = RaporUtil.metniSigdir(metin, genislik);

        return kucukMetin;
    }
}
