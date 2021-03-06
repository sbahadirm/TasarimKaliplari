package main.java.designpatterns.creational.abstractfactory;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Note8Fabrikasi implements TelefonFactory {
    @Override
    public Telefon getTelefon(String model, String batarya, int en, int boy) {
        return new Note8(model, batarya, en, boy);
    }
}
