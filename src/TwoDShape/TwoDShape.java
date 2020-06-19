package TwoDShape;

public abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    public TwoDShape() {
        this(0, 0, "none");

    }

    public TwoDShape(TwoDShape twoDShape) {
        this(twoDShape.width, twoDShape.height, twoDShape.name);
    }


    public TwoDShape(double x, String name) {
        this(x, x, name);
    }

    public TwoDShape(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void showDim() {
        System.out.println("Width: " + width + "\n" + "Height: " + height);
    }

    public String getName() {
        return this.name;
    }

    public abstract double area();
}
