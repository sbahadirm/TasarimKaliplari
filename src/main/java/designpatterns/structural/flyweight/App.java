package main.java.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class App {

    public static void main(String[] args) {

        List<Asker> askerList = new ArrayList<>();

        Yuzbasi yuzbasi = new Yuzbasi();
        askerList.add(yuzbasi);

        for (int i = 0; i < 50; i++){
            Er er = new Er();
            askerList.add(er);
        }

        for (Asker asker : askerList) {
            asker.atesEt();
        }

        for (Asker asker : askerList) {
            asker.tara();
        }
    }
}
