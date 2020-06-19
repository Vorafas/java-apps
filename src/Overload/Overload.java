package Overload;

class Overload {
    void ovlDemo() {
        System.out.println("Hello");
    }

    int ovlDemo(int a, int b) {
        return a + b;
    }

    double ovlDemo(double a, double b) {
        return a * b;
    }
}
