package commandPattern.sampleJavaCode;


//incomplete
public class UpdateCommand extends Command {

    public UpdateCommand(String text, CommandHistory commandHistory) {
        super.text = text;
    }

    @Override
    public String execute() {
        return text;
    }
}
