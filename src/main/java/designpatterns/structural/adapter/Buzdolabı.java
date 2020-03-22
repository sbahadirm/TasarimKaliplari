package main.java.designpatterns.structural.adapter;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Buzdolabı implements ElektrikliEvAletleri {

    private int volt;

    public Buzdolabı() {
        this.volt = 220;
    }

    @Override
    public int prizeTakVeCalistir() {

        System.out.println("Buzdolabı çalışıyor.");
        return volt;
    }
}
