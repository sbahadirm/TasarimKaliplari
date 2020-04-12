package main.java.designpatterns.structural.facade.tahsilat;

import main.java.designpatterns.structural.facade.borc.Borc;
import main.java.designpatterns.structural.facade.borc.EnumBorcTuru;
import main.java.designpatterns.structural.facade.hukuksal.HukuksalKontrolService;
import main.java.designpatterns.structural.facade.yapilandirma.YapilandirmaKontrolService;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class TahsilatKontrolService {

    private YapilandirmaKontrolService yapilandirmaKontrolService;
    private HukuksalKontrolService hukuksalKontrolService;

    public TahsilatKontrolService() {
        yapilandirmaKontrolService = new YapilandirmaKontrolService();
        hukuksalKontrolService = new HukuksalKontrolService();
    }

    public boolean isTahsilataUygun(Borc borc){

        boolean yapilandirmaBozulmali = false;
        if (EnumBorcTuru.YAPILANDIRMA.equals(borc.getBorcTuru())){
            yapilandirmaBozulmali = yapilandirmaKontrolService.isYapilandirmaBozulmali(borc.getVadeTarihi());
        }

        boolean hukuksalIslemde = hukuksalKontrolService.isHukuksalIslemde(borc.getId());

        boolean isBorcTahsilataUygun = !(yapilandirmaBozulmali || hukuksalIslemde);

        return isBorcTahsilataUygun;

    }
}
