package by.itstep.antonsvirid.model.entity;

public class MarkNote {
    public static final int MIN_MARK = 4;

    private double mark;

    public MarkNote() {     // конструктор по умолчанию
        mark = MIN_MARK;
    }

    public MarkNote(double mark) {
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

}
