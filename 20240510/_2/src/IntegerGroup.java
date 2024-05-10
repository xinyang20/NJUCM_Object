public class IntegerGroup {
    int n;
    private Group strategy;
    public void setStrategy(Group strategy){
        this.strategy=strategy;
        strategy.group(n);
    }
    public IntegerGroup(int n){
        this.n=n;

    }
}
