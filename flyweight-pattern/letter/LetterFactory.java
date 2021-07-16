package com.company.letter;

import java.util.HashMap;

public class LetterFactory {

    private static final HashMap<Character, Letter> charLetterMap = new HashMap<>();

    public static Letter getCharacter(Character character) {
        Letter letter;

        if (charLetterMap.containsKey(character))
            letter = charLetterMap.get(character);
        else
        {
            System.out.println(character + " character is created!");
            letter = new Letter(character);
        }

        charLetterMap.put(character, letter);

        return letter;
    }
}
