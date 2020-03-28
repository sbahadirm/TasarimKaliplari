package main.java.designpatterns.structural.bridge.cihaz;

import main.java.designpatterns.structural.bridge.Muzik;
import main.java.designpatterns.structural.bridge.muzikcalar.MuzikCalar;
import main.java.designpatterns.structural.bridge.sescihazi.SesCihazi;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Telefon extends MuzikCalabilenBilgisayar {

    public Telefon(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
        super(sesCihazi, muzikCalar);
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Telefon müzik çalıyor");

        super.muzikCal(muzik);
    }
}
