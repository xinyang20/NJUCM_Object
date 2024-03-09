import java.util.Arrays;

public class Main {
    public static boolean Iswan(int n){
        int sum=0;
        for(int i=1;i<n;i++)
            if(n%i==0)
                sum+=i;
        if(sum==n)return true;
        return false;
    }

    public static void main(String[] args) {
        int []a=new int[10];
        int cnt=0;
        for(int i=1;i<=1000;i++)
            if(Iswan(i)){
                a[cnt]=i;
                cnt++;
            }
        System.out.println(Arrays.toString(a));
    }

}