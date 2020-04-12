package main.java.designpatterns.structural.facade.gecikme;

import main.java.designpatterns.structural.facade.DateUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class GecikmeZammiHesaplamaService {

    private GecikmeZammiOraniEntityService gecikmeZammiOraniEntityService;

    public GecikmeZammiHesaplamaService() {
        gecikmeZammiOraniEntityService = new GecikmeZammiOraniEntityService();
    }

    public BigDecimal gecikmeZammiHesapla(BigDecimal tutar, Date vadeTarihi){

        BigDecimal gecikmeZammi = BigDecimal.ZERO;

        if (vadeTarihi.compareTo(new Date()) > 0){
            return gecikmeZammi;
        }

        gecikmeZammi = gecikmeZamminiHesapla(tutar, vadeTarihi);

        return gecikmeZammi;
    }

    private BigDecimal gecikmeZamminiHesapla(BigDecimal tutar, Date vadeTarihi) {

        BigDecimal gecikmeZammiOrani = gecikmeZammiOraniEntityService.getGecikmeZammiOran();

        Date gununTarihi = DateUtil.getGununTarihi();

        long gunFarkiL = DateUtil.gunFarkiHesapla(vadeTarihi, gununTarihi);

        BigDecimal gunFarki = BigDecimal.valueOf(gunFarkiL);

        BigDecimal gecikmeZammi = gecikmeZammiOrani.multiply(gunFarki).multiply(tutar);

        gecikmeZammi = gecikmeZammi.setScale(2, RoundingMode.HALF_DOWN);

        if (gecikmeZammi.compareTo(BigDecimal.ZERO) > 0){
            System.out.println("Bilgi: Gecikme zammı hesaplandı. Gecikme Zammı Tutarı: " + gecikmeZammi);
        }

        return gecikmeZammi;

    }
}














