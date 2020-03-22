package main.java.designpatterns.structural.adapter;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Utu implements ElektrikliEvAletleri {

    private int volt;

    public Utu() {
        this.volt = 220;
    }

    @Override
    public int prizeTakVeCalistir() {

        System.out.println("Ütü çalışıyor.");
        return volt;
    }
}
