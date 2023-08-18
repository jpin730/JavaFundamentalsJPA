package javafundamentalsjpa;

import java.util.Date;
import javafundamentalsjpa.logic.Controller;
import javafundamentalsjpa.logic.Student;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        Student student = new Student(10, "John", "Doe", new Date());

        controller.createStudent(student);
    }
}
