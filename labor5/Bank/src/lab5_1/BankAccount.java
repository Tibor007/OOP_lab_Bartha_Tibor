package lab5_1;
public class BankAccount {
    private final String accountNumber;
    private double balance;
    public static final String PREFIX = "OTP";
    public static final int ACCOUNT_NUMBER_LENGTH= 10;
    private static int numAccounts = 0;


    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        ++numAccounts;
    }

    public BankAccount() {
        ++numAccounts;
        this.accountNumber = createAccountNumber();
    }

    private String createAccountNumber(){
        int prefixLength = PREFIX.length();
        int numAccountLength = String.valueOf(numAccounts).length();
        int zerosCount = ACCOUNT_NUMBER_LENGTH - prefixLength - numAccountLength;

        String result = PREFIX;
        for (int i=0; i<zerosCount; i++){
            result+="0";
        }

        result += numAccounts;
        return result;
    }


    public String getAccountNumber() {

        return accountNumber;
    }

    public double getBalance() {

        return balance;
    }

    public void deposit(double value) {
        if (value > 0) {
            this.balance += value;
        }
    }

    public boolean withdraw(double value) {
        if (value > 0 && value <= this.balance) {
            this.balance -= value;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.accountNumber + " balance: " + this.balance;
    }
}
