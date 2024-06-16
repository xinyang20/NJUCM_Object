public class Son extends Father{
    double a=1.2;
    Son(){
        super();
    }
    Son(int a,double b){
        super(a,b);
    }
    void sub(){
        super.sum();
        System.out.println("sub:"+(a-b));
    }
}
