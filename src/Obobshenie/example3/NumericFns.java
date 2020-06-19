package Obobshenie.example3;

public class NumericFns<T extends Number> {
    T num;

    NumericFns(T num) {
        this.num = num;
    }

    double reciprocal() {
        return 1 / num.doubleValue();
    }

    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    boolean absEquals(NumericFns<?> ob) {
        return (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()));
    }
}
