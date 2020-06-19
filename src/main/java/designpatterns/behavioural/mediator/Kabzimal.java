package main.java.designpatterns.behavioural.mediator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Kabzimal implements Araci {

    private List<Uretici> ureticiList;
    private List<Halci> halciList;

    public Kabzimal() {
        ureticiList = new ArrayList<>();
        halciList = new ArrayList<>();
    }

    @Override
    public void ureticiEkle(Uretici uretici) {
        ureticiList.add(uretici);
    }

    @Override
    public void halciEkle(Halci halci) {
        halciList.add(halci);
    }

    @Override
    public void ureticidenAl(Uretici uretici) {

        Halci halci = enUygunHalciBul(uretici.getUrun());

        satisYap(uretici, halci);
    }

    @Override
    public void haleSat(Halci halci) {

        Uretici uretici = enUygunUreticiBul(halci.getUrun());

        satisYap(uretici, halci);
    }

    private Uretici enUygunUreticiBul(EnumUrun urun) {

        Uretici enUygunUretici = null;

        for (Uretici uretici : ureticiList) {
            if (urun.equals(uretici.getUrun())){

                BigDecimal ureticiFiyati = uretici.getFiyat();

                if (enUygunUretici == null ||
                        enUygunUretici.getFiyat().compareTo(ureticiFiyati) > 0){
                    enUygunUretici = uretici;
                }
            }
        }

        return enUygunUretici;
    }

    private Halci enUygunHalciBul(EnumUrun urun) {

        Halci enUygunHalci = null;

        for (Halci halci : halciList) {
            if (urun.equals(halci.getUrun())){

                BigDecimal ureticiFiyati = halci.getFiyat();

                if (enUygunHalci == null ||
                        enUygunHalci.getFiyat().compareTo(ureticiFiyati) < 0){
                    enUygunHalci = halci;
                }
            }
        }

        return enUygunHalci;
    }

    private void satisYap(Uretici uretici, Halci halci) {
        System.out.println(uretici.getAdi() + " isimli üretici "
                + halci.getAdi() + " isimli halciye " + uretici.getUrun().getUrun() + " sattı." );
    }
}
