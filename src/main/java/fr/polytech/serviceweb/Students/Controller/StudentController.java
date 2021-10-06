package fr.polytech.serviceweb.Students.Controller;

import fr.polytech.serviceweb.Students.Model.Student;
import fr.polytech.serviceweb.Students.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class StudentController {

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

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }
}
