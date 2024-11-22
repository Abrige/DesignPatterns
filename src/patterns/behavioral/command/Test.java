package patterns.behavioral.command;

public class Test {
    public static void main(String[] args) {

        Light light = new Light();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.executeCommand(lightOn);
        remote.executeCommand(lightOff);

        remote.undoLastCommand();
        remote.undoLastCommand();

        // Quest'ultimo comando non ha effetto perchè non c'è nessun comando da annullare
        remote.undoLastCommand();
    }
}
