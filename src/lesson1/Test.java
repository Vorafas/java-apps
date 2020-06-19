package lesson1;

class Test {
    private int a;
    private int b;

    Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Test(Test ob) {
        a = ob.a;
        b = ob.b;
    }

    static <T extends Number> boolean isEquals(T a, T b) {
        return a.intValue() == b.intValue();
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

}
