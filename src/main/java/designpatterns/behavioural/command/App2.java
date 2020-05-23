package main.java.designpatterns.behavioural.command;

import java.math.BigDecimal;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class App2 {

    public static void main(String[] args) {

        BigDecimal sayi1 = BigDecimal.TEN;
        BigDecimal sayi2 = BigDecimal.valueOf(2);

        BigDecimal toplam = HesapMakinesi2.islem(new ToplamaCommand(), sayi1, sayi2);
        BigDecimal cikarma = HesapMakinesi2.islem(new CikarmaCommand(), sayi1, sayi2);
        BigDecimal carpma = HesapMakinesi2.islem(new CarpmaCommand(), sayi1, sayi2);
        BigDecimal bolme = HesapMakinesi2.islem(new BolmeCommand(), sayi1, sayi2);
        BigDecimal ust = HesapMakinesi2.islem(new UstCommand(), sayi1, sayi2);
        BigDecimal mod = HesapMakinesi2.islem(new ModCommand(), sayi1, sayi2);

        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + cikarma);
        System.out.println("Çarpma: " + carpma);
        System.out.println("Bölme: " + bolme);
        System.out.println("Üst: " + ust);
        System.out.println("Mod: " + mod);
    }
}
