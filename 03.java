
class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

     public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
    }


}

class Bank {
    private BankAccount[] accounts = new BankAccount[5];
    private int count = 0;

    public void addAccount(BankAccount acc) {
        if (count < 5) accounts[count++] = acc;
    }

    public void withdrawFromAccount(int accNo, double amount) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber() == accNo) {
                try {
                    accounts[i].withdraw(amount);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void displayAllAccounts() {
        for (int i = 0; i < count; i++) {
            System.out.println(accounts[i]);
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAccount(new BankAccount(1001, "Alice", 5000.0));
        bank.addAccount(new BankAccount(1002, "Bob", 3000.0));

        bank.withdrawFromAccount(1001, 6000.0); // should fail
        bank.withdrawFromAccount(1002, 1000.0); // should succeed

        bank.displayAllAccounts();
    }
}