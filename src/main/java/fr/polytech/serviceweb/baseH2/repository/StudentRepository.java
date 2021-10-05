package fr.polytech.serviceweb.baseH2.repository;

import fr.polytech.serviceweb.baseH2.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findById(int id);
    void addStudent(Student student);
    void deleteStudent(int id);

}
