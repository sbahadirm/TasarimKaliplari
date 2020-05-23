package main.java.designpatterns.behavioural.command.kotutasarim;

import java.math.BigDecimal;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class App {

    public static void main(String[] args) {

        BigDecimal toplam = HesapMakinesi1.islem(IslemTuru.TOPLAMA, BigDecimal.TEN, BigDecimal.ONE);
        BigDecimal fark = HesapMakinesi1.islem(IslemTuru.CIKARMA, BigDecimal.TEN, BigDecimal.ONE);
        BigDecimal ust = HesapMakinesi1.islem(IslemTuru.UST, BigDecimal.TEN, BigDecimal.valueOf(2));
        BigDecimal mod = HesapMakinesi1.islem(IslemTuru.MOD, BigDecimal.TEN, BigDecimal.valueOf(3));

        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + fark);
        System.out.println("Üst: " + ust);
        System.out.println("Mod: " + mod);
    }
}
