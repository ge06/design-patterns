package com.company;

import java.util.Stack;

public class Editor {

    private final Text text;
    private final Stack<State> savedStateStack;

    public Editor(Text text) {
        this.text = text;
        savedStateStack = new Stack<>();
    }

    public void hitUndo() {
        text.undo(savedStateStack.pop());
    }

    public void write(String text) {
        savedStateStack.push(this.text.save());
        this.text.addText(text);
    }

    public String print() {
        return text.print();
    }
}
