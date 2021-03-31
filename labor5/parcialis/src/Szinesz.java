public class Szinesz {
    public static int szineszek_szama = 0;

    private String id;
    private String keresztnev;
    private String csaladnev;
    private int ev;
    private int dijak_szama;
    private boolean nem;

    public Szinesz(String keresztnev, String csaladnev, int ev, boolean nem) {
        this.keresztnev = keresztnev;
        this.csaladnev = csaladnev;
        this.ev = ev;
        this.nem = nem;
        this.dijak_szama = 0;
        szineszek_szama++;
        this.id =keresztnev.substring(0,1)+ csaladnev.substring(0,1)+szineszek_szama;
    }

    public static int getSzineszek_szama() {
        return szineszek_szama;
    }

    public String getId() {
        return id;
    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public String getCsaladnev() {
        return csaladnev;
    }

    public int getEv() {
        return ev;
    }

    public int getDijak_szama() {
        return dijak_szama;
    }

    public boolean isNem() {
        return nem;
    }

    public void setDijak_szama() {
        this.dijak_szama ++;
    }

    @Override
    public String toString() {
        String seged = "";
        if (!this.nem)
            seged = "no";
        else
            seged = "ferfi";

        return "Szinesz neve: " + this.csaladnev
                + " " + this.keresztnev + " ID:" + this.id
                + " Szuletesi eve: " + this.ev
                + " neme: " + seged;
    }
}
