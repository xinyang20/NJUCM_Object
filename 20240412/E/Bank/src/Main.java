public class Main {
    public static void main(String[] args) {
        ShowBank showBank=new ShowBank();
        Bank bank1=new Bank() {
            public void output() {
                System.out.println("这是中国银行");
            }
        };
        showBank.showMess(bank1);
        Bank bank2=new Bank() {
            public void output() {
                System.out.println("这是建设银行");
            }
        };
        showBank.showMess(bank2);
    }
}