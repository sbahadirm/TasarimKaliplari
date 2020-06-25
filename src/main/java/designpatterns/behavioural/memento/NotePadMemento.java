package main.java.designpatterns.behavioural.memento;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class NotePadMemento {

    private String metin;

    public NotePadMemento() {
        metin = "";
    }

    public NotePadMemento(String metin) {
        this.metin = metin;
    }

    public String getMetin() {
        return metin;
    }
}
