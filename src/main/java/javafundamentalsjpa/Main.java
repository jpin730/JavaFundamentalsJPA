package javafundamentalsjpa;

import java.util.ArrayList;
import javafundamentalsjpa.logic.Controller;
import javafundamentalsjpa.logic.Student;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        ArrayList<Student> students = controller.getAllStudents();

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
