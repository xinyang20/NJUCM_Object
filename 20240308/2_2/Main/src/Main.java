public class Main {
    public static void main(String[] args) {
        int a[]={100,200,300};
        System.out.println(a.length);//代码1
        System.out.println(a);//代码2
        int b[][]={{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
        System.out.println(b.length);//代码3
        System.out.println(b[4][2]);
        b[4]=a;//代码4
        System.out.println(b[4][2]);
    }
}