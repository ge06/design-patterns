package commandPattern.sampleJavaCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CommandHistory {

    private static Stack<Map<Command, String>> historyStack = new Stack<>();

    public void push(Command command, String text) {
        Map<Command, String> commandStringMap = new HashMap<>();
        commandStringMap.put(command, text);
        historyStack.push(commandStringMap);
        print();
    }

    public Map<Command, String> pop() {
        if(!historyStack.empty()){
            return  historyStack.pop();
        }
        return null;
    }

    private void print() {
        System.out.println(Arrays.toString(historyStack.toArray()));
    }

}
