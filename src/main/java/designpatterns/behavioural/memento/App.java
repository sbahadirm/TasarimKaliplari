package main.java.designpatterns.behavioural.memento;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class App {

    public static void main(String[] args) {

        Hafiza hafiza = new Hafiza();

        NotePad notePad = new NotePad();
        notePad.ekle("B");
        notePad.ekle("A");
        notePad.ekle("H");
        notePad.ekle("A");

        versiyonKaydet(hafiza, notePad);

        notePad.ekle("DIR");

        versiyonKaydet(hafiza, notePad);

        hataliNoktaKoy(notePad);

        geriAl(hafiza, notePad);

        versiyonKaydet(hafiza, notePad);

        notePad.ekle(" MEMİŞ");

        versiyonKaydet(hafiza, notePad);

        hataliNoktaKoy(notePad);

        geriAl(hafiza, notePad);
        geriAl(hafiza, notePad);
        geriAl(hafiza, notePad);

    }

    private static void geriAl(Hafiza hafiza, NotePad notePad) {
        notePad.geriDon(hafiza.sonVersiyonuGetir());
        notePad.yazdir();
    }

    private static void hataliNoktaKoy(NotePad notePad) {
        notePad.ekle(".");
        notePad.yazdir();
    }

    private static void versiyonKaydet(Hafiza hafiza, NotePad notePad) {
        NotePadMemento memento = notePad.kaydet();
        hafiza.ekle(memento);

        notePad.yazdir();
    }
}
