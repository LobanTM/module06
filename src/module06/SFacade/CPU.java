package module06.SFacade;

/**
 * Created by tetya on 10.07.2017.
 */
public class CPU {
    public void freeze() {
        System.out.println("CPU freeze");
    }
    public void jump(long position) {
        System.out.println("CPU jump to position " + position); }
    public void execute() {
        System.out.println("CPU execute");
    }
}
