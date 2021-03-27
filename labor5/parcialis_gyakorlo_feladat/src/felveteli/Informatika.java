package felveteli;

import java.util.ArrayList;

public class Informatika {

    public ArrayList<Diak> felvetelizok;

    public Informatika() {
        this.felvetelizok = new ArrayList<>();
    }

    public void ujBeiratkozo(Diak diak){
        this.felvetelizok.add(diak);
    }

    public int felvetelizokSzama(){
        return this.felvetelizok.size();
    }

    public double felvetelizokAtlaga(){
        if (this.felvetelizokSzama() == 0){
            return 0;
        }
        double nagy_atlag = 0;
        for (Diak diak : this.felvetelizok){
            nagy_atlag += diak.atlag();

        }
        return nagy_atlag/this.felvetelizokSzama();

    }

    public void listazOsszeas(){
        for (Diak diak : this.felvetelizok){
            System.out.println(diak);
        }
    }

    public void listazAtlag(double atlag){
        for (Diak diak : this.felvetelizok){
            if (diak.atlag()>atlag)
                System.out.println(diak);
        }
    }

}



