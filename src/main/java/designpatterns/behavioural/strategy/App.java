package main.java.designpatterns.behavioural.strategy;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class App {

    public static void main(String[] args) {

        System.out.println("-------------------");
        siralamaYazdir(EnumBolum.SAYISAL);
        System.out.println("-------------------");
        siralamaYazdir(EnumBolum.ESIT_AGIRLIK);
        System.out.println("-------------------");
        siralamaYazdir(EnumBolum.SOZEL);
        System.out.println("-------------------");

    }

    private static void siralamaYazdir(EnumBolum bolum) {
        Ogrenci ogrenci = new Ogrenci(bolum);
        String oncelikSiralamasi = ogrenci.getOncelikSiralamasi();
        System.out.println(oncelikSiralamasi);
    }
}
