package module06.SComposite;

/**
 * Created by tetya on 10.07.2017.
 */
public class Product implements Element {
    String nameProd;

    public Product(String nameProd){
        this.nameProd = nameProd;
    }
    @Override
    public void draw() {
        System.out.println("Product " + nameProd);
    }
}
