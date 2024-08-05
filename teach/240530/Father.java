public class Father {
    int a;
    double b;
    Father(){
        a=-1;
        b=-0.1;
    }
    Father(int a,double b){
        this.a=a;
        this.b=b;
    }
    void sum(){
        System.out.println("sum:"+(a+b));
    }
}
