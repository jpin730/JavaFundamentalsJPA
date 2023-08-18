package javafundamentalsjpa;

import java.util.Date;
import javafundamentalsjpa.logic.Controller;
import javafundamentalsjpa.logic.Student;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        Student student = new Student(20, "John", "Doe", new Date());

        controller.createStudent(student);

        student.setFirstName("James");

        controller.editStudent(student);
    }
}
