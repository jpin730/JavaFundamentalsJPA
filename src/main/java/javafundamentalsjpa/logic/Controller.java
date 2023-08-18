package javafundamentalsjpa.logic;

import javafundamentalsjpa.persistence.PersistenceController;

public class Controller {

    PersistenceController persistenceController = new PersistenceController();

    public void createStudent(Student student) {
        persistenceController.createStudent(student);
    }

}
