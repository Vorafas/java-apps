package TwoDShape;

public class ColorTriangle extends Triangle {
    private String color;

    ColorTriangle(String color, String style, double width, double height) {
        super(style, width, height);
        this.color = color;
    }

    public String geColor() {
        return color;
    }

    public void showColor() {
        System.out.println("Color - " + color);
    }
}
