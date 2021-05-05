package lab9_2;

import lab9_1.MyDate;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
       /* Company company = new Company("TengszLengszKFT");
        company.hireAll("employees.csv");
        company.printAll(System.out);*/

        Employee emp1 = new Employee("Hunor", "Simon", 3500, new MyDate(2000, 10, 12));
        Employee emp2 = new Employee("Jozsef", "Antal", 3500, new MyDate(2001, 9, 25));
        Manager man1 = new Manager("Tibor", "Bartha", 5000, new MyDate(2001, 10, 4), "Villamoshajtasok");

        Company ceg = new Company("TengszLengszKFT");
        ceg.hire(emp1);
        ceg.hire(emp2);
        ceg.hire(man1);

        ceg.printAll(System.out);

        try {
            PrintStream kimenet = new PrintStream("managers.txt");
            ceg.printManagers(kimenet);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ceg.naturalSort();
        ceg.printAll(System.out);

        //fizetes szerinti csokkeno
        Comparator<Employee> comparatorBySalary = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getSalary() > o2.getSalary()){
                    return -1;
                }
                if(o1.getSalary() > o2.getSalary()){
                    return 1;

                }
                //ha egyforma akkor ABC szerinti csokkeno
                return -o1.compareTo(o2);
            }
        };

        ceg.sortByComparator(comparatorBySalary);
        ceg.sortByComparator(Employee.comparatorByBirthdate);
        ceg.printAll(System.out);
        ceg.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getFirstName().length() - o2.getFirstName().length();
            }
        });
    }
}
