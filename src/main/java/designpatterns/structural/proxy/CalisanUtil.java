package main.java.designpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class CalisanUtil {

    public static List<Calisan> getCalisanList(){

        Calisan bahadir = new Calisan("bahadir", "123", false);
        Calisan ayse = new Calisan("ayse", "1234", false);
        Calisan yusuf = new Calisan("yusuf", "12345", true);

        List<Calisan> calisanList = new ArrayList<>();
        calisanList.add(bahadir);
        calisanList.add(ayse);
        calisanList.add(yusuf);

        return calisanList;

    }

    public static Map<String, Calisan> getKullaniciAdiCalisanMap(){

        List<Calisan> calisanList = getCalisanList();

        Map<String, Calisan> map = new LinkedHashMap<>();
        for (Calisan calisan : calisanList) {
            map.put(calisan.getKullaniciAdi(), calisan);
        }

        return map;
    }

    public static Calisan getCalisanByKullaniciAdi(String kullaniciAdi){

        Map<String, Calisan> map = getKullaniciAdiCalisanMap();

        Calisan calisan = map.get(kullaniciAdi);

        return calisan;
    }

    public static boolean isKullaniciValid(String kullaniciAdi, String sifre) {

        boolean isKullaniciValid = false;

        Calisan calisan = getCalisanByKullaniciAdi(kullaniciAdi);

        if (calisan != null){

            isKullaniciValid = calisan.getSifre().equals(sifre);
        }

        return isKullaniciValid;
    }
}
