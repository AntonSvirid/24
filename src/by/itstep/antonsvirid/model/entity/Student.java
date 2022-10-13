package by.itstep.antonsvirid.model.entity;

public class Student extends Human {    // extends - наследование соотв. .class (Human)
    public static final int MIN_MARK = 0;
    public static final int MAX_MARK = 10;

    private double mark;

    public Student() {
       // super();        // в байткоде так вызывается дефолтный конструктор баз класса
        System.out.println("Student default Constructor");       // debug
    }

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark >= MIN_MARK && mark <= MAX_MARK)
        this.mark = mark;
    }

    public String getInfo() {
        return  name + ": age =  " + age
                + ", mark = " + mark;
    }


}


