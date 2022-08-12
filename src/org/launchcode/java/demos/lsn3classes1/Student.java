package org.launchcode.java.demos.lsn3classes1;

public class Student {
    private String name;
    private int studentId;
    private double gpa = 0.0;
    private int numberOfCredits = 0;

    public Student(String name, int studentId, double gpa, int numberOfCredits) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
        this.numberOfCredits = numberOfCredits;
    }

    public String getName(){
        return name;
    }
    public int getStudentId() {
        return studentId;
    }
    public double getGpa(){
        return gpa;
    }
    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    private void setNumberOfCredits(int numberOfCredits){
        this.numberOfCredits = numberOfCredits;
    }
}

