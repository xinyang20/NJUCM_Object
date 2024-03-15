public class Sim {
    String name;
    double dataTraffic;
    int airtimeBalance;
    public Sim(String name,double dt,int airtime){
        this.name=name;
        dataTraffic=dt*1024;
        airtimeBalance=airtime;
    }
    public void airtimeBalanceDown(double a){
        airtimeBalance -= a;
    }
    public void dataTrafficDown(double a){
        dataTraffic -= a;
    }
    public void view(){
        System.out.println("运营商名称："+name);
        System.out.println("剩余通话时长："+airtimeBalance+"分钟");
        System.out.println("剩余数据流量："+dataTraffic+"Mb");
    }
}
