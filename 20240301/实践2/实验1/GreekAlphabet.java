public class GreekAlphabet {
    public static void main(String argc[]){
        int startPosition=0,endPosition=0;
        char cStart='α',cEnd='ω';
        startPosition = (int)cStart;//代码1
        endPosition = (int)cEnd;//代码2
        System.out.println("希腊字母\'α\'在unicode表中顺序位置："+startPosition);
        System.out.println("希腊字母表：");
        for(int i=startPosition;i<=endPosition;i++){
            char c='\0';
            c=(char)i;//代码3
            System.out.print(" "+c);
            if((i-startPosition+1)%10==0)
                System.out.println();
        }
    }
}
