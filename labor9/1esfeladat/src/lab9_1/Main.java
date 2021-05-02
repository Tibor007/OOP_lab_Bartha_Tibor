package lab9_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int year = 2021, month,day;
        ArrayList<MyDate> dateArrayList = new ArrayList<>();
        MyDate[] dateArray = new MyDate[10];

        Random random = new Random();



        for(int i=0; i<=9; ){
            month = random.nextInt(12) + 1;
            day = random.nextInt(31) + 1;
            if(DateUtil.isValidDate(year, month, day)){
                MyDate datum = new MyDate(year,month,day);
                dateArrayList.add(datum);
                dateArray[i]=datum;
                i++;
            }
        }
        System.out.println("Elott");
        for(int i=0; i< dateArrayList.size();i++)
        {
            System.out.println(dateArrayList.get(i));
        }

        System.out.println("\nUtan");
        Collections.sort(dateArrayList);
        for (MyDate dates : dateArrayList)
        {
            System.out.println(dates + " ");
        }

        System.out.println("\nRendezes elott-lista");
        for(MyDate date: dateArray){
            System.out.println(date);
        }
        Arrays.sort(dateArray);

        System.out.println("Rendezes utan-lista");
        for(MyDate date: dateArray){
            System.out.println(date);
        }
    }
}
