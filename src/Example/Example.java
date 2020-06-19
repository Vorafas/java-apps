package Example;

import bookpack.Book;

public class Example {
    public static void main(String[] args) {
        for (Tools tool : Tools.values()) {
          System.out.println(tool);
        }
        System.out.println(Tools.values().length);
    }

    public static double[] getDiscriminant(double a, double b, double c) {
        double[] result = new double[2];
        double discriminant = Math.sqrt((b * b) - (4 * a * c));
        result[0] = (-b + discriminant) / (2 * a);
        System.out.println((discriminant));
        result[1] = (-b - discriminant) / (2 * a);
        return result;
    }

}

enum Tools {
    SCREWDRIVER, WRENCH, HAMMER, PLIERS
}
