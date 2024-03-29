package step1;

import java.util.Scanner;

public class Triangle extends Shape{
    public double getPerimeter(double a,double b,double c) {
        /******** Begin ********/
        //判断是否可以形成三角形,可以则返回周长的大小，不可以则输出"该三角形不合法！！"，并返回 0；
        if(!Isable(a,b,c)){
            System.out.println("该三角形不合法！！");
            return 0;
        }
        else{
            return a+b+c;
        }



        /********  End  ********/
    }

    public double getArea(double a,double b,double c) {
        /******** Begin ********/
        //判断是否可以形成三角形,可以则返回面积的大小，不可以则输出"该三角形不合法！！"，并返回 0；
        if(!Isable(a,b,c)){
            System.out.println("该三角形不合法！！");
            return 0;
        }
        else{
            double p=(a+b+c)/2;
            double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
            return area;
        }




        /********  End  ********/
    }
    public boolean Isable(double a,double b,double c){
        if(a+b<=c)return false;
        if(a+c<=b)return false;
        if(b+c<=a)return false;
        return true;
    }
}
