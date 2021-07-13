package com.company;

import com.company.letter.Letter;
import com.company.letter.LetterFactory;
import com.company.letter.enumeration.Font;
import com.company.letter.enumeration.Type;

public class Main {

    public static void main(String[] args) {
        for(int index = 1; index <= 20; index++) {
            Letter letter = LetterFactory.getCharacter((char) ((index % 5) + 65));
            letter.create(Type.BOLD, Font.TIMES_NEW_ROMAN, index);
        }
    }
}
