package module06.BObserver;

/**
 * Created by tetya on 10.07.2017.
 * НАБЛЮДАЕМЬІЙ
 */
public interface Observed {
    public void addObserver(Observer observer); //додати споглядача

    public void removeObserver(Observer observer);//видалити споглядача

    public void notifyObservers();      //сповіщення наглядачеві про подію, яку він чекає
}
