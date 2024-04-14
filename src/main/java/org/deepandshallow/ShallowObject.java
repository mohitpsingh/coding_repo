package org.deepandshallow;

public class ShallowObject {
    public static void main(String[] args) {
        Address add = new Address("44", "110032");
        Student std = new Student("M", "m@email.com", add);

        Student std2 = new Student();
        std2.setName(std.getName());
        std2.setAddress(std.getAddress());
        std2.setEmail(std.getEmail());
        std.getAddress().setAreaCode("110001");

        System.out.println("Person 1: " + std);
        System.out.println("Person 2: " + std2);
    }
}
