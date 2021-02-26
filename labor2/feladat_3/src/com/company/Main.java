package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(DateUtil.isValidDate(2000, 2, 29));
        System.out.println(DateUtil.isValidDate(2000, 2, 30));
        System.out.println(DateUtil.isValidDate(1900, 2, 29));
        System.out.println(DateUtil.isValidDate(1900, 2, 28));
        System.out.println(DateUtil.isValidDate(-1900, 2, 28));
        System.out.println(DateUtil.isValidDate(0, 2, 28));
        System.out.println(DateUtil.isValidDate(2021, 2, 29));
        System.out.println(DateUtil.isValidDate(2020, 2, 29));
        System.out.println(DateUtil.isValidDate(2020, 1, 32));
        System.out.println(DateUtil.isValidDate(2020, 1, 0));
        System.out.println(DateUtil.isValidDate(2020, 0, 0));
        System.out.println(DateUtil.isValidDate(2020, 4, 31));

        System.out.println("\n");

        Random rand = new Random();
        int year, month, day;
        int counter = 0;
        for (int i = 0; i < 100; i++) {
            year = rand.nextInt(3001);
            month = rand.nextInt(12) + 1;
            day = rand.nextInt(31) + 1;

            if (!DateUtil.isValidDate(year, month, day)) {
                counter++;
                System.out.println(year + "/" + month + "/"+ day);
            }
        }
        System.out.println(counter);

    }
}
