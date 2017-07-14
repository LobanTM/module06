package module06.BVisitor;

/**
 * Created by tetya on 10.07.2017.
 */
public interface Visitor {
    public void visit(ElementA a);
    public void visit(ElementB b);
    public void visit(ElementC c);
}
