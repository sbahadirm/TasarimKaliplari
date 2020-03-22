package main.java.designpatterns.structural.adapter;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Priz {

    public void elektrikVer(ElektrikliEvAletleri elektrikliEvAletleri){

        int volt = elektrikliEvAletleri.prizeTakVeCalistir();
        System.out.println("Prizden " + volt + " volt alınıyor");

    }
}
