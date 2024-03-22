import tom.jiafei.*;
public class SunRise {
    public static void main(String args[]){
        SquareEquation equation=new SquareEquation(4,5,1);
        equation.getRoots();
        equation.setCoefficient(-3,4,5);
        equation.getRoots();
    }
}
