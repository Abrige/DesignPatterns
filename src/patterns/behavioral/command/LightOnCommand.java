package patterns.behavioral.command;

public class LightOnCommand implements Command{

    private Light light;

    // Costruttore che prende in input il receiver
    public LightOnCommand(Light light) { this.light = light; }

    public void execute() { light.turn0n(); }
    public void undo() { light.turnOff(); }
}
