package commandPattern.sampleJavaCode;


//incomplete
public class ClearCommand extends Command {

    public ClearCommand(String text, CommandHistory commandHistory) {
        super.text = text;
    }

    @Override
    public String execute() {
        super.text ="";
        pushHistory(this);
        return text;
    }
}
