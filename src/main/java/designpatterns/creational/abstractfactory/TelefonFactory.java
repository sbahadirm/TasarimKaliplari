package main.java.designpatterns.creational.abstractfactory;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public interface TelefonFactory {

    Telefon getTelefon(String model, String batarya, int en, int boy);
}
