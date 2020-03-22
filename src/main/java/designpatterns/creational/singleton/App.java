package main.java.designpatterns.creational.singleton;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class App {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            Singleton singleton = Singleton.getSingleton();
        }
    }
}
