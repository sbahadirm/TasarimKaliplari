package main.java.designpatterns.behavioural.state;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class App {

    public static void main(String[] args) {

        Oyun oyun = new Oyun();

        oyun.x();
        oyun.ucgen();
        oyun.kare();
        oyun.topuKaptir();

        oyun.x();
        oyun.kare();
        oyun.topuKap();
    }
}
