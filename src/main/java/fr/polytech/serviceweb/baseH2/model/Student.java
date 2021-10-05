package fr.polytech.serviceweb.baseH2.model;

public class Student {

    private int id;
    private String name;
    private int age;
    private String school_year;

    public Student(){}

    public Student(int id, String name, int age, String school_year) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.school_year = school_year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool_year() {
        return school_year;
    }

    public void setSchool_year(String school_year) {
        this.school_year = school_year;
    }

    @Override
    public String toString() {
        return "Student " + id + " :" + name + '/' + age + '/' + school_year;
    }
}
