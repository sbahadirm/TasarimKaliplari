package main.java.designpatterns.behavioural.mediator;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public interface Araci {

    void ureticiEkle(Uretici uretici);
    void halciEkle(Halci halci);

    void ureticidenAl(Uretici uretici);
    void haleSat(Halci halci);
}
