package main.java.designpatterns.behavioural.mediator;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public enum EnumUrun {

    DOMATES("Domates"),
    SALATALIK("Salatalık")
    ;

    private String urun;

    EnumUrun(String urun) {
        this.urun = urun;
    }

    public String getUrun() {
        return urun;
    }
}
