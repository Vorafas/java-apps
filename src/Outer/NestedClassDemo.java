package Outer;

public class NestedClassDemo {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 3, 7, 1, 9, 0, 4, 7, 3};
        Outer outer = new Outer(array);
        outer.analyze();
    }
}
