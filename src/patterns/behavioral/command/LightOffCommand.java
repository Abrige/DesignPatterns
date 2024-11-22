package patterns.behavioral.command;

public class LightOffCommand implements Command{

    private Light light;

    // Costruttore che prende in input il receiver
    public LightOffCommand(Light light) { this.light = light; }

    public void execute() { light.turnOff(); }
    public void undo() { light.turnOn(); }
}
