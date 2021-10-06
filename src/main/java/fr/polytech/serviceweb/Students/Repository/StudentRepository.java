package fr.polytech.serviceweb.Students.Repository;

import fr.polytech.serviceweb.Students.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//extends Interface which contains CRUD method
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}