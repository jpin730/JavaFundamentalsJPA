package javafundamentalsjpa.persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafundamentalsjpa.logic.Career;
import javafundamentalsjpa.logic.Student;
import javafundamentalsjpa.logic.Subject;
import javafundamentalsjpa.persistence.exceptions.NonexistentEntityException;

public class PersistenceController {

    StudentJpaController studentJpaController = new StudentJpaController();
    CareerJpaController careerJpaController = new CareerJpaController();
    SubjectJpaController subjectJpaController = new SubjectJpaController();

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

    public ArrayList<Career> getAllCareers() {
        List<Career> careerList = careerJpaController.findCareerEntities();
        return new ArrayList<>(careerList);
    }

    public Career getCareer(int id) {
        return careerJpaController.findCareer(id);
    }

    public void createCareer(Career career) {
        careerJpaController.create(career);
    }

    public void editCareer(Career career) {
        try {
            careerJpaController.edit(career);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteCareer(int id) {
        try {
            careerJpaController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Subject> getAllSubjects() {
        List<Subject> subjectList = subjectJpaController.findSubjectEntities();
        return new ArrayList<>(subjectList);
    }

    public Subject getSubject(int id) {
        return subjectJpaController.findSubject(id);
    }

    public void createSubject(Subject subject) {
        subjectJpaController.create(subject);
    }

    public void editSubject(Subject subject) {
        try {
            subjectJpaController.edit(subject);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteSubject(int id) {
        try {
            subjectJpaController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
