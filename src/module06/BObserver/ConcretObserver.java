package module06.BObserver;

import java.util.*;

/**
 * Created by tetya on 10.07.2017.
 */
public class ConcretObserver implements Observer {

    String name;
    public  ConcretObserver(String name){
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> evants) {
        System.out.println(name + " we have for you: " + evants.toString());
    }
}
