package by.itstep.antonsvirid.model.entity;

public class Student extends Human {    // extends - наследование соотв. .class (Human)
    public static final int MIN_MARK = 0;
    public static final int MAX_MARK = 10;

    private double mark;
    private MarkNote note;      // подключение зачётки к студенту

    public Student() {
        // super();        // в байткоде так вызывается дефолтный конструктор баз класса
        //    System.out.println("Student default Constructor");       // debug
        note = new MarkNote();
    }

    public Student(String name, int age, double mark) {
        super(name, age);
        this.mark = mark;
    }

    public Student(String name, int age, MarkNote note) {
        super(name, age);
        this.note = note;
    }

    public double getMark() {
        return note.getMark();
    }

    public void setMark(double mark) {
        if (mark >= MIN_MARK && mark <= MAX_MARK)
            this.mark = mark;
    }

    public String getInfo() {
        return super.getInfo() + ", mark = " + mark;
    }

    public MarkNote getNote() {     // геттер и сеттер для зачетки при агрегации
        return note;
    }

    public void setNote(MarkNote note) {
        this.note = note;
    }
}


