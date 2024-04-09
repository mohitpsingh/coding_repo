package org.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "A", "9634567890", true));
        students.add(new Student("Bob", "B", "9876543210", false));
        students.add(new Student("Charlie", "C", "98678901234", true));

        // Predicate Example
        Predicate<Student> validStudent = student -> student.isActive();
        students.stream().filter(validStudent).forEach(student -> System.out.println(student.getName()));

    }
}
