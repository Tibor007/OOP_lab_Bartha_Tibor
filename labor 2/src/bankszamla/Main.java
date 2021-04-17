package bankszamla;

public class Main {


    public static void main(String[] args) {
	// itt hozunk letre obijektumokat
            BankAccount myAccount = new BankAccount(999999, "AGSHIASDHIA");
            BankAccount myAccount1 = new BankAccount(999999);
            BankAccount myAccount2 = new BankAccount();

            System.out.println(myAccount.toString());
            System.out.println(myAccount1);
            System.out.println(myAccount2.toString());

        System.out.println(myAccount.getBalance());
        myAccount.setAccountNumber("12345");

        System.out.println(myAccount);

    }
}
