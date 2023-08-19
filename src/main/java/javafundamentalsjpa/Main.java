package javafundamentalsjpa;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import javafundamentalsjpa.logic.Career;
import javafundamentalsjpa.logic.Controller;
import javafundamentalsjpa.logic.Student;
import javafundamentalsjpa.logic.Subject;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        LinkedList<Subject> newSubjects = new LinkedList<>();

        Career newCareer = new Career("Career 1", newSubjects);

        controller.createCareer(newCareer);

        Subject subject1 = new Subject("Subject 1", newCareer);
        Subject subject2 = new Subject("Subject 2", newCareer);

        controller.createSubject(subject1);
        controller.createSubject(subject2);

        newSubjects.add(subject1);
        newSubjects.add(subject2);

        newCareer.setSubjects(newSubjects);

        controller.editCareer(newCareer);

        Student newStudent = new Student("John", "Doe", new Date(), newCareer);

        controller.createStudent(newStudent);

        System.out.println("\nSTUDENTS");

        ArrayList<Student> students = controller.getAllStudents();

        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.println("\nCAREERS");

        ArrayList<Career> careers = controller.getAllCareers();

        for (Career career : careers) {
            System.out.println(career.toString());
        }

        System.out.println("\nSUBJECTS");

        ArrayList<Subject> subjects = controller.getAllSubjects();

        for (Subject subject : subjects) {
            System.out.println(subject.toString());
        }
    }

}
