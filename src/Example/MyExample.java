package Example;

public class MyExample {
    <T extends Number, V extends Number> boolean get(T ob, V ob2) {
        return ob.intValue() == ob2.intValue();
    }

    public static void main(String[] args) {
        MyExample me = new MyExample();
        Double a = 5.5;
        Long b = 5L;
        System.out.println(me.get(b, a));
    }
}
