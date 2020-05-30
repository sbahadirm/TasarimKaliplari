package main.java.designpatterns.behavioural.interpreter;

import main.java.designpatterns.behavioural.interpreter.yorumlayici.KargaDiliYorumlayici;
import main.java.designpatterns.behavioural.interpreter.yorumlayici.KusDiliYorumlayici;
import main.java.designpatterns.behavioural.interpreter.yorumlayici.Yorumlayici;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class App {

    public static void main(String[] args) {

        String kusSozu = getKusSozu();
        String kargaSozu = getKargaSozu();

        yazdir(kusSozu, new KusDiliYorumlayici());
        yazdir(kargaSozu, new KargaDiliYorumlayici());

    }

    private static void yazdir(String kusSozu, Yorumlayici yorumlayici) {
        String turkce = yorumlayici.yorumla(kusSozu);
        System.out.println(turkce);
    }

    private static String getKusSozu() {
        return "Sacadıcık Bacahacadıcır Mecemiciş cacacıcık yecer";
    }

    private static String getKargaSozu() {
        return "Sagadıgık Bagahagadıgır Megemigiş cagacıgık yeger";
    }
}
