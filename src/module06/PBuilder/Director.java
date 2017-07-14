package module06.PBuilder;

/**
 * Created by tetya on 09.07.2017.
 * виконує побудову обєкту не уточнюючи деталі побудови
 */
public class Director {
    private BuilderComputer builderComputer;

    public void setBuilderComputer(BuilderComputer builder){
        this.builderComputer = builder;
    }
    public Computer getComputer(){
        return builderComputer.getComputer();
    }

    public void constructComputer(){
        builderComputer.createComputer();
        builderComputer.buildDisplay();
        builderComputer.buildSystemBlock();
    }
}
