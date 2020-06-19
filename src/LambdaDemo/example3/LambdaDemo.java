package LambdaDemo.example3;

public class LambdaDemo {
    public static void main(String[] args) {
        StringTest isIn = (a, b) -> a.indexOf(b) != -1;

        String str = "Это тест";

        System.out.println("Тестируемая строка: " + str);

        if (isIn.test(str, "Это")) {
            System.out.println("'Это' найдено");
        } else {
            System.out.println("'Это' не найдено");
        }

        if (isIn.test(str, "xyz")) {
            System.out.println("'xyz' найдено");
        } else {
            System.out.println("'xyz' не найдено");
        }
    }
}
