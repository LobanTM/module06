package module06.SFacade;

/**
 * Created by tetya on 10.07.2017.
 */
public class CompeterFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hDrive;

    public CompeterFacade(){
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hDrive = new HardDrive();
    }

    public void startComputer(){
        long BOOT_ADDRESS = 255;
        long BOOT_SECTOR = 855;
        int SECTOR_SIZE = 5;

        cpu.freeze();
        memory.load(BOOT_ADDRESS, hDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }

}
