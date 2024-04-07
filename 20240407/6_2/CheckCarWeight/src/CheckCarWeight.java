interface ComputerWeight{
    public double computeWeight();
}
class Television implements ComputerWeight{
    public double computeWeight() {//代码1
        return 3.5;
    }
}
class Computer implements ComputerWeight{
    public double computeWeight() {//代码2
        return 2.67;
    }
}
class WashMachine implements ComputerWeight{
    public double computeWeight() {//代码3
        return 13.8;
    }
}
class Refrigerrator implements ComputerWeight{//课后练习
    public double computeWeight() {
        return 18.6;
    }
}
class Truck{
    ComputerWeight [] goods;
    double totalWeights=0;
    Truck(ComputerWeight []goods){
        this.goods=goods;
    }
    public void setGoods(ComputerWeight[] goods){
        this.goods=goods;
    }
    public double getTotalWeights(){
        totalWeights=0;
        for(int i=0;i<goods.length;i++) {//代码4
            totalWeights+=goods[i].computeWeight();
        }
        return totalWeights;
    }
}
public class CheckCarWeight {
    public static void main(String[] args) {
        ComputerWeight [] goods=new ComputerWeight[650];
        for(int i=0;i<goods.length;i++){
            if(i%3==0)
                goods[i]=new Television();
            else if(i%3==1)
                goods[i]=new Computer();
            else if(i%3==2)
                goods[i]=new WashMachine();
        }
        Truck truck=new Truck(goods);
        System.out.printf("\n货车装载的货物重量：%-8.5f kg\n",truck.getTotalWeights());
        goods=new ComputerWeight[68];
        for(int i=0;i<goods.length;i++){
            if(i%2==0)
                goods[i]=new Television();
            else
                goods[i]=new WashMachine();
        }
        truck.setGoods(goods);
        System.out.printf("\n货车装载的货物重量：%-8.5f kg\n",truck.getTotalWeights());
    }
}