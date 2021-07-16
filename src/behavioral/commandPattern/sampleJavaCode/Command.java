package commandPattern.sampleJavaCode;

public abstract class Command {

    protected String text;

    protected CommandHistory commandHistory;

    public abstract String execute();

    public void  pushHistory(Command command){
        this.commandHistory.push(command, this.text);
    }

    @Override
    public String toString() {
        return "Command{" +
                "text='" + text + '\'' +
                ", commandHistory=" + commandHistory +
                '}';
    }
}
