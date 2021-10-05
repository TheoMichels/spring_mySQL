package fr.polytech.serviceweb.baseH2.controller;

import fr.polytech.serviceweb.baseH2.model.Student;
import fr.polytech.serviceweb.baseH2.repository.StudentRepository;
import fr.polytech.serviceweb.baseH2.repository.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private StudentService studentRepository;

    @GetMapping(value="/showStudents")
    public List<Student> showAll() {
        return studentRepository.findAll();
    }

    @GetMapping(value="/showStudentById/{id}")
    public Student studentById(@PathVariable(value="id") int id) {
        return studentRepository.findById(id);
    }

    @GetMapping(value="/addStudent/{id}/{name}/{age}/{school_year}")
    public Student addStudent(@PathVariable(value="id") int id, @PathVariable(value="name") String name, @PathVariable(value="age") int age, @PathVariable(value="school_year") String school_year) {
        Student student = new Student(id, name, age, school_year);
        studentRepository.addStudent(student);
        return student;
    }

    @GetMapping(value="/deleteStudent/{id}")
    public Student deleteStudent(@PathVariable(value="id") int id) {
        studentRepository.deleteStudent(id);
        return studentRepository.findById(id);
    }
}