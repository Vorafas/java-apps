package TwoDShape;

public class Triangle extends TwoDShape {
    public String style;

    public Triangle(String style, double width, double height) {
        super(width, height, "triangle");
        this.style = style;
    }

    public Triangle() {
        super();
        this.style = "none";
    }

    public Triangle(Triangle triangle) {
        super(triangle);
        this.style = triangle.style;
    }

    public Triangle(double x) {
        super(x, "triangle");
        this.style = "закрашенный";
    }

    @Override
    public double area() {
        return getWidth() * getHeight() / 2;
    }

    public void showStyle() {
        System.out.println("Triangle: " + style);
    }
}
