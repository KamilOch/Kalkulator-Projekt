package paczka;


public class Kalkulator {

    private double pierwsza;
    private double druga;
    private double wynik;

    public Kalkulator (double pierwsza, double druga){
        this.pierwsza = pierwsza;
        this.druga = druga;
    }

    public double getPierwsza() {
        return pierwsza;
    }

    public double getDruga() {
        return druga;
    }

    public double getWynik() {
        return wynik;
    }

    public void setPierwsza (double pierwsza) {
        this.pierwsza = pierwsza;
    }

    public void setDruga(double druga) {
        this.druga = druga;
    }

    public void setWynik(double wynik) {
        this.wynik = wynik;
    }
}
