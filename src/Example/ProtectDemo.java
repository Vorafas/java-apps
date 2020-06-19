package Example;

public class ProtectDemo implements B {
    public void meth1() {
        System.out.println("meth1()");
    }

    public void meth2() {
        System.out.println("meth2()");
    }

    public void meth3() {
        System.out.println("meth3()");
    }

    public int getUserID() {
        return 100;
    }

    public int getAdminID() {
        return 10;
    }
}
