import java.util.ArrayList;
import java.util.Scanner;

abstract class Vehicle {
    protected String brand;
    protected String name;
    protected String licensePlate;
    protected int topSpeed;
    protected int gasCap;
    protected int wheels;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setGasCap(int gasCap) {
        this.gasCap = gasCap;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getLicensePlate() {
        return licensePlate;
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

    abstract void getInputData(Scanner sc);

    abstract void display();
}

class Car extends Vehicle {
    protected String type;
    protected int entertainmentSystem;

    public void setType(String type) {
        this.type = type;
    }

    public void setEntertainmentSystem(int entertainmentSystem) {
        this.entertainmentSystem = entertainmentSystem;
    }

    public String getType() {
        return type;
    }

    public int getEntertainmentSystem() {
        return entertainmentSystem;
    }

    @Override
    void getInputData(Scanner sc) {
        System.out.print("Input type [Car | Motorcycle]: Car\nInput brand [>= 5]: ");
        this.brand = sc.nextLine();
        while (this.brand.length() < 5) {
            System.out.print("Input brand [>= 5]: ");
            this.brand = sc.nextLine();
        }

        System.out.print("Input name[>= 5]: ");
        this.name = sc.nextLine();
        while (this.name.length() < 5) {
            System.out.print("Input name[>= 5]: ");
            this.name = sc.nextLine();
        }

        System.out.print("Input license [Format : A 1234 XYZ]: ");
        this.licensePlate = sc.nextLine();
        while (!this.licensePlate.matches("^[A-Z]\\s\\d{1,4}\\s[A-Z]{1,3}$")) {
            System.out.print("Input license [Format : A 1234 XYZ]: ");
            this.licensePlate = sc.nextLine();
        }

        System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
        this.topSpeed = sc.nextInt();
        while (this.topSpeed < 100 || this.topSpeed > 250) {
            System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
            this.topSpeed = sc.nextInt();
        }

        System.out.print("Input gas capacity [30 <= gascap <= 60]: ");
        this.gasCap = sc.nextInt();
        while (this.gasCap < 30 || this.gasCap > 60) {
            System.out.print("Input gas capacity [30 <= gascap <= 60]: ");
            this.gasCap = sc.nextInt();
        }

        System.out.print("Input wheels [4 <= wheels <= 6]: ");
        this.wheels = sc.nextInt();
        while (this.wheels < 4 || this.wheels > 6) {
            System.out
