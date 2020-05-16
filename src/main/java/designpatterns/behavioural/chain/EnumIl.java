package main.java.designpatterns.behavioural.chain;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public enum EnumIl {

    ISTANBUL("İstanbul"),
    ANKARA("Ankara"),
    ANTALYA("Antalya"),
    CANKIRI("Çankırı"),
    KARS("Kars")
    ;

    private String il;

    EnumIl(String il) {
        this.il = il;
    }

    public String getIl() {
        return il;
    }

    @Override
    public String toString() {
        return il;
    }
}
