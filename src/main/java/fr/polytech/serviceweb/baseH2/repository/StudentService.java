package fr.polytech.serviceweb.baseH2.repository;

import fr.polytech.serviceweb.baseH2.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentService {

    private static List<Student> students = new ArrayList<>();
    static {
        students.add(new Student(1, "Théo Michels", 21, "5A"));
        students.add(new Student(2, "Aymen Trabelsi", 12, "5A"));
        students.add(new Student(3, "Soufyen Mednini", 17, "5A"));
        students.add(new Student(4, "Dylan Tangamen", 49, "5A"));
        students.add(new Student(5, "Youcef Ould Braham", 38, "5A"));
    }

    public List<Student> findAll() {
        return students;
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public void deleteStudent(int id) {
        students.remove(students.get(id));
    }

    public Student findById(int id) {
        return students.get(id);
    }
}
