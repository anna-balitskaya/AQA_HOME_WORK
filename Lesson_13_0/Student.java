package Lesson_13_0;

import java.util.ArrayList;

public class Student {
    private String name;
    private String group;
    private Integer course;
    private ArrayList<Integer> grade;

    public Student (String name, String group, Integer course, ArrayList<Integer> grade){
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade = grade;
    }
}
