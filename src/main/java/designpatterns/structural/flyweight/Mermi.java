package main.java.designpatterns.structural.flyweight;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Mermi {

    private EnumMermiBoyutu mermiBoyutu;

    public Mermi(EnumMermiBoyutu mermiBoyutu) {
        this.mermiBoyutu = mermiBoyutu;

        System.out.println(mermiBoyutu.getBoyut() + " mm mermi oluştu");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void atesle(){
        System.out.println("Tak");
    }
}
