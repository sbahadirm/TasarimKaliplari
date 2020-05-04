package main.java.designpatterns.structural.proxy;

import java.math.BigDecimal;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class App {

    public static void main(String[] args) {

        YoneticiProxy yoneticiProxy = new YoneticiProxy("yusuf", "12345");

        try {
            BigDecimal ciro = yoneticiProxy.getCiro();
            System.out.println("Şirket Cirosu: " + ciro);
        } catch (IllegalAccessException e) {
            System.out.println("Hassas bilgilere erişiminiz yoktur!");
        }
    }
}
