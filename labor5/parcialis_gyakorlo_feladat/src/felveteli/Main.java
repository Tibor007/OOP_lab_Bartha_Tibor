package felveteli;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Diak diak1 = new Diak();
        diak1.setKnev("Maria");
        diak1.setVnev("Mezei");
        diak1.setErettsegi(7.56);
        diak1.setMatematika(8.78);

        Diak diak2 = new Diak();
        diak2.setKnev("Imre");
        diak2.setVnev("Asztalos");
        diak2.setErettsegi(8.45);
        diak2.setMatematika(7.25);

        Informatika informatika = new Informatika();
        informatika.ujBeiratkozo(diak1);
        informatika.ujBeiratkozo(diak2);

        informatika.listazOsszeas();

        ArrayList<Diak> diakok = readFromFile("import.txt");
        for (Diak diak : diakok){
            informatika.ujBeiratkozo(diak);
        }

        informatika.listazAtlag(8);
        System.out.println("Felvetelizok szama "+ informatika.felvetelizokSzama());
        System.out.println("Felvetelizok atlaga "+ informatika.felvetelizokAtlaga());


    }

    public static ArrayList<Diak> readFromFile(String file_name) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(file_name));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        ArrayList<Diak> diakok = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String[] items = scanner.nextLine().trim().split(" ");
            Diak diak = new Diak();
            diak.setVnev(items[0]);
            diak.setKnev(items[1]);
            diak.setErettsegi(Double.parseDouble(items[2]));
            diak.setMatematika(Double.parseDouble(items[3]));

            diakok.add(diak);
        }

        return diakok;


    }



}
