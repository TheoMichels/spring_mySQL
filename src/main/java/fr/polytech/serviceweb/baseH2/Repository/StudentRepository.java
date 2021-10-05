package fr.polytech.serviceweb.baseH2.Repository;

import fr.polytech.serviceweb.baseH2.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}