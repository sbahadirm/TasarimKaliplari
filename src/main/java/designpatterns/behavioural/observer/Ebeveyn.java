package main.java.designpatterns.behavioural.observer;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Ebeveyn implements Observer {

    private String adi;

    public Ebeveyn(String adi) {
        this.adi = adi;
    }

    @Override
    public void update(Observable observable) {

        Termometre termometre = (Termometre) observable;

        System.out.println(adi + " dedi ki: ooo sicaklık " + termometre.getAnlikSicaklik()+
        " derece olmuş!");
    }
}
