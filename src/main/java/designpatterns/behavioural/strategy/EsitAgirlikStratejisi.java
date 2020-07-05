package main.java.designpatterns.behavioural.strategy;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class EsitAgirlikStratejisi implements SinavStratejisi {

    @Override
    public EnumDers getBirinci() {
        return EnumDers.TURKCE;
    }

    @Override
    public EnumDers getIkinci() {
        return EnumDers.MATEMATIK;
    }

    @Override
    public EnumDers getUcuncu() {
        return EnumDers.SOSYAL;
    }

    @Override
    public EnumDers getDorduncu() {
        return EnumDers.FEN;
    }
}
