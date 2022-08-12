package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
 private String firstName;
 private String lastName;
 private String subject;
 private int yearsTaught;

 public Teacher(String firstName, String lastName, String subject, int yearsTaught){
     this.firstName = firstName;
     this.lastName = lastName;
     this.subject = subject;
     this.yearsTaught = yearsTaught;
 }

 public String getFirstName(){
     return firstName;
 }
 public String getLastName(){
     return lastName;
 }
 public String getSubject(){
     return subject;
 }
 public int getYearsTaught(){
     return yearsTaught;
 }
 public void setFirstName(String firstName){
     this.firstName = firstName;
 }
 public void setLastName(String lastName){
     this.lastName = lastName;
    }
    public void setSubject(String subject){
     this.subject = subject;
    }
    public void setYearsTaught(int yearsTaught){
     this.yearsTaught = yearsTaught;
    }
}
