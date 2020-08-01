package main.java.designpatterns.behavioural.template.eski;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class EskiApp {

    public static void main(String[] args) {
        AnadoluLisesiEskiDilekce anadolu = new AnadoluLisesiEskiDilekce("12 Fen-A",
                "1093", "Sadık Bahadır Memiş");


        anadolu.dilekceYazdir();

        System.out.println("\n\n");

        FenLisesiEskiDilekce fen = new FenLisesiEskiDilekce("10",
                "91", "Ayşe Yusuf", "B");

        fen.dilekceYazdir();

    }
}
