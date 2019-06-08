package pl.bpiotrowski1;

import java.util.Map;
import java.util.TreeMap;

public class University {
    private Map<Long, Student> students = new TreeMap<>();

    void addStudent(long indeks, String imie, String nazwisko) {
        students.put(indeks, (new Student(indeks, imie, nazwisko)));
    }

    boolean containsStudent(long indeks) {
        return students.containsKey(indeks);
    }

    Student getStudent(long indeks) throws NoSuchStudentException{
        if(students.containsKey(indeks)) {
            return students.get(indeks);
        }
        throw new NoSuchStudentException("Nie znaleziono studenta");
    }

    int studentCount() {
        return students.size();
    }

    void printAllStudent() {
        for(Long l : students.keySet()) {
            System.out.println(students.get(l));
        }
    }
}
