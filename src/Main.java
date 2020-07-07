import car.Car;
import circle.Circle;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Circle area: " + circle);

        Car car = new Car("toyota", "red", "miniven");
        car.startDriving(true);
        car.startDriving(false);
        car.sppedDriving(60);
    }
}
