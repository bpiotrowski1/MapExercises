package pl.bpiotrowski1;

import lombok.Getter;

public class Student {
    @Getter private long indeks;
    @Getter private String imie, nazwisko;

    public Student(long indeks, String imie, String nazwisko) {
        this.indeks = indeks;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return indeks + " " + imie + " " + nazwisko;
    }
}
