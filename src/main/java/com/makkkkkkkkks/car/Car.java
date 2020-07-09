package main.java.com.makkkkkkkkks.car;

public class Car {
    private String brand;
    private String color;
    private String model;

    public Car(String brand, String color, String model) {
        this.brand = brand;
        this.color = color;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void startDriving(String command) {
        if (command.equals("start")) {
            System.out.println("brand " + brand + " Color " + color + " Model " + model + " Start driving ");
        } else if (command.equals("stop")) {
            System.out.println("brand " + brand + " Color " + color + " Model " + model + " Stop driving ");
        }
        else{
            System.out.println("Unknown command");
        }
    }

    public void sppedDriving(int speed) {
        System.out.println("brand " + brand + " Color " + color + " Model " + model + " Speed is " + speed);
    }
}
