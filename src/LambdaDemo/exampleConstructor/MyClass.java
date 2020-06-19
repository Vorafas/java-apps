package LambdaDemo.exampleConstructor;

public class MyClass {
    private String str;

    MyClass(String str) {
        this.str = str;
    }

    MyClass() {
        str = "";
    }

    String getStr() {
        return str;
    }
}
