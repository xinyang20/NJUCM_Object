public class BankAccount {
    double balance;
    double interest;
    public BankAccount() {}
    public double getBalance() {
        return balance;
    }
    public double getInterest() {
        return interest;
    }
    public void setInterest(double a) {
        interest = a;
    }
    public void putin(double money) {
        balance += money;
    }

    public void putout(double money) {
        balance -= money;
    }
}