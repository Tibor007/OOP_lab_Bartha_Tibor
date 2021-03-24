package lab4_2;

public class BankAccount {
    private double balance;
    private final String accountNumber;

    BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    void deposit(double amount) {
        if(amount < 0)
            return;

        this.balance += amount;
    }

    boolean withdraw(double amount) {
        if(this.balance - amount < 0) {
            System.out.println("You do not have sufficient funds for this operation!");
            return false;
        }

        this.balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return this.accountNumber + ": EUR " + this.balance;
    }
}
