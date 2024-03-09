import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int result[]=new int[26];
        int cnt=0;
        for(int i=1;i<=100;i++)
            if(IsPrime(i)){
                result[cnt]=i;
                cnt++;
            }
        System.out.println(Arrays.toString(result));
    }

    private static boolean IsPrime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }
}