package javafundamentalsjpa.logic;

import java.util.ArrayList;
import javafundamentalsjpa.persistence.PersistenceController;

public class Controller {

    PersistenceController persistenceController = new PersistenceController();

    public ArrayList<Student> getAllStudents() {
        return persistenceController.getAllStudents();
    }

    public Student getStudent(int id) {
        return persistenceController.getStudent(id);
    }

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
