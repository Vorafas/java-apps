package LambdaDemo.Homework;

public class MyIntNum {
    private int v;

    MyIntNum(int v) {
        this.v = v;
    }

    int getName() {
        return v;
    }

    boolean isFactor(int n) {
        return (v % n) == 0;
    }

    boolean hasCommonFactor(int n) {
        for (int i = 2; i < v / i; i++) {
            if (((v % i) == 0) && ((n % i) == 0)) {
                return true;
            }
        }
        return false;
    }
}
