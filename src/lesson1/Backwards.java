package lesson1;

public class Backwards {
    public String str;

    public Backwards(String str) {
        this.str = str;
    }

    void backward(int index) {
        if (index != str.length() - 1) {
            backward(index + 1);
        }
        System.out.println(str.charAt(index));
    }
}
