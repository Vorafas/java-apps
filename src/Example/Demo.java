package Example;

public class Demo<T, V extends T> implements IGenIF<T, V> {
    public static void main() {
        Demo<Example1, Example2> ob = new Demo<Example1, Example2>();
    }
}
