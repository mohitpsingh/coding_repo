package org.functionalInterfaces;

public class Student {
    private String name;
    private String grade;
    private String phoneNumber;
    private boolean isActive;

    public Student() {

    }
    public Student(String name, String grade, String phoneNumber, boolean isActive) {
        this.name = name;
        this.grade = grade;
        this.phoneNumber = phoneNumber;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
