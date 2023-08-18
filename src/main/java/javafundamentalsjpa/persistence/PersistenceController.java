package javafundamentalsjpa.persistence;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafundamentalsjpa.logic.Student;
import javafundamentalsjpa.persistence.exceptions.NonexistentEntityException;

public class PersistenceController {

    StudentJpaController studentJpaController = new StudentJpaController();

    public void createStudent(Student student) {
        studentJpaController.create(student);
    }

    public void deleteStudent(int id) {
        try {
            studentJpaController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
