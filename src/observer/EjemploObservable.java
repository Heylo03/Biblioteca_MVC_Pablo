package observer;

import java.util.HashSet;
import java.util.Set;

public class EjemploObservable implements Observable {

    Set<Observer> observerSet = new HashSet<>();
    @Override
    public void addObserver(Observer observer) {
        //adicion de observer al set
        observerSet.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        //borrado de observer del set
        observerSet.remove(observer);
    }

    @Override
    public void notifyObservers() {
        //recorrer cada observer uno a uno para notificar de algun cambio
        for (Observer observer : observerSet){
            observer.update();
        }
    }
}
