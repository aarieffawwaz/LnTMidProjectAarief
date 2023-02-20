public class Car extends Vehicle {
    protected int entertainmentSystem;

    public Car(String brand, String name, String licenseNumber, int topSpeed, int gasCap, int wheels, int entertainmentSystem) {
        super(brand, name, licenseNumber, topSpeed, gasCap, wheels);
        this.entertainmentSystem = entertainmentSystem;
    }

    @Override
    public String getType() {
        return "Car";
    }

    public int getEntertainmentSystem() {
        return entertainmentSystem;
    }

    @Override
    public void turnOnEntertainmentSystem() {
        super.turnOnEntertainmentSystem();
        System.out.println("Starting entertainment system...");
    }

    @Override
    public void testDrive() {
        System.out.println("Taking the car for a spin...");
    }
}
