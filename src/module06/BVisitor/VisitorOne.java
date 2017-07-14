package module06.BVisitor;

/**
 * Created by tetya on 10.07.2017.
 */
public class VisitorOne implements Visitor {
    @Override
    public void visit(ElementA a) {
        System.out.println("Перший відвідувач працює з елементом А");
    }

    @Override
    public void visit(ElementB b) {
        System.out.println("Перший відвідувач працює з елементом В");
    }

    @Override
    public void visit(ElementC c) {
        System.out.println("Перший відвідувач працює з елементом С");
    }
}
