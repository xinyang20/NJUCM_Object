public class Demo {
    public static void main(String args[]){
        Undergraduate undergraduate=new Undergraduate("张三",20,"本科","通信",2000);
        Graduate graduate=new Graduate("李四",25,"在职研究生","计算机",3000,1000);
        undergraduate.show();
        graduate.show();
    }
}
