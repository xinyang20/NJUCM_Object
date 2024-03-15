public class Battery {
    int energy;
    public Battery(int i){
        energy = i;
    }
    public void energyDown(int i){
        energy -= i;
    }
    public void energyUp(int i){
        energy += i;
    }
    public int getEnergy(){
        return energy;
    }
}