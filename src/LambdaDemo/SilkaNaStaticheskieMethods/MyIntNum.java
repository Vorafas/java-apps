package LambdaDemo.SilkaNaStaticheskieMethods;

public class MyIntNum {
    private int v;

    MyIntNum(int v) {
        this.v = v;
    }

    int getNum() {
        return v;
    }

    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}
