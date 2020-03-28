package main.java.designpatterns.structural.bridge.sescihazi;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Kulaklik implements SesCihazi {

    @Override
    public void sesiCal(String ses) {

        System.out.println("Kulaklık ses çalıyor -> " + ses);
    }
}
