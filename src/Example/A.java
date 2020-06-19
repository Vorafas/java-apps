package Example;

public interface A {
    void meth1();

    void meth2();

    default int getAdminID() {
        return 1;
    }

    int getUserID();
}
