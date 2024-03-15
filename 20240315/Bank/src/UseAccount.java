public class UseAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setInterest(0.2);
        account.putin(10000);
        System.out.println(account.getBalance());
        System.out.println(account.getInterest());
        account.putout(1000);
        System.out.println(account.getBalance());
    }
}