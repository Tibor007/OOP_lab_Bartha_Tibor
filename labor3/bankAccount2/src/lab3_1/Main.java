package lab3_1;

public class Main {
    public static void main(String[] args) {
        Custumer custumer1= new Custumer("John","BLACK");
        System.out.println(custumer1.toString());
        custumer1.setAccount(new BankAccount("12B22"));
        System.out.println(custumer1.toString());

        custumer1.getAccount().deposit(1000);
        System.out.println(custumer1);


        Custumer customer1 = new Custumer("John", "BLACK");
        System.out.println(customer1);

        customer1.setAccount(new BankAccount("OTP00001"));
        System.out.println(customer1);

        customer1.getAccount().deposit(1000);
        System.out.println(customer1);

        Custumer custumer2 = new Custumer("Mary", "WHITE");
        custumer2.setAccount(new BankAccount("OTP00002"));
        System.out.println(custumer2);

        custumer2.setLastName("BLACK");
        System.out.println(custumer2);

        custumer2.closeAccount();
        System.out.println(custumer2);

        custumer2.setLastName(custumer1.getLastName());
        custumer2.setAccount(customer1.getAccount());

        System.out.println(custumer1);
        System.out.println(custumer2);
    }
}

