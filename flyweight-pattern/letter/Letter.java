package com.company.letter;

import com.company.letter.enumeration.Font;
import com.company.letter.enumeration.Type;

public class Letter {

    //intrinsic state
    private final char character;

    protected Letter(char character) {
        this.character = character;
    }

    //extrinsic states
    public void create(Type type, Font font, int punto) {
        System.out.println("Character: " + character + ", type: " + type.toString()
                + ", font: " + font.toString() + " and size: " + punto);
    }
}
