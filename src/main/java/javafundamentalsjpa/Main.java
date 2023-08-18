package javafundamentalsjpa;

import javafundamentalsjpa.logic.Controller;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        System.out.println(controller.getStudent(20).getFirstName());
    }
}
