public class Test {
    public static void main(String[] args) {
        CPU cpu=new CPU();
        cpu.setSpeed(2200);

        HardDisk disk=new HardDisk();
        disk.setAmount(200);

        PC pc=new PC();

        pc.setCpu(cpu);

        pc.setHD(disk);

        pc.show();
    }
}