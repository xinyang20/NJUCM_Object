public class User {
    public static void main(String[] args) {
        Vehicle car1,car2;
        car1 = new Vehicle();//代码7
        car2 = new Vehicle();//代码8
        car1.setPower(128);
        car2.setPower(76);
        System.out.println("Car1的功率是："+car1.getPower());
        System.out.println("Car2的功率是："+car2.getPower());
        car1.speedUp(80);//代码9
        car2.speedUp(80);//代码10
        System.out.println("Car1目前的速度："+car1.getSpeed());
        System.out.println("Car2目前的速度："+car2.getSpeed());
        car1.speedDown(10);
        car2.speedDown(20);
        System.out.println("Car1目前的速度："+car1.getSpeed());
        System.out.println("Car2目前的速度："+car2.getSpeed());
    }
}