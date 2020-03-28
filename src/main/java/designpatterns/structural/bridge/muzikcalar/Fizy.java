package main.java.designpatterns.structural.bridge.muzikcalar;


import main.java.designpatterns.structural.bridge.Muzik;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Fizy implements MuzikCalar {

    @Override
    public String muzikCal(Muzik muzik) {

        System.out.println("Fizy " + muzik + " şarkısını çalıyor. ");

        return muzik.getSes();
    }
}
