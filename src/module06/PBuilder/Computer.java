package module06.PBuilder;

/**
 * Created by tetya on 09.07.2017.
 * клас обєкту
 */
public class Computer {
    String systemBlock;
    String display;

    public void setDisplay(String display1) {
        this.display = display1;
    }

    public void setSystemBlock(String systemBlock1) {
        this.systemBlock = systemBlock1;
    }

    @Override
    public String toString() {
        return systemBlock + "/" + display;
    }
}
