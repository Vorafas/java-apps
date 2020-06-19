package Block;

@Deprecated
public class MyClass {
    private String msg;

    MyClass(String msg) {
        this.msg = msg;
    }

    @Deprecated
    String getMsg() {
        return msg;
    }
}
