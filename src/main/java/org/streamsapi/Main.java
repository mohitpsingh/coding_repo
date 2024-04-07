package org.streamsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mohit", "Singh", "mohitsingh@gmail.com", "9999888898", 23, "BTech"));
        students.add(new Student("Karan", "Kumar", "karankumar@gmail.com", "9994588898", 20, "MBBS"));
        students.add(new Student("Rohit", "Singh", "rohit@gmail.com", "9999888898", 26, "BTech"));
        students.add(new Student("Raghav", "Roy", "raghavroy@gmail.com", "89999888898", 25, "MBA"));
        students.add(new Student("Raman", "Mehta", "ramanmehta@gmail.com", "7999888848", 22, "MCA"));

        // Getting Names and Transforming into Upper Case
        System.out.println(students.stream().map(student -> student.getFirstName().toUpperCase()).collect(Collectors.toList()));

        // Fetching all the Emails here
        students.stream().map(student -> student.getEmailAddress()).forEach(System.out :: println);

    }

}
