package main.java.designpatterns.structural.flyweight;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public abstract class Asker {

    private EnumMermiBoyutu mermiBoyutu;

    public Asker(EnumMermiBoyutu mermiBoyutu) {
        this.mermiBoyutu = mermiBoyutu;
    }

    public void atesEt(){

//        Mermi mermi = new Mermi(mermiBoyutu);

        Mermi mermi = MermiFactory.mermiUret(mermiBoyutu);
        mermi.atesle();
    }

    public void tara(){

        for (int i = 0; i < 5; i++){
            atesEt();
        }
    }

}
