package src.ru.mirea.pract6._2;

public class Student {

    Student() {}
    Student(String name, int score) {
        this.name = name;
        this.GPA = score;
    }

    public void setScore(int score) {
        this.GPA = score;
    }

    public int getScore() {
        return this.GPA;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private String name;
    private int GPA;
}
