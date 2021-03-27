package felveteli;

public class Diak {
    String vnev;
    String knev;
    double erettsegi;
    double matematika;

    public Diak(String vnev, String knev, double erettsegi, double matematika) {
        this.vnev = vnev;
        this.knev = knev;
        this.erettsegi = erettsegi;
        this.matematika = matematika;
    }

    public Diak() {
        this.erettsegi = 0;
        this.knev = null;
        this.matematika = 0;
        this.vnev = null;

    }

    public String getVnev() {
        return vnev;
    }

    public void setVnev(String vnev) {
        this.vnev = vnev;
    }

    public String getKnev() {
        return knev;
    }

    public void setKnev(String knev) {
        this.knev = knev;
    }

    public double getErettsegi() {
        return erettsegi;
    }

    public void setErettsegi(double erettsegi) {
        this.erettsegi = erettsegi;
    }

    public double getMatematika() {
        return matematika;
    }

    public void setMatematika(double matematika) {
        this.matematika = matematika;
    }

    public double atlag(){
        return (this.matematika + this.erettsegi)/2;
    }

    @Override
    public String toString() {
        return vnev + " " + knev + " erettsegi : "+ erettsegi + " matek jegy: "+ matematika+ " atlag: " +this.atlag();
    }
}
