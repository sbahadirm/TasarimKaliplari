package main.java.designpatterns.structural.decorator;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class RaporApp {

    public static void main(String[] args) {

        String icerik = getRaporIcerik();

//        String metin = duzRaporCiktisi(icerik);

//        String metin = cizgiliRaporCiktisi(icerik);

//        String metin = cizgiliKucukRaporCiktisi(icerik);

        String metin = imzaliCizgiliKucukRaporCiktisi(icerik);

        System.out.println(metin);

    }

    private static String imzaliCizgiliKucukRaporCiktisi(String icerik) {
        DuzRapor duzRapor = new DuzRapor(icerik);

        CizgiliRaporDecorator cizgiliRaporDecorator = new CizgiliRaporDecorator(duzRapor);

        KucukRaporDecorator kucukRaporDecorator = new KucukRaporDecorator(cizgiliRaporDecorator);

        ImzaliRaporDecorator decorator = new ImzaliRaporDecorator(kucukRaporDecorator);

        return decorator.getMetin();
    }

    private static String cizgiliKucukRaporCiktisi(String icerik) {
        DuzRapor duzRapor = new DuzRapor(icerik);

        CizgiliRaporDecorator cizgiliRaporDecorator = new CizgiliRaporDecorator(duzRapor);

        KucukRaporDecorator decorator = new KucukRaporDecorator(cizgiliRaporDecorator);

        return decorator.getMetin();
    }

    private static String cizgiliRaporCiktisi(String icerik) {
        DuzRapor duzRapor = new DuzRapor(icerik);

        CizgiliRaporDecorator decorator = new CizgiliRaporDecorator(duzRapor);

        return decorator.getMetin();
    }

    private static String duzRaporCiktisi(String icerik) {
        DuzRapor duzRapor = new DuzRapor(icerik);

        return duzRapor.getMetin();
    }

    private static String getRaporIcerik() {

        String icerik = "Lorem Ipsum Nedir?\n" +
                "\nLorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. Lorem Ipsum, adı bilinmeyen bir matbaacının bir " +
                "\nhurufat numune kitabı oluşturmak üzere bir yazı galerisini alarak karıştırdığı 1500'lerden beri endüstri standardı sahte metinler " +
                "\nolarak kullanılmıştır. Beşyüz yıl boyunca varlığını sürdürmekle kalmamış, aynı zamanda pek değişmeden elektronik dizgiye de " +
                "\nsıçramıştır. 1960'larda Lorem Ipsum pasajları da içeren Letraset yapraklarının yayınlanması ile ve yakın zamanda Aldus PageMaker " +
                "\ngibi Lorem Ipsum sürümleri içeren masaüstü yayıncılık yazılımları ile popüler olmuştur.";

        return icerik;
    }
}
