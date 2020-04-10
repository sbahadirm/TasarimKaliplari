package main.java.designpatterns.structural.decorator;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public abstract class RaporDecorator implements Rapor{

    private Rapor rapor;

    public RaporDecorator(Rapor rapor) {
        this.rapor = rapor;
    }

    @Override
    public String getMetin() {
        return rapor.getMetin();
    }
}
