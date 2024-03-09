import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        System.out.println("给你一个1至100的之间的整数，请猜测这个数");
        int resulNumber = random.nextInt(100) + 1;
        int yourGuess = 0;
        System.out.println("输入您的猜测：");
        yourGuess = reader.nextInt();
        while(yourGuess != resulNumber)//代码1
        {
            if(yourGuess > resulNumber)//代码2
            {
                System.out.println("猜大了，再输入你的猜测：");
                yourGuess = reader.nextInt();
            }
            else if(yourGuess < resulNumber)//代码3
            {
                System.out.println("猜小了，再输入你的猜测：");
                yourGuess = reader.nextInt();
            }
        }
        System.out.println("猜对了！");
    }
}