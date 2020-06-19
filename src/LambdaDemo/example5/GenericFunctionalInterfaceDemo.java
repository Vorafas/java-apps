package LambdaDemo.example5;

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2)) {
            System.out.println("2 яыляется делителем 10");
        }
        System.out.println();

        SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;
        if (isFactorD.test(212.0, 2.0)) {
            System.out.println("4.0 яыляется делителем 212.0");
        }
        System.out.println();

        SomeTest<String> isIn = (a, b) -> a.indexOf(b) != 0;
        String str = "Обощенный функциональный интерфейс";

        if (isIn.test(str, "face")) {
            System.out.println("'face' найдено");
        } else {
            System.out.println("'face' не найдено");
        }
    }
}
