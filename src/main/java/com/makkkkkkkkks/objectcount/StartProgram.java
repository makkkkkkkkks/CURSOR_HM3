package main.java.com.makkkkkkkkks.objectcount;

import main.java.com.makkkkkkkkks.car.Car;
import main.java.com.makkkkkkkkks.circle.Circle;

public class StartProgram {
    public static void start() {
        Circle circle = new Circle(10);
        System.out.println("Circle area: " + circle);

        Car car = new Car("toyota", "red", "miniven");
        car.startDriving("start");
        car.startDriving("stop");
        car.sppedDriving(60);
    }

}
