package main.java.designpatterns.creational.prototype;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class BelgeTuru implements Cloneable{

    private Long id;
    private String adi;

    public BelgeTuru() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Override
    public String toString() {
        return adi;
    }

    @Override
    protected BelgeTuru clone() throws CloneNotSupportedException {
        return (BelgeTuru) super.clone();
    }
}
