package step1;

import java.util.Scanner;

public class Rectangle extends Shape{

    public double getPerimeter(double a,double b) {
        //求长方形的周长
        /******** Begin ********/
        return (a+b)*2;


        /********  End  ********/
    }

    public double getArea(double a,double b) {
        //求长方形的面积
        /******** Begin ********/
        return a*b;


        /********  End  ********/
    }

}
