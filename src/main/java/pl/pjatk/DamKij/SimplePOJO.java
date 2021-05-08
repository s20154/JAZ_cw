package pl.pjatk.DamKij;

public class SimplePOJO {
    private String nazwa;
    private int ilosc;

    public SimplePOJO(String nazwa, int ilosc) {
        this.nazwa = nazwa;
        this.ilosc = ilosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public void out() {
        System.out.println("tutaj POJO jest.");
    }
}
