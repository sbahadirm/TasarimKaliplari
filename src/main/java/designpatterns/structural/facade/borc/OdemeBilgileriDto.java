package main.java.designpatterns.structural.facade.borc;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class OdemeBilgileriDto {

    private String kartUzerindekiIsim;
    private String kartNo;
    private Long sonKullanmaAy;
    private Long sonKullanmaYil;
    private Long cvvNo;

    public OdemeBilgileriDto(String kartUzerindekiIsim, String kartNo, Long sonKullanmaAy, Long sonKullanmaYil, Long cvvNo) {
        this.kartUzerindekiIsim = kartUzerindekiIsim;
        this.kartNo = kartNo;
        this.sonKullanmaAy = sonKullanmaAy;
        this.sonKullanmaYil = sonKullanmaYil;
        this.cvvNo = cvvNo;
    }

    public String getKartUzerindekiIsim() {
        return kartUzerindekiIsim;
    }

    public String getKartNo() {
        return kartNo;
    }

    public Long getSonKullanmaAy() {
        return sonKullanmaAy;
    }

    public Long getSonKullanmaYil() {
        return sonKullanmaYil;
    }

    public Long getCvvNo() {
        return cvvNo;
    }
}
