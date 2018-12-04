package paczka;

public class Kalkulator {

    private Double pierwsza;
    private Double druga;
    private Double wynik;

    public Kalkulator (Double pierwsza, Double druga){
        this.pierwsza = pierwsza;
        this.druga = druga;



    }

    public double dodawanie (Double pierwsza, Double druga){
        wynik = pierwsza+druga;
        return wynik;
    }

    public double odejmowanie (Double pierwsza, Double druga){
        wynik = pierwsza - druga;
        return wynik;
    }

    public double mnozenie (Double pierwsza, Double druga){
        if (pierwsza !=0 || druga !=0){
            wynik=0.0;
        } else
        wynik= pierwsza*druga;
        return wynik;
    }

    public double dzielenie (Double pierwsza, Double druga){
        if (druga ==0){

            //wynik="Dzielenie przez zero jest nieokreslone";
        } else wynik= pierwsza/druga;
        return wynik;
    }



    public Double getPierwsza() {
        return pierwsza;
    }

    public Double getDruga() {
        return druga;
    }

    public Double getWynik() {
        return wynik;
    }

    public void setPierwsza (Double pierwsza) {
        this.pierwsza = pierwsza;
    }

    public void setDruga(Double druga) {
        this.druga = druga;
    }

    public void setWynik(Double wynik) {
        this.wynik = wynik;
    }
}
