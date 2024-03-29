package step1;

import java.util.Scanner;

public class Circle extends Shape{
    private static final double PI = 3.14;

    public double getPerimeter(double r) {
        //求圆的周长
        /******** Begin ********/
        return 3.14*r*2;


        /********  End  ********/

    }

    public double getArea(double r) {
        //求圆的面积
        /******** Begin ********/
        return 3.14*r*r;

        
        /********  End  ********/
    }

}
