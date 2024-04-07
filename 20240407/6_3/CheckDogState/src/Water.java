interface WaterState{
    abstract public void showState();
}
class BolingWater implements WaterState{
    public void showState(){
        System.out.println("水在沸腾");
    }
}
class HotWater implements WaterState{
    public void showState(){
        System.out.println("水在沸腾");
    }
}
class WarmWater implements WaterState{
    public void showState(){
        System.out.println("水是温的");
    }
}
class ColdWater implements WaterState{
    public void showState(){
        System.out.println("水是冷的");
    }
}
class IceWater implements WaterState{
    public void showState(){
        System.out.println("水是冰的");
    }
}