package main.java.designpatterns.behavioural.interpreter.dil;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public enum  EnumDil {

    KUS("Kuş", "ca"),
    KARGA("Karga", "ga")
    ;

    private String isim;
    private String ek;

    EnumDil(String isim, String ek) {

        this.isim = isim;
        this.ek = ek;
    }

    public String getIsim() {
        return isim;
    }

    public String getEk() {
        return ek;
    }
}
