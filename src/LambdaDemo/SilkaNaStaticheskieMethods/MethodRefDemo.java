package LambdaDemo.SilkaNaStaticheskieMethods;

public class MethodRefDemo {
    static boolean numTest(IntPredicate p, int v) {
        return p.test(v);
    }

    public static void main(String[] args) {
        boolean result;

        result = numTest(MyintPredicates::isPrime, 17);
        if (result) {
            System.out.println("17 - простое число");
        }

        result = numTest(MyintPredicates::isEven, 12);
        if (result) {
            System.out.println("12 - четное число");
        }

        result = numTest(MyintPredicates::isPositive, 11);
        if (result) {
            System.out.println("11 - положительное число");
        }
    }
}
