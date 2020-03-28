package main.java.designpatterns.structural.bridge;

import main.java.designpatterns.structural.bridge.cihaz.BilgisayarKF;
import main.java.designpatterns.structural.bridge.cihaz.Telefon;
import main.java.designpatterns.structural.bridge.muzikcalar.Fizy;
import main.java.designpatterns.structural.bridge.muzikcalar.Spotify;
import main.java.designpatterns.structural.bridge.sescihazi.Kulaklik;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class App {

    public static void main(String[] args) {

        Muzik muzik = new Muzik("Sezen Aksu - Gülümse", "Gülümse hadi gülümse");

        BilgisayarKF bilgisayarKF = new BilgisayarKF();
        bilgisayarKF.muzikCal(muzik);

        System.out.println("***********************");

        Telefon telefon = new Telefon(new Kulaklik(), new Fizy());
        telefon.muzikCal(muzik);

        System.out.println("***********************");

        Telefon telefon2 = new Telefon(new Kulaklik(), new Spotify());
        telefon2.muzikCal(muzik);

    }
}
