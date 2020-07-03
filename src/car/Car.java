package car;

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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void startDriving(boolean command) {
        if (command = true) {
            System.out.println("brand " + brand + "Color" + color + "Model " + model + "Speed is " + "Start driving");
        } else if (command = false) {
            System.out.println("brand " + brand + "Color" + color + "Model " + model + "Speed is " + "Stop driving");
        }
    }

    public void sppedDriving(int speed) {
        System.out.println("brand " + brand + "Color" + color + "Model " + model + "Speed is " + speed);
    }


}
