package paczka;

import org.springframework.stereotype.Component;

public class Kalkulator {

    private Double pierwsza;
    private Double druga;
    private Double wynik;

    public Kalkulator (Double pierwsza, Double druga){
        this.pierwsza = pierwsza;
        this.druga = druga;
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
