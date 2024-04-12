import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String bin=new String();
        Scanner scanner =new Scanner(System.in);
        bin = scanner.nextLine();
        try{
            CheckBin checkBin=new CheckBin();
            checkBin.check(bin);
            int result=0;
            for(int i=bin.length()-1;i>=0;i--){
                result= (int) (result+(bin.charAt(i)-'0')*Math.pow(2,bin.length()-i-1));
            }
            System.out.println("十进制为："+result);
        }
        catch(BinException e){
            e.toShow();
        }

    }
}