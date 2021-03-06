package lab3_1;

public class Custumer {
    private String firstName;
    private String lastName;
    private BankAccount account;

    public Custumer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setAccount(BankAccount account){
        this.account = account;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public BankAccount getAccount(){
        return account;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void closeAccount(){
        this.account = null;
    }

    @Override
    public String toString(){
        String result = firstName + " " + lastName+ " ";
        if(this.account != null){
           result += account.toString();
        }
        else {
            result+= " (no account)";
        }
        return result;
    }


}
