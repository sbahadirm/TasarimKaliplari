package main.java.designpatterns.creational.factory;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            Singleton singleton = Singleton.getSingleton();
        }
    }
}
