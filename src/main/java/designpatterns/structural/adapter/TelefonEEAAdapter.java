package main.java.designpatterns.structural.adapter;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class TelefonEEAAdapter implements ElektrikliEvAletleri {

    private Telefon telefon;

    public TelefonEEAAdapter(Telefon telefon) {
        this.telefon = telefon;
    }

    @Override
    public int prizeTakVeCalistir() {
        return telefon.sarjEt();
    }
}
