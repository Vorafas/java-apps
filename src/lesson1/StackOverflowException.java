package lesson1;


public class StackOverflowException extends Exception {
    int size;

    StackOverflowException(int size) {
        this.size = size;
    }

    public String toString() {
        return "\nStack Overflow. Maximum size: " + size;
    }
}
