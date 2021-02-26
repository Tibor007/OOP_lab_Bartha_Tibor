package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("OTP00001");
        BankAccount account2 = new BankAccount("OTP00002");

        System.out.println(account1);
        account1.deposit(1000);
        System.out.println(account1);

        if(account1.withdraw(500)){
            System.out.println(account1);
        }

        if (account1.withdraw(1000)){
            System.out.println(account1);
        }

        System.out.println(account2);
        account2.deposit(2000);
        System.out.println(account2);
    }
}
