package commandPattern.sampleJavaCode;

public class AddCommand extends Command {

    public AddCommand(String text, CommandHistory commandHistory) {
        super.text = text;
        super.commandHistory = commandHistory;
    }

    @Override
    public String execute() {
        text = text +",";
        System.out.println("Text added :" + text);
        pushHistory(this);
        return text;
    }
}
