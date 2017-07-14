package module06.PBuilder;

/**
 * Created by tetya on 09.07.2017.
 * реалізація абстрактного класу будівельника
 */
public class CheapBuilderComputer extends BuilderComputer{
    //Computer computer;

    @Override
    public void buildSystemBlock() {
        computer.setSystemBlock("SYSTEM BLOCK");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("DYSPLAY");
    }
}
