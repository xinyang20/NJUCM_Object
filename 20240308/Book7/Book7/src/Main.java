public class Main {
    public static int  jiecheng(int n){
        int result=1;
        for(int i=1;i<=n;i++)
            result = result * i;
        return result;
    }
    public static void main(String[] args) {
        int result=0;
        int i;
        for(i=1;result+jiecheng(i)<=9999;i++)
            result+=jiecheng(i);
        System.out.println(i-1);
    }
}