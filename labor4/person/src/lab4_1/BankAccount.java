package lab4_1;

public class BankAccount {

        private String accountNumber;
        private double balance;

        public BankAccount(String accountNumber) {
            this.accountNumber = accountNumber;
            this.balance = 0.0D;
        }

        public String getAccountNumber() {
            return this.accountNumber;
        }

        public double getBalance() {
            return this.balance;
        }

        public void deposit(double value) {
            if (value > 0.0D) {
                this.balance += value;
            }

        }

        public boolean withdraw(double value) {
            if (value > 0.0D && value <= this.balance) {
                this.balance -= value;
                return true;
            } else {
                return false;
            }
        }

        public String toString() {
            return this.accountNumber + " balance: " + this.balance;
        }

}

