package org.launchcode.java.demos.lsn3classes1;
import java.util.ArrayList;

public class Course {
    private String courseTitle;
    private String professorName;
    private ArrayList<Student> enrolledStudents;
    private int credits;

    public Course (String courseTitle, String professorName, ArrayList<Student> enrolledStudents, int credits){
        this.courseTitle = courseTitle;
        this.professorName = professorName;
        this.enrolledStudents = enrolledStudents;
        this.credits = credits;
    }
}
