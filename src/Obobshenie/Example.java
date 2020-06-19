package Obobshenie;

public class Example<T, V extends T> {
    T first;
    V second;

    Example(T first, V second) {
        this.first = first;
        this.second = second;
    }
}
