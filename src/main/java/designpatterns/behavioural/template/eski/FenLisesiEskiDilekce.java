package main.java.designpatterns.behavioural.template.eski;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class FenLisesiEskiDilekce {

    private String sinif;
    private String numara;
    private String isim;
    private String sube;

    public FenLisesiEskiDilekce(String sinif, String numara, String isim, String sube) {
        this.sinif = sinif;
        this.numara = numara;
        this.isim = isim;
        this.sube = sube;
    }

    public void dilekceYazdir(){
        System.out.println(dilekceMetni());
    }

    private String dilekceMetni(){

        StringBuilder dilekceMetni = new StringBuilder();

        String formatliTarih = getFormatliTarih();

        dilekceMetni.append("**************************************************************************");
        dilekceMetni.append("\n");
        dilekceMetni.append("\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + formatliTarih);
        dilekceMetni.append("\n");
        dilekceMetni.append("\t\t\t\t" + "Çankırı Fen Lisesi müdürlüğüne");
        dilekceMetni.append("\n");
        dilekceMetni.append("\t\t\t\t\t\t\t\t\t\t\t\t" + "Çankırı");
        dilekceMetni.append("\n");
        dilekceMetni.append("\t");
        dilekceMetni.append("Halen okulunuzun " + sinif + " Fen-" + sube + " sınıfında " + numara);
        dilekceMetni.append(" öğrenci numaralı öğrencisi olarak\n");
        dilekceMetni.append("öğrenimime devam etmekteyim." + "Birinci");
        dilekceMetni.append(" eğitim öğretim yılı " + "2020" + " dönemi \n");
        dilekceMetni.append("içerisindeki devamsızlık durumunun tarafıma bildirilmesi hususunu,\n");
        dilekceMetni.append("Saygılarımla arz ederim.");

        dilekceMetni.append("\n\n");

        dilekceMetni.append("\t\t\t\t\t\t\t\t\t\t\t\t" + isim);
        dilekceMetni.append("\n");
        dilekceMetni.append("**************************************************************************");

        return dilekceMetni.toString();
    }

    private String getFormatliTarih() {

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        return format.format(new Date());
    }
}
