package com.company;

public class DateUtil {
    public static boolean leapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0)
            return true;
        else if (year % 100 == 0)
            return false;
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 0)
            return false;
        if (month <= 0 || month > 12)
            return false;
        if ((day <= 0 || day > 28) && month == 2)
            return false;
        if ((day <= 0 || day > 30) && (month == 4 || month == 6 || month == 9 || month == 11))
            return false;
        if (day <= 0 || day > 31)
            return false;
        return true;
    }
}
