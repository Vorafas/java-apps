package Obobshenie;

public class Gen<T> {
    T ob;

    Gen(T ob) {
        this.ob = ob;
    }

    T getob() {
        return ob;
    }

    void showType() {
        System.out.println("Тип Т - это " + ob.getClass().getName());
    }
}
