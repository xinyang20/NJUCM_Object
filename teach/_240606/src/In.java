public interface In {
    void cry();
    int x=0;
    static int y=0;
}

abstract class cat implements In{
    public abstract void cry();
}