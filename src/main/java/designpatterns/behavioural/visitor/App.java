package main.java.designpatterns.behavioural.visitor;

import main.java.designpatterns.behavioural.visitor.islemler.*;
import main.java.designpatterns.behavioural.visitor.saglikbankanligi.*;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class App {

    public static void main(String[] args) {

        Hasta ahmet = new Hasta("Ahmet", EnumHastalik.COVID, EnumHastaDurumu.AGIR_HASTA);
        Hasta mehmet = new Hasta("Mehmet", EnumHastalik.COVID, EnumHastaDurumu.ZATURRE);
        Hasta fatma = new Hasta("Fatma", EnumHastalik.COVID, EnumHastaDurumu.OLUM);
        Hasta nese = new Hasta("Neşe", EnumHastalik.COVID, EnumHastaDurumu.IYILESTI);

        Hastane capa = new Hastane("Çapa");
        capa.hastaEkle(ahmet);
        capa.hastaEkle(mehmet);
        capa.hastaEkle(fatma);
        capa.hastaEkle(nese);

        Il istanbul = new Il("İstanbul");
        istanbul.hastaneEkle(capa);

        Ulke turkiye = new Ulke("Türkiye");
        turkiye.ilEkle(istanbul);

        raporUlke(turkiye);
    }

    private static void raporUlke(Ulke ulke) {

        CovidHastaSayisiVisitor hastaSayisiVisitor = new CovidHastaSayisiVisitor();
        String hastaSayisi = hastaSayisiVisitor.visitUlke(ulke);

        CovidOlumSayisiVisitor olumSayisiVisitor = new CovidOlumSayisiVisitor();
        String olumSayisi = olumSayisiVisitor.visitUlke(ulke);

        CovidZaturreSayisiVisitor zaturreSayisiVisitor = new CovidZaturreSayisiVisitor();
        String zaturreSayisi = zaturreSayisiVisitor.visitUlke(ulke);

        CovidAgirHastaSayisiVisitor agirHastaSayisiVisitor = new CovidAgirHastaSayisiVisitor();
        String agirHastaSayisi = agirHastaSayisiVisitor.visitUlke(ulke);

        CovidIyilesenSayisiVisitor iyilesenSayisiVisitor = new CovidIyilesenSayisiVisitor();
        String iyilesenHastaSayisi = iyilesenSayisiVisitor.visitUlke(ulke);

        /**
         * aşağıdaki gibi ülke üzerinden de sayıları bulabilirdik.
         */
//        String hastaSayisi = ulke.accept(hastaSayisiVisitor);
//        String olumSayisi = ulke.accept(olumSayisiVisitor);
//        String zaturreSayisi = ulke.accept(zaturreSayisiVisitor);
//        String agirHastaSayisi = ulke.accept(agirHastaSayisiVisitor);
//        String iyilesenHastaSayisi = ulke.accept(iyilesenSayisiVisitor);

        /**
         * ya da ilin sayılarını yine aşağıdaki gibi bulabilirdik.
         */
//        String hastaSayisi = il.accept(hastaSayisiVisitor);
//        String olumSayisi = il.accept(olumSayisiVisitor);
//        String zaturreSayisi = il.accept(zaturreSayisiVisitor);
//        String agirHastaSayisi = il.accept(agirHastaSayisiVisitor);
//        String iyilesenHastaSayisi = il.accept(iyilesenSayisiVisitor);

        System.out.println("Hasta Sayısı: " + hastaSayisi);
        System.out.println("Ölüm Sayısı: " + olumSayisi);
        System.out.println("Zatürre Sayısı: " + zaturreSayisi);
        System.out.println("Ağır Hasta Sayısı: " + agirHastaSayisi);
        System.out.println("İyileşen Hasta Sayısı: " + iyilesenHastaSayisi);

        System.out.println(ulke.accept(iyilesenSayisiVisitor));
    }
}
