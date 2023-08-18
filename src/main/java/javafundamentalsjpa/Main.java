package javafundamentalsjpa;

import java.util.ArrayList;
import java.util.Date;
import javafundamentalsjpa.logic.Career;
import javafundamentalsjpa.logic.Controller;
import javafundamentalsjpa.logic.Student;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        Career career = new Career(10, "Career 1");

        controller.creatCareer(career);

        Student studentNew = new Student(10, "John", "Doe", new Date(), career);

        controller.createStudent(studentNew);

        ArrayList<Student> students = controller.getAllStudents();

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

}
