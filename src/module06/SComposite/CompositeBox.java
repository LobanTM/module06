package module06.SComposite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tetya on 10.07.2017.
 */
public class CompositeBox implements Element {

    private List<Element> list = new ArrayList<>();

    public void addProd(Element e){
        list.add(e);
    }

    public void removePord(Element e){
        list.remove(e);
    }

    @Override
    public void draw() {
        for(Element prod: list )
            prod.draw();
    }
}
