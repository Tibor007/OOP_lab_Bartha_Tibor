import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {
    private static int numCustomers = 0;

    private final int id;
    private final String firstName;
    private String lastName;
    private final ArrayList<BankAccount> accounts;

    public Customer(String firstName, String lastName) {
        Customer.numCustomers++;
        this.id = Customer.numCustomers - 1;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new ArrayList<>();
    }


    public void addAccount(BankAccount account) {
        this.accounts.add(account);
    }


    public void setLastName(String lastName) {
        if (lastName.length() > 0)
            this.lastName = lastName;
    }


    public int getId() {
        return this.id;
    }


    public int getNumAccounts() {
        return this.accounts.size();
    }


    public ArrayList<String> getAccountNumbers() {
        ArrayList<String> accountNumbersList = new ArrayList<>();

        for(BankAccount account : this.accounts)
            accountNumbersList.add(account.getAccountNumber());

        return accountNumbersList;
    }


    public BankAccount getAccount(String accountNumber) {
        for (BankAccount account : this.accounts)
            if (account.getAccountNumber().equals(accountNumber))
                return account;

        System.out.println("ACCOUNT NUMBER \"" + accountNumber + "\" DOES NOT EXIST!");
        return null;
    }


    public String getFirstName() {
        return this.firstName;
    }


    public String getLastName() {
        return this.lastName;
    }


    public void closeAccount(String accountNumber) {
        for(BankAccount account: this.accounts) {
            if(account != null && account.getAccountNumber().equals(accountNumber)) {
                this.accounts.remove(account);
                return;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append(firstName).append(' ').append(lastName).append("'s accounts:\n");

        if (this.accounts.size() == 0)
            result.append("\tNONE");
        else
            for (BankAccount account : this.accounts)
                if (account != null)
                    result.append("\t").append(account.toString());

        return result.toString();
    }
}
