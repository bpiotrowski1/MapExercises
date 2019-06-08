package pl.bpiotrowski1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws NoSuchStudentException {
        University university = new University();
        university.addStudent(123, "Abasd", "Paksd");
        university.addStudent(234, "Marian", "Aawgf");
        university.addStudent(546, "Lucjan", "Hawed");
        university.addStudent(100400, "a6", "b1");
        university.addStudent(100200, "a7", "b7");

        if(university.containsStudent(100200L)) {
            System.out.println("Zawieram indeks: 100200");
        } else {
            System.out.println("Nie zawieram indeksu: 100200");
        }

        if(university.containsStudent(100400L)) {
            System.out.println(university.getStudent(100400L).getImie() + " " + university.getStudent(100400L).getNazwisko());
        } else {
            System.out.println("Nie zawieram indeksu: 100400");
        }

        System.out.println("Liczba studentow: " + university.studentCount());


    }
}
