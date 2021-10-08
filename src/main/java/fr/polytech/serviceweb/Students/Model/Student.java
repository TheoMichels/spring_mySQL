package fr.polytech.serviceweb.Students.Model;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

//allow to remove getters & setters
@Data
//create entity and set table name
@Entity
@Table(name="student")
//allow to update only column which changed and not every column
@DynamicUpdate
public class Student {

    //binding all column of database

    // primary key
    @Id
    //id is generated automatically
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="student_id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private int age;
    @Column(name="school_year")
    private String school_year;

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getSchool_year() {
//        return school_year;
//    }
//
//    public void setSchool_year(String school_year) {
//        this.school_year = school_year;
//    }

}
