package main.java.designpatterns.structural.facade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class DateUtil {

    public static Date getGununTarihi() {

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        String dateStr = format.format(new Date());

        Date date = null;
        try {
            date = format.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }

    public static long gunFarkiHesapla(Date ilkTarih, Date sonTarih){

        long gunKatsayisi = 24 * 60 * 60 * 1000;

        long ilk = ilkTarih.getTime();
        long son = sonTarih.getTime();

        long gunFarki = (son / gunKatsayisi) - (ilk / gunKatsayisi);

        return gunFarki;
    }

    public static Long tarihinYili(Date date){

        String yilStr = new SimpleDateFormat("yyyy").format(date);

        return Long.valueOf(yilStr);
    }

    public static Long tarihinAyi(Date date){

        String ayStr = new SimpleDateFormat("MM").format(date);

        return Long.valueOf(ayStr);
    }

    public static Date tarihOlustur(String dateStr) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        Date date = null;
        try {
            date = format.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }
}
