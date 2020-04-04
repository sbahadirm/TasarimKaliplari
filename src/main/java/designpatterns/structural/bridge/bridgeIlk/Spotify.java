package main.java.designpatterns.structural.bridge.bridgeIlk;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Spotify {

    public String muzikCal(Muzik muzik){

        System.out.println("Spotify " + muzik + " şarkısını çalıyor.");

        return muzik.getSes();
    }
}
