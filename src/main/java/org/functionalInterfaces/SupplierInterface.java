package org.functionalInterfaces;

import java.util.UUID;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] agrs) {
        // It takes no Input only gives the output
        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());
    }
}
