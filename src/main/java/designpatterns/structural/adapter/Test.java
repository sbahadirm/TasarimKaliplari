package main.java.designpatterns.structural.adapter;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Test {

    public static void main(String[] args) {

        Priz priz = new Priz();

        Utu utu = new Utu();
        Buzdolabı buzdolabı = new Buzdolabı();

        priz.elektrikVer(utu);
        priz.elektrikVer(buzdolabı);

        SamsungTelefon samsungTelefon = new SamsungTelefon();
        TelefonEEAAdapter adapter = new TelefonEEAAdapter(samsungTelefon);

        priz.elektrikVer(adapter);
    }
}
