package main.java.designpatterns.behavioural.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class App {

    public static void main(String[] args) {

        Kitap kitap = new Kitap("Matematik");

//        List<Soru> soruList = kitap.getSoruList();

//        for (Soru soru : soruList) {
//            Long soruNo = soru.getSoruNo();
//
//            System.out.println("Soru No: " + soruNo);
//        }

        Fasikul fasikul = new Fasikul("Türkce");

//        Soru[] sorular = fasikul.getSorular();
//
//        for (Soru soru : sorular) {
//            Long soruNo = soru.getSoruNo();
//
//            System.out.println("Soru No: " + soruNo);
//        }

        /**
         * Yeni işlem
         */

        Iterator soruIteratorKitap = kitap.getSoruIterator();
        Iterator soruIteratorFasikul = fasikul.getSoruIterator();

        yazdir(soruIteratorKitap);
        yazdir(soruIteratorFasikul);
    }

    private static void yazdir(Iterator soruIteratorKitap) {
        while (soruIteratorKitap.hasNext()) {
            Soru soru = (Soru) soruIteratorKitap.next();

            Long soruNo = soru.getSoruNo();

            System.out.println("Soru No: " + soruNo);
        }
    }

}
