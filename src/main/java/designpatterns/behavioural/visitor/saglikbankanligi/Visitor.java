package main.java.designpatterns.behavioural.visitor.saglikbankanligi;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public interface Visitor {

    String visitHastane(Hastane hastane);
    String visitIl(Il il);
    String visitUlke(Ulke ulke);

}
