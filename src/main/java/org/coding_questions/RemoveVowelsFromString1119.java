package org.coding_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveVowelsFromString1119 {
    public static void main(String[] args) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        String sentance = "The urgent care center was flooded with patients after the news of a new deadly virus was made public.";
        StringBuilder newSentenceBuilder = new StringBuilder();

        for (char s : sentance.toCharArray()) {
            if (!vowels.contains(Character.toLowerCase(s))) {
                newSentenceBuilder.append(s);
            }
        }
        System.out.println(newSentenceBuilder);
    }
}
