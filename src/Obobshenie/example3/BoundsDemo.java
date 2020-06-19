package Obobshenie.example3;

public class BoundsDemo {
    public static void main(String[] args) {
        NumericFns<Integer> iOb = new NumericFns<Integer>(6);

        NumericFns<Double> dOb = new NumericFns<Double>(-6.0);

        NumericFns<Long> lOb = new NumericFns<Long>(5L);

        System.out.println("Commprasion iOb and dOb");
        if (iOb.absEquals(dOb)) {
            System.out.println("Абсолютные значения совподают");
        } else {
            System.out.println("Абсолютные значение отличаются");
        }

        System.out.println();

        System.out.println("Comprasion iOb and lOb");
        if (iOb.absEquals(lOb)) {
            System.out.println("Абсолютные значения совподают");
        } else {
            System.out.println("Абсолютные значение отличаются");
        }
    }
}
