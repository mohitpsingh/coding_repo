package org.functionalinterface;

import org.streamsapi.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateClass {

    public static List<Student> students = new ArrayList<>();
    public static void main(String[] args) {


        students.add(new Student("Mohit", "Singh", "mohitsingh@gmail.com", "9999888898", 23, "BTech"));
        students.add(new Student("Karan", "Kumar", "karankumar@gmail.com", "9994588898", 20, "MBBS"));
        students.add(new Student("Rohit", "Singh", "rohit@gmail.com", "9999888898", 26, "BTech"));
        students.add(new Student("Raghav", "Roy", "raghavroy@gmail.com", "89999888898", 25, "MBA"));
        students.add(new Student("Raman", "Mehta", "ramanmehta@gmail.com", "7999888848", 22, "MCA"));

        Predicate<Student> agePredicate = student -> student.getAge() > 23;


    }
}
