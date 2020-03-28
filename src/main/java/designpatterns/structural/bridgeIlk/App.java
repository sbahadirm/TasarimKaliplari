package main.java.designpatterns.structural.bridgeIlk;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class App {

    public static void main(String[] args) {

        Muzik muzik = new Muzik("Sezen Aksu - Gülümse", "Gülümse hadi gülümse");

        Bilgisayar bilgisayar = new Bilgisayar();

        bilgisayar.muzikCal(muzik);
    }
}
