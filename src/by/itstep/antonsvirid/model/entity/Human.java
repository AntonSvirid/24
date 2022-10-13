package by.itstep.antonsvirid.model.entity;

public class Human {
    public static final int MAX_AGE = 120;
    public static final int MIN_AGE = 0;

    private String name;        // private - обеспечивает инкапсуляцию
    private int age;

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= MIN_AGE && age <= MAX_AGE)
        this.age = age;
    }

    public String getInfo() {
        return  name + ": age =  " + age;
    }
}
