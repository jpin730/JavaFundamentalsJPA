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

    public ArrayList<Career> getAllCareers() {
        return persistenceController.getAllCareers();
    }

    public Career getCareer(int id) {
        return persistenceController.getCareer(id);
    }

    public void createCareer(Career career) {
        persistenceController.createCareer(career);
    }

    public void editCareer(Career career) {
        persistenceController.editCareer(career);
    }

    public void deleteCareer(int id) {
        persistenceController.deleteCareer(id);
    }

    public ArrayList<Subject> getAllSubjects() {
        return persistenceController.getAllSubjects();
    }

    public Subject getSubject(int id) {
        return persistenceController.getSubject(id);
    }

    public void createSubject(Subject subject) {
        persistenceController.createSubject(subject);
    }

    public void editSubject(Subject subject) {
        persistenceController.editSubject(subject);
    }

    public void deleteSubject(int id) {
        persistenceController.deleteSubject(id);
    }

}
