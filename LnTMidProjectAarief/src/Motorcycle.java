public class Motorcycle extends Vehicle {
    protected int helmet;

    public Motorcycle(String brand, String name, String licenseNumber, int topSpeed, int gasCap, int wheels, int helmet) {
        super(brand, name, licenseNumber, topSpeed, gasCap, wheels);
        this.helmet = helmet;
    }

    @Override
    public String getType() {
        return "Motorcycle";
    }

    public int getHelmet() {
        return helmet;
    }

    @Override
    public void testDrive() {
        System.out.println(name + " is standing!");
    }
}
