package module06.BVisitor;

/**
 * Created by tetya on 10.07.2017.
 */
public class VisitorThree implements Visitor {
    @Override
    public void visit(ElementA a) {
        System.out.println("Третій відвідувач працює з елементом А");
    }

    @Override
    public void visit(ElementB b) {
        System.out.println("Третій відвідувач працює з елементом В");
    }

    @Override
    public void visit(ElementC c) {
        System.out.println("Третій відвідувач працює з елементом С");
    }
}
