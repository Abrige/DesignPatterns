package patterns.behavioral.command;

import java.util.Stack;

// Nel design pattern sarebbe il sender, mantiene in memoria il command e va a chiamare i metodi execute
public class RemoteControl {
    private Stack<Command> commandHistory = new Stack<>();

    public void executeCommand(Command command) {
        // Dovremmo controllare che il command abbia effettivamente eseguito l'azione
        command.execute();
        commandHistory.push(command);
    }

    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
        else{
            System.out.println("No command to undo");
        }
    }
}
