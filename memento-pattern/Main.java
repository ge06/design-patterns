package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor(new Text());
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Command?");
        for(;;) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("quit")) break;
            else if (input.equalsIgnoreCase("undo")) editor.hitUndo();
            else if (input.equalsIgnoreCase("print")) System.out.println(editor.print());
            else {
                editor.write(input);
            }
        }
    }
}
