package org.coding_questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FindWordsContainChar2942 {
    public static void main(String[] args) {
        String[] words = {"leet","code", "elephent"};
        char x = 'e';
        System.out.println(findWordsContaining(words, x));
    }
    public static List<Integer> findWordsContaining(String[] words, char x){
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (char j : words[i].toCharArray()) {
                if (j == x) {
                    res.add(i);
                    break;
                }
            }
        }
        return res;
    }
}
