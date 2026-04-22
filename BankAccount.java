import java.util.*;

class BankAccount {
    double balance = 900;
    public void deposit (double amount1) {

        if (amount1 <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        balance += amount1;
    }

    public void withdraw (double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    public double getBalance () {
        return balance;
    }   

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        System.out.println("Initial balance=" + account.getBalance());
        account.deposit(100);
        System.out.println("Balance after depositing = " + account.getBalance());
        account.withdraw(50);
        System.out.println("Balance after withdrawing = " + account.getBalance());
    }
}
