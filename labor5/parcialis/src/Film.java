import java.util.ArrayList;

public class Film {
    private String neve;
    private String rendezo;
    private int kiadasi_ev;
    private ArrayList<Szinesz> szineszek;

    public Film(String neve, String rendezo, int kiadasi_ev) {
        this.neve = neve;
        this.rendezo = rendezo;
        this.kiadasi_ev = kiadasi_ev;
    }

    public String getNeve() {
        return neve;
    }

    public String getRendezo() {
        return rendezo;
    }

    public int getKiadasi_ev() {
        return kiadasi_ev;
    }

    //Uj szinesz hozzadasa
    public void ujSzinesz(Szinesz szinesz){
        this.szineszek.add(szinesz);
    }

    //Meglevo szinesz torlese
    public void felMondas(String id){
        for(Szinesz szinesz : this.szineszek){
            if (id.equals(szinesz.getId())){
                this.szineszek.remove(szinesz);
            }
        }
    }

    //Stablista kiiratasa
    public void stabLista(){
        for(Szinesz szinesz : this.szineszek){
            System.out.println(szinesz);
        }
    }


}

