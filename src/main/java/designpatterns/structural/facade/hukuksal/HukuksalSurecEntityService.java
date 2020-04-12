package main.java.designpatterns.structural.facade.hukuksal;

import java.util.Arrays;
import java.util.List;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class HukuksalSurecEntityService {

    public List<Long> findAllHukuksalIslem() {

        List<Long> hukuksalList = Arrays.asList(1L, 2L, 3L, 4L);

        return hukuksalList;
    }
}
