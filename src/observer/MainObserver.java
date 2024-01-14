package observer;

public class MainObserver {
    public static void main(String[] args) {
        EjemploObservable observable = new EjemploObservable();
        observable.addObserver(new Ejemplo1Observer());
        observable.addObserver(new Ejemplo2Observer());

        observable.notifyObservers();
    }
}
