import java.util.*;

public class Main {
    public static void main(String[] args) {
        int []a={1,2,3,4,500,600,700,800};
        int []b,c,d;
        System.out.println(Arrays.toString(a));
        b = Arrays.copyOf(a,a.length);
        System.out.println(Arrays.toString(b));
        c = Arrays.copyOf(a,4);//代码1
        System.out.println(Arrays.toString(c));//代码2
        d = Arrays.copyOfRange(a,a.length-4,a.length);//代码3
        System.out.println(Arrays.toString(d));
        c[c.length-1]=-100;//代码4

        d[d.length-1]=-200;
        System.out.println(Arrays.toString(a));
        int []jerry = Arrays.copyOf(d,1);//wrong
        System.out.println(Arrays.toString(jerry));
    }
}