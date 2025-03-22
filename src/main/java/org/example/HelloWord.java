package org.example;

import java.util.HashSet;
import java.util.Set;

public class HelloWord {

    public static void main(String[] args) {
        String word = "Hello";
        Set<Character> repeatingChars = findRepeatingChars(word);
        if (!repeatingChars.isEmpty()) {
            System.out.println("Повторяющиеся символы в слове '" + word + "': " + repeatingChars);
        } else {
            System.out.println("В слове '" + word + "' нет повторяющихся символов");
        }
    }

    public static Set<Character> findRepeatingChars(String word) {
        Set<Character> seen = new HashSet<>();
        Set<Character> repeatingChars = new HashSet<>();
        for (char c : word.toLowerCase().toCharArray()) {
            if (!seen.add(c)) {
                repeatingChars.add(c);
            }
        }
        return repeatingChars;
    }
}
