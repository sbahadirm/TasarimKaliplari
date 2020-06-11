package main.java.designpatterns.behavioural.iterator;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Soru {

    private Long soruNo;

    public Soru(Long soruNo) {
        this.soruNo = soruNo;
    }

    public Long getSoruNo() {
        return soruNo;
    }

    public void setSoruNo(Long soruNo) {
        this.soruNo = soruNo;
    }
}
