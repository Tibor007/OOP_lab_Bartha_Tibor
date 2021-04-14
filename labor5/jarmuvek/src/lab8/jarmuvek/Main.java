package lab8.jarmuvek;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Jarmu auto1 = new Auto(5, JarmuTipus.SZARAZFOLDI, 4, "AlfaRomeo", "Sedan");
        Jarmu auto2 = new Auto(5, JarmuTipus.SZARAZFOLDI, 4, "BMW", "Sedan");
        Jarmu hajo1 = new Hajo(20, JarmuTipus.VIZI, "DELTA", 4, 280);
        Jarmu auto3 = new Auto(5, JarmuTipus.SZARAZFOLDI, 4, "Audi", "Sedan");
        Jarmu auto4 = new Auto(5, JarmuTipus.SZARAZFOLDI, 4, "Ford", "Pickup");
        Jarmu auto5 = new Auto(5, JarmuTipus.SZARAZFOLDI, 4, "Mercedes", "S");


        ArrayList<Jarmu> jarmuvek = new ArrayList<>();
        jarmuvek.add(auto1);
        jarmuvek.add(auto2);
        jarmuvek.add(auto3);
        jarmuvek.add(auto4);
        jarmuvek.add(auto5);
        jarmuvek.add(hajo1);


        for (Jarmu j : jarmuvek) {
            j.kozlekedes();

            if (j instanceof Hajo) {
                Hajo aux = (Hajo) j;
                System.out.println(aux.sullyedoE());
            }
            System.out.println(j);
        }
    }
}
