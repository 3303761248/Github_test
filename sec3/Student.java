package sec3;

import java.util.Comparator;

public class Student implements Comparable{
    private String name;
    private int age;
    private int score;
    private String grade;

    public Student(String name, int age, int score, String grade) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.grade = grade;
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
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " " + age + "\t" + score + "\t" + grade;
    }

    @Override
    public int compareTo(Object o) {
        Student s =(Student)o;
        return Double.compare(this.score,s.score);
    }
}
