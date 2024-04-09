package org.functionalInterfaces;

import java.util.function.Function;

public class FunctionalInterface {
    public static void main(String[] args) {
        // It Takes Input and Return the Out put by apply method
        Function<Integer, String> doubleValue = value -> value*10 + " The Multiplication by 10";
        System.out.println(doubleValue.apply(50));
    }
}
