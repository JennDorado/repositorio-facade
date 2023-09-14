package fachada;

public class ComputerFacade {
    private CPU cpu;
    private HardDrive hardDrive;
    private Memory memory;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.hardDrive = new HardDrive();
        this.memory = new Memory();

    }

    public void star() {
        System.out.println("STARING.........");
        cpu.freeze();
        memory.load();
        hardDrive.read();
        cpu.jump();
        cpu.execute();

    }

}
