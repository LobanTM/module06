package module06.PBuilder;

/**
 * Created by tetya on 09.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        BuilderComputer builder = new CheapBuilderComputer();

        director.setBuilderComputer(builder);

        director.constructComputer();

        Computer comp = director.getComputer();

        System.out.println(comp.toString());

    }
}
