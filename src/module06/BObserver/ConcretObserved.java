package module06.BObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tetya on 10.07.2017.
 */
public class ConcretObserved implements  Observed {
    List<String> evants = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>(); //перлік наглядачів

    public void addEvant(String str) {
        this.evants.add(str);   //подія відбулася
        notifyObservers();      //відправити сповіщення наглядачеві
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {                 //відправлення сповіщення всім наглядачам з переліку
        for (Observer observer : subscribers) {
            observer.handleEvent(this.evants);
        }
    }
}
