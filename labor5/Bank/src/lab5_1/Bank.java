package lab5_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
    }

    public Customer getCustomers(int id) {
        for (Customer customer : this.customers) {
            if (customer.getId() == id) {
                return customer;

            }
        }
        return null;
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public int numCustomer() {
        return this.customers.size();
    }

    private void printCustomers(PrintStream person) {
        StringBuilder buffer = new StringBuilder();
        for(Customer customer : this.customers){
            buffer.append(customer.getId()).append(", ")
                    .append(customer.getFirstName()).append(", ")
                    .append(customer.getLastName()).append(", ")
                    .append(customer.getNumAccounts())
                    .append("\n");
        }
    }
    public void printCustomersToStdout(){
        this.printCustomers(System.out);
    }

    public void CustomersToFile(String name){
        try {
            this.printCustomers(new PrintStream(name));
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

}
