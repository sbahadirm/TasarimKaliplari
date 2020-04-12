package main.java.designpatterns.structural.facade.borc;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Borc {

    private Long id;
    private EnumBorcTuru borcTuru;
    private BigDecimal borcTutari;
    private Date vadeTarihi;

    public Borc() {
    }

    public Borc(Long id, EnumBorcTuru borcTuru, BigDecimal borcTutari, Date vadeTarihi) {
        this.id = id;
        this.borcTuru = borcTuru;
        this.borcTutari = borcTutari;
        this.vadeTarihi = vadeTarihi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnumBorcTuru getBorcTuru() {
        return borcTuru;
    }

    public void setBorcTuru(EnumBorcTuru borcTuru) {
        this.borcTuru = borcTuru;
    }

    public BigDecimal getBorcTutari() {
        return borcTutari;
    }

    public void setBorcTutari(BigDecimal borcTutari) {
        this.borcTutari = borcTutari;
    }

    public Date getVadeTarihi() {
        return vadeTarihi;
    }

    public void setVadeTarihi(Date vadeTarihi) {
        this.vadeTarihi = vadeTarihi;
    }
}
