package main.java.designpatterns.behavioural.iterator;

import java.util.Iterator;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class SoruIterator implements Iterator {

    private Soru[] sorular;
    private int sira;

    public SoruIterator(Soru[] sorular) {
        this.sorular = sorular;
    }

    @Override
    public boolean hasNext() {

        if (sira < sorular.length){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {

        Soru soru = sorular[sira];
        sira++;

        return soru;
    }
}
