package lab8.jarmuvek;

public class Hajo extends Jarmu {
    private int matrozokSzama;
    private double horgonySulya;

    public Hajo(int ferohely, JarmuTipus tipus, String marka, int matrozokSzama, double horgonySulya) {
        super(ferohely, tipus, marka);
        this.matrozokSzama = matrozokSzama;
        this.horgonySulya = horgonySulya;
    }

    @Override
    public void kozlekedes() {
        System.out.println("Uszkal az ocean vizen");
    }

    public boolean sullyedes() {

        return true ;
    }

    public boolean sullyedoE() {
        if (horgonySulya > 100) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "HAJO <==> " + "matrozokSzama: " + this.matrozokSzama + " horgonySulya: " + this.horgonySulya + super.toString();
    }
}
