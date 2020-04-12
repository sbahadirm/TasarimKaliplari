package main.java.designpatterns.structural.facade.hukuksal;

import java.util.List;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class HukuksalKontrolService {

    private HukuksalSurecEntityService hukuksalSurecEntityService;

    public HukuksalKontrolService() {

        hukuksalSurecEntityService = new HukuksalSurecEntityService();
    }

    public boolean isHukuksalIslemde(Long borcId){

        List<Long> hukuksalIslemdekiBorcList = hukuksalSurecEntityService.findAllHukuksalIslem();

        boolean isHukuksalIslemde = hukuksalIslemdekiBorcList.contains(borcId);

        if (isHukuksalIslemde){
            System.out.println("Borç hukuksal işlemde. Tahsil edilemez!");
        }

        return isHukuksalIslemde;

    }
}
