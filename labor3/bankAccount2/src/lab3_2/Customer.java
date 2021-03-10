package lab3_2;


public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount[] accounts;
    private int numAccounts;
    public static int MAX_ACCOUNTS = 10;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new BankAccount[MAX_ACCOUNTS];
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public void addAccount(BankAccount account) {
        if (this.numAccounts < MAX_ACCOUNTS) {
            this.accounts[this.numAccounts] = account;
            numAccounts++;
        }
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public BankAccount getAccount(String accountNumber) {

        for (int i=0;i< numAccounts; i++)
            if (accounts[i].getAccountNumber().equals(accountNumber))
                return accounts[i];
        System.out.println("ACCOUNT NUMBER: " + accountNumber + " DOES NOT EXIST!");
        return null;
    }

    public String getFirstName() {

        return this.firstName;
    }

    public String getLastName() {

        return this.lastName;
    }

    public void closeAccount(String accountNumber) {
        for (int i=0; i<numAccounts; i++){
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                accounts[i] = null;

                for (int j = i; j < numAccounts - 1; j++) {
                accounts[j]= accounts[j+1];

                }
            }
            numAccounts--;
            break;
        }

    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for (int i = 0; i < numAccounts; ++i) {
            result.append("\t" + accounts[i].toString() + "\n");
        }
        return result.toString();
    }

}
