package main.java.designpatterns.structural.adapter;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class SamsungTelefon implements Telefon {

    private int calismaVoltaji;

    public SamsungTelefon() {
        calismaVoltaji = 5;
    }

    @Override
    public int sarjEt() {
        System.out.println("Samsung Telefon çalışıyor.");
        return calismaVoltaji;
    }
}
