package main.java.designpatterns.structural.bridge.cihaz;

import main.java.designpatterns.structural.bridge.Muzik;
import main.java.designpatterns.structural.bridge.muzikcalar.MuzikCalar;
import main.java.designpatterns.structural.bridge.sescihazi.SesCihazi;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public abstract class MuzikCalabilenBilgisayar {

    protected SesCihazi sesCihazi;
    protected MuzikCalar muzikCalar;

    public MuzikCalabilenBilgisayar() {
    }

    public MuzikCalabilenBilgisayar(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
        this.sesCihazi = sesCihazi;
        this.muzikCalar = muzikCalar;
    }

    public void muzikCal(Muzik muzik){

        String ses = muzikCalar.muzikCal(muzik);
        sesCihazi.sesiCal(ses);
    }
}
