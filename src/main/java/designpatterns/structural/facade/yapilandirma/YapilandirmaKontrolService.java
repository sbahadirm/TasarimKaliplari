package main.java.designpatterns.structural.facade.yapilandirma;

import main.java.designpatterns.structural.facade.DateUtil;

import java.util.Date;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class YapilandirmaKontrolService {

    /**
     * Eğer vade tarihi üzerinden 90 gün geçtiyse yapılandırma bozulur!
     * @param vadeTarihi
     * @return
     */
    public boolean isYapilandirmaBozulmali(Date vadeTarihi){

        Date gununTarihi = DateUtil.getGununTarihi();

        long gunFarki = DateUtil.gunFarkiHesapla(vadeTarihi, gununTarihi);

        boolean isYapilandirmaBozulmali = gunFarki > 90;

        if (isYapilandirmaBozulmali){
            System.out.println("Borcun yapılandırması bozulmalı! Tahsil edilemez!");
        }

        return isYapilandirmaBozulmali;
    }
}
