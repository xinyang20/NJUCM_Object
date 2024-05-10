public class Main {
    public static void main(String[] args) {
        IntegerGroup integerGroup=new IntegerGroup(20);
        integerGroup.setStrategy(new StrategyOne());
        integerGroup.setStrategy(new StrategyTwo());
        integerGroup.setStrategy(new StrategyThree());

    }
}