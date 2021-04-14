package lab8.jarmuvek;

public class Auto extends Jarmu {
    private int kerekekSzama;
    private String tipus;

    public Auto(int ferohelyekSzama, JarmuTipus jarmuTipus, int kerekekSzama, String marka, String tipus) {
        super(ferohelyekSzama, jarmuTipus,marka);
        this.kerekekSzama = kerekekSzama;
        this.tipus = tipus;
    }
    @Override
    public void kozlekedes(){
        System.out.println("Vegigvonul az uton");
    }

    @Override
    public String toString() {
        return "AUTO <==> Kerekek szama: " + kerekekSzama + " Kinezettipus: " + this.tipus + super.toString();
    }
}
