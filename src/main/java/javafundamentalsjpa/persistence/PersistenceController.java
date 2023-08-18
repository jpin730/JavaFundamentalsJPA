package javafundamentalsjpa.persistence;

import javafundamentalsjpa.logic.Student;

public class PersistenceController {

    StudentJpaController studentJpaController = new StudentJpaController();

    public void createStudent(Student student) {
        studentJpaController.create(student);
    }

}
