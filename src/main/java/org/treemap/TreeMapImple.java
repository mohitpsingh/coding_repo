package org.treemap;

import java.util.TreeMap;

public class TreeMapImple {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(101, "ABC");
        treeMap.put(201, "DEF");
        treeMap.put(301, "GHI");
        treeMap.put(601, "JKL");
        treeMap.put(501, "MNO");
        treeMap.put(401, "PQR");

//        System.out.println(treeMap);
        treeMap.forEach((k,v) -> System.out.println(" Key = " + k+ " Value = " + v));
        // Decending Order
        System.out.println(treeMap.descendingMap());
        // First Key
        System.out.println(treeMap.firstEntry());
        // Last Key
        System.out.println(treeMap.lastEntry());

    }
}
