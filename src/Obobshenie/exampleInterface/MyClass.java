package Obobshenie.exampleInterface;

public class MyClass<T> implements Containment<T> {
    T[] arrayRef;

    MyClass(T[] arrayRef) {
        this.arrayRef = arrayRef;
    }

    public boolean contains(T o) {
        for (T item : arrayRef) {
            if (item.equals(o)) {
                return true;
            }
        }
        return false;
    }
}
