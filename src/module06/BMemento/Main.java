package module06.BMemento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tetya on 10.07.2017.
 *
 * Caretaker - это объект, который работает с originator'ом и ожидает,
 *              что state последнего будет сохранен и при необходиомсти возвращен в предыдущее состояние.
 */
public class Main {
    public static void main(String[] args) {
        ProgramCod p = new ProgramCod();

        p.setCod("START");
        p.setDescription("start of codding");
        p.save();

        p.setCod("END.");
        p.setDescription("end of codding");
        System.out.println(p.getCod() +"  : " + p.getDescription());

        p.undoChange();
        System.out.println(p.getCod() +"  : " + p.getDescription());

    }
}
