package circle;

public class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    private double areaСalculation() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "radius=" + radius + "area calculation= " + areaСalculation();
    }
}
