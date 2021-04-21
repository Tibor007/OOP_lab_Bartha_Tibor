import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private final ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public Customer getCustomer(int customerId) {
        for (Customer c : this.customers)
            if (c.getId() == customerId)
                return c;

        return null;
    }


    public int numCustomers() {
        return this.customers.size();
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }


    private void printCustomers(PrintStream ps) {
        ps.println("ID, First_Name, Last_Name, Number_of_Bank_Accounts");

        StringBuilder buffer = new StringBuilder();

        for (Customer customer : this.customers) {
            buffer.append(customer.getId()).append(", ")
                    .append(customer.getFirstName()).append(", ")
                    .append(customer.getLastName()).append(", ")
                    .append(customer.getNumAccounts())
                    .append("\n");
        }

        ps.print(buffer);
    }


    public void printCustomersToStdout() {
        this.printCustomers(System.out);
    }


    public void printCustomersToFile(String fileName) {
        try {
            this.printCustomers(new PrintStream(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
