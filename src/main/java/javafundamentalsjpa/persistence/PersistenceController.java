package javafundamentalsjpa.persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafundamentalsjpa.logic.Student;
import javafundamentalsjpa.persistence.exceptions.NonexistentEntityException;

public class PersistenceController {

    StudentJpaController studentJpaController = new StudentJpaController();

    public ArrayList<Student> getAllStudents() {
        List<Student> studentList = studentJpaController.findStudentEntities();
        return new ArrayList<>(studentList);
    }

    public Student getStudent(int id) {
        return studentJpaController.findStudent(id);
    }

    public void createStudent(Student student) {
        studentJpaController.create(student);
    }

    public void editStudent(Student student) {
        try {
            studentJpaController.edit(student);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteStudent(int id) {
        try {
            studentJpaController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
