package StaticImport;

import static java.lang.Math.*;
import static java.lang.System.out;

public class Quadration {
    public static void main(String[] args) {
        double a, b, c, x, discriminant;

        // 4x2 + x - 3 = 0
        a = 4;
        b = 1;
        c = -3;
        discriminant = pow(b, 2) - 4 * a * c;

        x = (-b - sqrt(discriminant)) / (2 * a);
        out.println("X1: " + x);

        x = (-b + sqrt(discriminant)) / (2 * a);
        out.println("X2: " + x);
    }
}
