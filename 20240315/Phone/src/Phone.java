public class Phone {
    Sim sim;
    Battery battery;
    public Phone(Sim sim,Battery battery){
        this.sim=sim;
        this.battery=battery;
    }
    public void call(String number,int time){
        System.out.println("打电话给："+number+"成功。");
        System.out.println("本次通话扣除"+time+"分钟。");
        sim.airtimeBalanceDown(time);
        battery.energyDown(time/10);
    }
    public void web(String website,int time){
        System.out.println("访问网络："+website+"成功。");
        System.out.println("本次上网扣除"+time*5+"Mb。");
        sim.dataTrafficDown(time*5);
        battery.energyDown(time/2);
    }
    public void charge(int time){
        battery.energyUp(time*5);
    }
    public void getSim(){
        System.out.println("以下为SIM卡相关信息：");
        sim.view();
    }
    public int getBattery(){
        return battery.getEnergy();
    }
}
