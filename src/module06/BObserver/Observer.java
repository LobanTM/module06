package module06.BObserver;

import java.util.List;

/**
 * Created by tetya on 10.07.2017.
 * НАБЛЮДАЮЩИЙ
 */
public interface Observer {
    public void handleEvent(List<String> evants); //отримання сповіщення, про те що подія відбулася
}
