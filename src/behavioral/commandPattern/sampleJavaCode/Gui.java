package commandPattern.sampleJavaCode;

import javax.swing.*;
import java.awt.*;

public class Gui {
    private JTextArea textArea;

    private CommandHistory commandHistory = new CommandHistory();

    public void create() {
        JFrame frame = new JFrame("Command Pattern Gui");
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        content.add(textArea);

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton addButton = new JButton("Add");
        JButton deleteButton = new JButton("Delete");
        JButton updateButton = new JButton("Update");
        JButton clearButton = new JButton("Clear");

        addButton.addActionListener(e -> textArea.setText(new AddCommand(textArea.getText(), commandHistory).execute()));

        deleteButton.addActionListener(e -> textArea.setText(new DeleteCommand(textArea.getText(), commandHistory).execute()));

        //updateButton.addActionListener(e -> new UpdateCommand(textArea.getText(), commandHistory).execute());

        //clearButton.addActionListener(e -> new ClearCommand(textArea.getText(), commandHistory).execute());

        buttons.add(addButton);
        buttons.add(deleteButton);
        buttons.add(updateButton);
        buttons.add(clearButton);
        content.add(buttons);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
