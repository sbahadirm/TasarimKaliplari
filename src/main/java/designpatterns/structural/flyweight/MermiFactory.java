package main.java.designpatterns.structural.flyweight;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class MermiFactory {

    private static Map<EnumMermiBoyutu, Mermi> map = new LinkedHashMap<>();

    public static Mermi mermiUret(EnumMermiBoyutu mermiBoyutu){

        Mermi mermi = map.get(mermiBoyutu);

        if (mermi == null){

            mermi = new Mermi(mermiBoyutu);

            map.put(mermiBoyutu, mermi);
        }

        return mermi;
    }
}
