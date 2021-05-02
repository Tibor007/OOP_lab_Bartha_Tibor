package lab9_2;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("TengszLengszKFT");
        company.hireAll("employees.csv");
        company.printAll(System.out);
    }
}
