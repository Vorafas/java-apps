package Example.Obobshenie;

public class ExampleDemo {
    public static void main(String[] args) {
        SomeTest<Integer> mRef = MyClass::<Integer>myGenMeth;
        System.out.println(mRef.test(4,5));
    }
}
