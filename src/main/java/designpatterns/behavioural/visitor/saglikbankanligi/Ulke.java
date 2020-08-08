package main.java.designpatterns.behavioural.visitor.saglikbankanligi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Ulke {

    private String adi;
    private List<Il> ilList;

    public Ulke(String adi) {
        this.adi = adi;
        ilList = new ArrayList<>();
    }

    public String accept(Visitor visitor){
        return visitor.visitUlke(this);
    }

    public void ilEkle(Il il){
        ilList.add(il);
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Il> getIlList() {
        return ilList;
    }

    public void setIlList(List<Il> ilList) {
        this.ilList = ilList;
    }
}
