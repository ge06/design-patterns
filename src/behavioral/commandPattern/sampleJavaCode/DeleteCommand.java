package commandPattern.sampleJavaCode;

import java.util.Map;

public class DeleteCommand extends Command {
    public DeleteCommand(String text, CommandHistory commandHistory) {
        super.text = text;
        super.commandHistory = commandHistory;
    }

    @Override
    public String execute() {
        Map<Command, String> popMap= commandHistory.pop();
        if(popMap !=null){
            String deletedText = popMap.entrySet().iterator().next().getValue();
            Command deletedCommand = popMap.entrySet().iterator().next().getKey();
            int lastIndex = text.lastIndexOf(",");
            this.text=text.substring(0,lastIndex);
            System.out.println(deletedText +" deleted" + " command :" + deletedCommand.toString());
        }

        return text;

    }

}
