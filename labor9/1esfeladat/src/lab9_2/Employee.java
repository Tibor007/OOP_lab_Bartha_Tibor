package lab9_2;

import lab9_1.MyDate;

public class Employee implements Comparable<Employee> {
    private final int ID;
    private String firstName;
    private String lastName;
    private double salary;
    private MyDate birthDate;
    private static int counter;

    public Employee(String firstName, String lastName, double salary, MyDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;
        counter++;
        this.ID = counter;

    }

    public int getID() {

        return ID;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public double getSalary() {

        return salary;
    }

    public MyDate getBirthDate() {

        return birthDate;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append(this.ID);
        if (this instanceof Manager) {
            buffer.append(" (Manager)\n");

        } else {
            buffer.append(" (Employee)\n");
        }

        buffer.append(this.ID).append("\n")
                .append("\tFirst Name : ").append(this.firstName).append("\n")
                .append("\tLast Name : ").append(this.lastName).append("\n")
                .append("\tSalary : ").append(this.salary).append("\n")
                .append("\tBirth Date: ")
                .append(this.birthDate.getYear()).append("-")
                .append(this.birthDate.getMonth()).append("-")
                .append(this.birthDate.getDay())
                .append("\n ******* \n");


        return buffer.toString();
    }

    @Override
    public int compareTo(Employee o) {
        /*int firstName = this.firstName.compareTo(o.firstName);
        int lastName = this.lastName.compareTo(o.lastName);

        if(lastName>0)
            return lastName;
        if(firstName > 0)
            return firstName;*/
        String thisName = this.lastName + this.firstName;
        String oName = o.lastName + o.firstName;
        return thisName.compareTo(oName);
    }
}
