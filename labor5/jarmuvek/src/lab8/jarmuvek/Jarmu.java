package lab8.jarmuvek;

public class Jarmu {
    protected JarmuTipus tipus;
    protected int ferohelyekSzama;
    protected String marka;

    public Jarmu(int ferohely, JarmuTipus tipus, String marka) {
        this.ferohelyekSzama = ferohely;
        this.tipus = tipus;
        this.marka = marka;
    }

    public JarmuTipus getTipus() {
        return tipus;
    }

    public int getFerohely() {

        return ferohelyekSzama;
    }

    public void kozlekedes(){
        System.out.print("Halad elore");
    }

    @Override
    public String toString() {
        return "Ferohelyek szama: " + this.ferohelyekSzama + "Tipus: " + this.tipus + "Marka: " + this.marka;
    }
}
