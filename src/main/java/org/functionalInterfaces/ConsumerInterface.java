package org.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        Student s = new Student();
        // It is used to Modify the Data and contain One Function Called accept
        Consumer<Student> modify = student -> student.setName("New Name");
        modify.accept(s);
        System.out.println(s.getName());
    }
}
