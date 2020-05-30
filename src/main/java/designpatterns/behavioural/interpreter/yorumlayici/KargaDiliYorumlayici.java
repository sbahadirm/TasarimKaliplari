package main.java.designpatterns.behavioural.interpreter.yorumlayici;

import main.java.designpatterns.behavioural.interpreter.dil.KargaDili;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class KargaDiliYorumlayici implements Yorumlayici {

    @Override
    public String yorumla(String soz) {

        KargaDili kargaDili = new KargaDili();
        String turkce = kargaDili.turkceyeCevir(soz);

        return turkce;
    }
}
