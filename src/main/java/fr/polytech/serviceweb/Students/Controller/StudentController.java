package fr.polytech.serviceweb.Students.Controller;

import fr.polytech.serviceweb.Students.Model.Student;
import fr.polytech.serviceweb.Students.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {

    // dependency injection
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping(value="/getStudents")
    public Iterable<Student> getStudents() {
        return studentRepository.findAll();
    }

    @GetMapping(value="getStudentById/{id}")
    public Optional<Student> getStudentById(@PathVariable(value="id") Integer id) {
        return studentRepository.findById(id);
    }

    @PostMapping("/addStudent/{student}")
    public Student addStudent(@PathVariable(value="student") Student student) {
        return studentRepository.save(student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable(value ="id") int id) {
        studentRepository.deleteById(id);
    }
}