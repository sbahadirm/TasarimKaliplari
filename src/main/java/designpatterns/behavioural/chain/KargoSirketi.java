package main.java.designpatterns.behavioural.chain;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public abstract class KargoSirketi {

    private EnumIl enumIl;
    private KargoSirketi sonrakiKargoSirketi;

    public KargoSirketi(EnumIl enumIl) {
        this.enumIl = enumIl;
    }

    public KargoSirketi getSonrakiKargoSirketi() {
        return sonrakiKargoSirketi;
    }

    public KargoSirketi setSonrakiKargoSirketi(KargoSirketi sonrakiKargoSirketi) {
        this.sonrakiKargoSirketi = sonrakiKargoSirketi;
        return this;
    }

    public EnumIl getEnumIl() {
        return enumIl;
    }

    public void kargola(EnumIl il){

        gelenKargoBilgileriYazdir(il);

        if (getEnumIl().equals(il)){

            kargoTeslimBilgileriYazdir();

        } else if (getSonrakiKargoSirketi() != null){

            getSonrakiKargoSirketi().kargola(il);

        } else {
            hizmetAlaniDisiYazdir(il);
        }

    }

    private void hizmetAlaniDisiYazdir(EnumIl il) {
        System.out.println(il.getIl() + " hizmet alanının dışındadır!");
    }

    private void kargoTeslimBilgileriYazdir() {
        System.out.println(getEnumIl().getIl() + " şube teslim aldı.");
    }

    private void gelenKargoBilgileriYazdir(EnumIl il) {
        System.out.println(il.getIl() + " iline gidecek kargo "
                + getEnumIl().getIl() + " şubesine geldi.");
    }
}
