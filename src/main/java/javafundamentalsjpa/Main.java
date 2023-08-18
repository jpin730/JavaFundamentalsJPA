package javafundamentalsjpa;

import javafundamentalsjpa.logic.Controller;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

//        Student student = new Student(30, "John", "Doe", new Date());
        controller.deleteStudent(30);
    }
}
