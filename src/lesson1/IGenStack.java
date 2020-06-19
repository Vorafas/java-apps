package lesson1;

public interface IGenStack<T> {
    void push(T ob) throws StackOverflowException;

    T pop() throws StackIsEmptyException;

    static String seyHi() {
        return "Hello";
    }
}
