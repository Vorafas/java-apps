package lesson1;

public class Eaxmple {
    public static void main(String[] args) throws InterruptedException {
        Integer[] iStock = new Integer[10];
        Stack<Integer> stck = new Stack<Integer>(iStock);

        String[] names = {"One", "Two", "Three"};
        String[] strStore = new String[3];

        Stack<String> stk2 = new Stack<String>(strStore, names);
    }
}