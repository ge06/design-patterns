package com.company;

public class Text {

    private StringBuilder current;

    public Text() {
        this.current = new StringBuilder();
    }

    public void addText(String text) {
        current.append(text);
    }

    public State save() {
        return new State(current.toString());
    }

    public void undo(State save) {
        current = new StringBuilder(save.getText());
    }

    public String print() {
        return current.toString();
    }
}
