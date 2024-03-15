public class Main {
    public static void main(String[] args) {
        Sim sim = new Sim("中国联通",10,100);
        Battery battery = new Battery(80);
        Phone phone = new Phone(sim,battery);
        phone.getSim();
        phone.call("15815811581",10);
        phone.web("www.baidu.com",20);
        phone.getSim();
        System.out.println("剩余电量："+phone.getBattery());
        phone.charge(2);
        System.out.println("剩余电量："+phone.getBattery());
    }
}