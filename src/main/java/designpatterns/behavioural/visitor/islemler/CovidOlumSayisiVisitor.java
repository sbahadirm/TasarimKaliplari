package main.java.designpatterns.behavioural.visitor.islemler;

import main.java.designpatterns.behavioural.visitor.saglikbankanligi.*;

import java.util.List;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class CovidOlumSayisiVisitor implements Visitor {

    @Override
    public String visitHastane(Hastane hastane) {

        int hastaSayisi = hastaSayisiHesapla(hastane);

        return String.valueOf(hastaSayisi);
    }

    @Override
    public String visitIl(Il il) {
        int hastaSayisi = hastaSayisiHesapla(il);

        return String.valueOf(hastaSayisi);
    }

    @Override
    public String visitUlke(Ulke ulke) {
        int hastaSayisi = hastaSayisiHesapla(ulke);

        return String.valueOf(hastaSayisi);
    }

    private int hastaSayisiHesapla(Hastane hastane) {

        return HastaHesaplaUtil.hastaSayisiHesapla(hastane, EnumHastalik.COVID, EnumHastaDurumu.OLUM);
    }

    private int hastaSayisiHesapla(Il il) {

        List<Hastane> hastaneList = il.getHastaneList();

        int hastaSayisi = 0;
        for (Hastane hastane : hastaneList) {
            int eachHastaSayisi = hastaSayisiHesapla(hastane);

            hastaSayisi = hastaSayisi + eachHastaSayisi;
        }

        return hastaSayisi;
    }

    private int hastaSayisiHesapla(Ulke ulke) {

        List<Il> ilList = ulke.getIlList();

        int hastaSayisi = 0;
        for (Il il : ilList) {
            int eachHastaSayisi = hastaSayisiHesapla(il);

            hastaSayisi = hastaSayisi + eachHastaSayisi;
        }

        return hastaSayisi;
    }
}
