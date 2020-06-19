package TryCatch;

import java.io.IOException;

public class RethrowDemo {
    public static char prompt(String msg) throws IOException {
        System.out.print(msg + ": ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;
        try {
            ch = prompt("Enter a letter");
        } catch (IOException exc) {
            System.out.println("Произошло исключение ввода-вывода");
            ch = 'X';
        }
        System.out.println("Вы нажали на клавишу: " + ch);
    }
}
