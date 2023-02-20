public abstract class Vehicle {
    protected String brand;
    protected String name;
    protected String licenseNumber;
    protected int topSpeed;
    protected int gasCap;
    protected int wheels;

    public Vehicle(String brand, String name, String licenseNumber, int topSpeed, int gasCap, int wheels) {
        this.brand = brand;
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.topSpeed = topSpeed;
        this.gasCap = gasCap;
        this.wheels = wheels;
    }

    public abstract String getType();

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getGasCap() {
        return gasCap;
    }

    public int getWheels() {
        return wheels;
    }

    public void turnOnEntertainmentSystem() {
        System.out.println("Turning on entertainment system...");
    }

    public abstract void testDrive();
}
