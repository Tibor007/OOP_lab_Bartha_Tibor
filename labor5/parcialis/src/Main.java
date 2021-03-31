import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Szinesz szinesz1 = new Szinesz("Brad", "Pitt", 1997, true);
        Szinesz szinesz2 = new Szinesz("Johny", "Deep", 1998, true);
        Szinesz szinesz3 = new Szinesz("Emma", "Watson", 1999, false);

        szinesz2.setDijak_szama();
        szinesz3.setDijak_szama();
        szinesz3.setDijak_szama();

        System.out.println(szinesz1);
        System.out.println(szinesz2);
        System.out.println(szinesz3);

        Film film1 = new Film("Halalos Parcialis", "Antal Margit", 2021);

        ArrayList<Szinesz> szineszek = readFromFile("szineszek.csv");
        for(Szinesz szinesz : szineszek){
            System.out.println(szinesz);
        }
    }

    public static ArrayList<Szinesz> readFromFile(String file_name) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(file_name));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        ArrayList<Szinesz> szineszek = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String Line = scanner.nextLine();
            if (Line.isEmpty()) {
                continue;
            }
            String[] items = Line.trim().split(", ");
            Szinesz sz = new Szinesz(items[1], items[0], Integer.parseInt(items[3]), Boolean.parseBoolean(items[2]));
            for(int i=1; i<=Integer.parseInt(items[4]); i++)
            {
                sz.setDijak_szama();
            }
            szineszek.add(sz);

        }
        return szineszek;
    }


}