package TwoDShape;

public class Rectangle extends TwoDShape {

    Rectangle() {
        super();
    }

    Rectangle(double width, double height) {
        super(width, height, "rectangle");
    }

    Rectangle(double side) {
        super(side, "rectangle");
    }

    Rectangle(Rectangle rectangle) {
        super(rectangle);
    }

    boolean isSquare() {
        return (getWidth() == getHeight());
    }

    @Override
    public double area() {
        return getWidth() * getHeight();
    }
}
