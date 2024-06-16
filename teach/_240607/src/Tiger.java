public class Tiger extends Thread{
    public void run(){
        for(int i=1;i<=6;i++){
            System.out.print("|Tiger"+i);
            try{
                sleep(1000);
            }catch (Exception ex){}
        }
    }
}
