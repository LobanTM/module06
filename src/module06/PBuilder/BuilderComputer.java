package module06.PBuilder;

/**
 * Created by tetya on 09.07.2017.
 * абстрактний клас будівельника Computer
 */
public abstract class BuilderComputer {
    protected Computer computer;

    public Computer getComputer(){
        return computer;
    }

    public  void createComputer(){
        Computer computer = new Computer();
    }

    public abstract void buildSystemBlock();
    public abstract void buildDisplay();

}
