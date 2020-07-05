package main.java.designpatterns.behavioural.strategy;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Ogrenci {

    private EnumBolum bolum;
    private SinavStratejisi sinavStratejisi;

    public Ogrenci(EnumBolum bolum) {
        this.bolum = bolum;

        if (bolum == null){
            throw new NullPointerException("Bölüm boş olamaz!");
        }

        switch (bolum){
            case SOZEL:
                sinavStratejisi = new SozelStratejisi();
                break;

            case ESIT_AGIRLIK:
                sinavStratejisi = new EsitAgirlikStratejisi();
                break;

            case SAYISAL:
                sinavStratejisi = new SayisalStratejisi();
                break;

                default:
                    break;
        }
    }

    public String getOncelikSiralamasi(){

        System.out.println(bolum + " için strateji: ");

        String siralama = "Önce " + sinavStratejisi.getBirinci() + " çöz. \n" +
                "Sonra " + sinavStratejisi.getIkinci() + " çöz. \n" +
                "Daha sonra " + sinavStratejisi.getUcuncu() + " çöz. \n" +
                "Zaman kalırsa " + sinavStratejisi.getDorduncu() + " çözersin. \n";

        return siralama;
    }
}













