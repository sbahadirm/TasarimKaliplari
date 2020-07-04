package main.java.designpatterns.behavioural.state;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Oyun {

    private Konsol konsol;

    public Oyun() {
        System.out.println("Oyun başladı.");

        konsol = new Hucum();
    }

    public void ucgen(){
        konsol.ucgenBas();
    }

    public void kare(){
        konsol.kareBas();
    }

    public void yuvarlak(){
        konsol.yuvarlakBas();
    }

    public void x(){
        konsol.xBas();
    }

    public void topuKap(){
        System.out.println("Top kapıldı. Hücuma çıkılıyor!");
        konsol = new Hucum();
    }

    public void topuKaptir(){
        System.out.println("Top kaptırıldı! Allah'ını seven defansa gelsin :)");
        konsol = new Defans();
    }
}
