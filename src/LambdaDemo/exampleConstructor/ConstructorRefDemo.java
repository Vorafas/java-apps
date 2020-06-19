package LambdaDemo.exampleConstructor;

public class ConstructorRefDemo {
    public static void main(String[] args) {
//        MyFunc myClassCons = MyClass::new;
//        MyClass mc = myClassCons.func("Hello");
//
//        System.out.println(mc.getStr());

        MyClassArrayCreator a = MyClass[]::new;
        MyClass[] arr = a.func(3);
        for (int i =0; i < arr.length; i++) {
            arr[i] = new MyClass("arr[" + i + "]");
            System.out.println(arr[i].getStr());
        }
    }
}
