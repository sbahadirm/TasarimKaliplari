package main.java.designpatterns.structural.bridgeIlk;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Bilgisayar {

    private Spotify spotify;
    private Hoparlor hoparlor;

    public Bilgisayar() {
        spotify = new Spotify();
        hoparlor = new Hoparlor();
    }

    public void muzikCal(Muzik muzik){

        System.out.println("Bilgisayar çalıştı");

        String ses = spotify.muzikCal(muzik);
        hoparlor.sesiCal(ses);
    }

    public Spotify getSpotify() {
        return spotify;
    }

    public void setSpotify(Spotify spotify) {
        this.spotify = spotify;
    }

    public Hoparlor getHoparlor() {
        return hoparlor;
    }

    public void setHoparlor(Hoparlor hoparlor) {
        this.hoparlor = hoparlor;
    }
}
