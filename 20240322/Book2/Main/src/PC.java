public class PC {
    CPU cpu;
    HardDisk HD;

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setHD(HardDisk HD) {
        this.HD = HD;
    }
    public void show(){
        System.out.println("CPU Speed:"+cpu.getSpeed());
        System.out.println("HardDisk Amount:"+HD.getAmount());
    }
}
