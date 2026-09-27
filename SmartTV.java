abstract class Appliance {
    abstract void displayAppliance();
}

interface RemoteControl {
    void turnOn();
    void turnOff();
}

public class SmartTV extends Appliance implements RemoteControl {

    private String applianceName;
    private String brand;
    private int screenSize;
    private boolean powerStatus;

    SmartTV(String applianceName, String brand, int screenSize) {
        this.applianceName = applianceName;
        this.brand = brand;
        this.screenSize = screenSize;
        this.powerStatus = false;
    }

    public void turnOn() {
        powerStatus = true;
        System.out.println("Smart TV is turned ON.");
    }

    public void turnOff() {
        powerStatus = false;
        System.out.println("Smart TV is turned OFF.");
    }

    public void displayAppliance() {
        System.out.println("Appliance Name: " + applianceName);
        System.out.println("Brand: " + brand);
        System.out.println("Screen Size: " + screenSize + " inch");

        if (powerStatus) {
            System.out.println("Status: ON");
        } else {
            System.out.println("Status: OFF");
        }
    }

    public static void main(String[] args) {

        SmartTV tv = new SmartTV("Smart TV", "Sony", 55);

        Appliance appliance = tv;

        appliance.displayAppliance();

        RemoteControl remote = tv;

        remote.turnOn();

        appliance.displayAppliance();

        remote.turnOff();

        appliance.displayAppliance();
    }
}