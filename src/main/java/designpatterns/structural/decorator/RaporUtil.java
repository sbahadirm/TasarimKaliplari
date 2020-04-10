package main.java.designpatterns.structural.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class RaporUtil {

    public static String getCizgiliMetin(String metin) {

        String[] satirList = metin.split("\n");

        String cizgiliMetin = "";
        for (String eachSatir : satirList) {

            String cizgiliSatir = herSatiraBirCizgiEkle(eachSatir);

            cizgiliMetin = cizgiliMetin + cizgiliSatir;
        }

        return cizgiliMetin;
    }

    private static String herSatiraBirCizgiEkle(String eachSatir) {

        String yeniSatir;

        if (eachSatir.trim().length() == 0){
            yeniSatir = "\n";
        } else {
            yeniSatir =  "\n- " + eachSatir;
        }

        return yeniSatir;
    }

    public static String metniSigdir(String metin, int genislik) {

        String kucukSatirliMetin = "";

        String[] satirList = metin.split("\n");

        for (String eachSatir : satirList) {

            if (eachSatir.length() <= genislik){
                //aynen ekle

                kucukSatirliMetin = ekleVeYeniSatiraGec(kucukSatirliMetin, eachSatir);

            } else {
                //küçült ve öyle ekle

                List<String> parcalanmisList = parcala(eachSatir, genislik);

                for (String eachYeniSatir : parcalanmisList) {
                    kucukSatirliMetin = ekleVeYeniSatiraGec(kucukSatirliMetin, eachYeniSatir);
                }
            }
        }


        return kucukSatirliMetin;
    }

    private static String ekleVeYeniSatiraGec(String anaMetin, String eklenenMetin) {

        return anaMetin + eklenenMetin + "\n";
    }

    /**
     * genişlik = 30
     *
     * satir;
     *  1-> 45 -> {30, 15}                  -> 0,30 / 30/45
     *  2-> 25 -> {25}                      -> 0,25
     *  3-> 65 -> {30, 30, 5}               -> 0,30 / 30,60 / 60,65
     *
     * @param eachSatir
     * @param genislik
     * @return
     */
    private static List<String> parcala(String eachSatir, int genislik) {

        List<String> parcaliSatirList = new ArrayList<>();

        for (int i = 0; i <= eachSatir.length() / 30; i++){

            int ilkHane = genislik * i;
            int sonHane = ilkHane + genislik;

            if (sonHane > eachSatir.length()){
                sonHane = eachSatir.length();
            }

            String parcaliSatir = eachSatir.substring(ilkHane, sonHane);

            if (parcaliSatir.trim().length() > 0){
                parcaliSatirList.add(parcaliSatir);
            }
        }

        return parcaliSatirList;
    }

    public static String sonaImzaliMetinEkle(String metin) {

        String imza = "\n\n + \t\t\t\t\t\t İmza: ";

        return metin + imza;
    }
}
