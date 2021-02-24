package bankszamla;

public class BankAccount {

    //Attributes -> tulajdonsagok
    private double balance; //egysegbezaras -> encapsulation
    private String accountNumber;


    //Methods -> viselkedesek

    ///Constructor
    ///inicializalas, lefoglalas
    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    //Getters
    public double getBalance()
    {
        return this.balance;
    }
    //Setters

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    @Override
    public  String toString()
    {
        //felepitjuk a kimenetet
        //Bank accpunt:... , balance:...;
        return "Bank accout: " + this.accountNumber + "Balance: " +this.balance ;
    }
}