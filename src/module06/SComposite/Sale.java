package module06.SComposite;

/**
 * Created by tetya on 10.07.2017.
 */
public class Sale implements Element {
    int saleProd;

    public Sale(int saleProd){
        this.saleProd = saleProd;
    }

    @Override
    public void draw() {
        System.out.println("SALE " + saleProd);
    }
}
