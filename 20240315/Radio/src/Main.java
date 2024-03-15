public class Main {
    public static void main(String[] args) {
        Battery Nanfu1 = new Battery(100);
        Battery Nanfu2 = new Battery(100);
        Radio radio = new Radio(Nanfu1);
        radio.open();
        System.out.println(radio.getDumpEngery());
        for(int i=0;i<9;i++)
            radio.open();
        System.out.println(radio.getDumpEngery());
        radio.changeBattery(Nanfu2);
        System.out.println(radio.getDumpEngery());
    }
}