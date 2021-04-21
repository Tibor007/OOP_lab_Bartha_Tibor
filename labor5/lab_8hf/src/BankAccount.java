public class BankAccount {
    public static final String PREFIX = "OTP";
    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    private static int numAccounts = 0;

    protected double balance;
    protected final String accountNumber;

    protected BankAccount() {
        BankAccount.numAccounts++;
        this.accountNumber = createAccountNumber();
        this.balance = 0;
    }

    public double getBalance() {
        return this.balance;
    }


    public String getAccountNumber() {
        return this.accountNumber;
    }


    private static String createAccountNumber() {
        if(BankAccount.numAccounts > Math.pow(10, 7)) {
            System.out.println("Could not create account number!");
            return BankAccount.PREFIX + "0".repeat(7);
        }

        StringBuilder str = new StringBuilder();

        str.append(BankAccount.PREFIX);

        for (int i = 0; i < BankAccount.ACCOUNT_NUMBER_LENGTH - BankAccount.PREFIX.length() - Math.log10(BankAccount.numAccounts) - 1; i++) {
            str.append("0");
        }

        str.append(BankAccount.numAccounts);

        return str.toString();

    }


    void deposit(double amount) {
        if (amount < 0)
            return;

        this.balance += amount;
    }


    boolean withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("You do not have sufficient funds for this operation!");
            return false;
        }

        this.balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return this.accountNumber + " (Bank account):\n\t\tBalance: EUR " + this.balance + "\n";
    }
}
