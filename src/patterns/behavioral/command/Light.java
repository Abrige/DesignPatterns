package patterns.behavioral.command;

// Nel design pattern sarebbe il receiver
public class Light {

    private boolean isOn;

    public void turnOff() {
        isOn = false;
        System.out.println("Light is off");
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Light is on");
    }

    public boolean isOn() {
        return isOn;
    }

}
