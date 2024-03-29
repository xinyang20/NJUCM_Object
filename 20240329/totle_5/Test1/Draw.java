package step1;

import java.util.Scanner;

public class Draw {
    Scanner input=new Scanner(System.in);
    int r=input.nextInt();
    int a=input.nextInt();
    int b=input.nextInt();
    int h=input.nextInt();
    void draw(){
        
        System.out.println("输入半径： "+r);
        System.out.println("输出：");
        /******** Begin ********/
        //用 * 打印圆形
        System.out.println("   **");
        System.out.println(" ******");
        System.out.println("   **");



        /********  End  ********/

        System.out.println("输入矩形的长："+a);
        System.out.println("输入矩形的宽："+b);
        System.out.println("输出：");
        /******** Begin ********/
        //用 * 打印矩形
        for(int row=1;row<=b;row++){
            for(int col=1;col<=a;col++){
                System.out.print("*");
            }
            System.out.println(" ");
        }



        /********  End  ********/

        System.out.println("输入三角形的高："+h);
        System.out.println("输出：");
        /******** Begin ********/
        //用 * 打印三角形
        for(int row=1;row<=h;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            if(row!=h)System.out.println();
        }



        /********  End  ********/
    }
}
