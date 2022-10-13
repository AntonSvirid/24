package by.itstep.antonsvirid.controller;

import by.itstep.antonsvirid.model.entity.Human;
import by.itstep.antonsvirid.model.entity.Student;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human("Alex", 20);


        System.out.println(human1.getInfo());
        System.out.println(human2.getInfo());

        Human human = new Student();

    }
}
