package main.java.designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public abstract class Observable {

    private List<Observer> observerList;

    public Observable() {
        observerList = new ArrayList<>();
    }

    public void ekle(Observer observer){
        observerList.add(observer);
    }

    public void cikar(Observer observer){
        observerList.remove(observer);
    }

    public void haberVer(){
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }
}
