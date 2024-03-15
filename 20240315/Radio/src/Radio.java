public class Radio {
    Battery battery;
    public Radio(Battery a){
        battery = a;
    }
    public void open(){
        battery.energy = battery.energy - 10;
    }
    public void changeBattery(Battery New){
        battery = New;
    }
    public int getDumpEngery(){
        return battery.getEnergy();
    }

}
