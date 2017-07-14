package module06.SComposite;

/**
 * Created by tetya on 10.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Product computer = new Product("computer");
        Product player = new Product("player");
        Product monitor = new Product("monitor");
        Product smartphone = new Product("smartphone");
        Product video = new Product("video");
        Product photo = new Product("photo");
        Product mouse = new Product("mouse");

        Sale s1 = new Sale(20);
        Sale s2 = new Sale(10);
        Sale s3 = new Sale(50);
        Sale s4 = new Sale(40);
        Sale s5 = new Sale(60);

        CompositeBox box1 = new CompositeBox();
        box1.addProd(computer);
        box1.addProd(s1);

        CompositeBox box2 = new CompositeBox();
        box2.addProd(player);
        box2.addProd(photo);
        box2.addProd(s2);

        CompositeBox box3 = new CompositeBox();
        box3.addProd(smartphone);
        box3.addProd(computer);
        box3.addProd(s3);

        CompositeBox box4 = new CompositeBox();
        box4.addProd(mouse);
        box4.addProd(s4);

        CompositeBox box5 = new CompositeBox();
        box5.addProd(video);
        box5.addProd(monitor);
        box5.addProd(s5);

        CompositeBox box6 = new CompositeBox();
        box6.addProd(box1);
        box6.addProd(box3);

        box6.draw();
    }
}
