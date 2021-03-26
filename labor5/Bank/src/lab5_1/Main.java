package lab5_1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<BankAccount> accounts = new ArrayList<>();
        for (int i = 0; i < 150; ++i) {
            accounts.add(new BankAccount());
        }
        for (BankAccount account : accounts){
            System.out.println(account);
        }
    }
}