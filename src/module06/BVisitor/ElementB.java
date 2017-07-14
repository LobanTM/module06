package module06.BVisitor;

/**
 * Created by tetya on 10.07.2017.
 */
public class ElementB implements Element {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
