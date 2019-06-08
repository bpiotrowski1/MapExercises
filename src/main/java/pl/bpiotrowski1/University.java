package pl.bpiotrowski1;

import lombok.Getter;

import java.util.Map;
import java.util.TreeMap;

class University {
    @Getter private Map<Long, Student> students = new TreeMap<>();

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
}
