package lab12_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Write an input line: ");
        String line = console.nextLine();

        String[] items = line.split(" ");
        double sum = 0;
        for (String i : items) {
            try {
                sum += Double.parseDouble(i);
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Invalid number: " + i);
            }
        }

        System.out.println("Sum: " + sum);
    }

}

