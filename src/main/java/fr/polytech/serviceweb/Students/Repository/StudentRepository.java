package fr.polytech.serviceweb.Students.Repository;

import fr.polytech.serviceweb.Students.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}