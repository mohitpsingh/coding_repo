package org.compcompat;

import org.streamsapi.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExampleComparable {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mohit", "Singh", "mohitsingh@gmail.com", "9999888898", 23, "BTech"));
        students.add(new Student("Karan", "Kumar", "karankumar@gmail.com", "9994588898", 20, "MBBS"));
        students.add(new Student("Rohit", "Singh", "rohit@gmail.com", "9999888898", 26, "BTech"));
        students.add(new Student("Raghav", "Roy", "raghavroy@gmail.com", "89999888898", 25, "MBA"));
        students.add(new Student("Raman", "Mehta", "ramanmehta@gmail.com", "7999888848", 22, "MCA"));

        System.out.println(students);
        Collections.sort(students, new ageComparator());
        System.out.println(students);
    }
}