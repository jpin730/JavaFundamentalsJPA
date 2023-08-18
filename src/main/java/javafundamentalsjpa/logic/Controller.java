package javafundamentalsjpa.logic;

import javafundamentalsjpa.persistence.PersistenceController;

public class Controller {

    PersistenceController persistenceController = new PersistenceController();

    public void createStudent(Student student) {
        persistenceController.createStudent(student);
    }

    public void editStudent(Student student) {
        persistenceController.editStudent(student);
    }

    public void deleteStudent(int id) {
        persistenceController.deleteStudent(id);
    }
}
