public class Cat extends Thread{
    public void run() {
        for(int i=1;i<=6;i++){
            System.out.print("|Cat"+i);
        }
    }
}
