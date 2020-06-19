package LambdaDemo.Homework;

public class LambdaDemo {
    public static void main(String[] args) {
//        MyFunc<Integer> nf = (n) -> {
//          int result = 1;
//          for (int i =1; i <= n; i++) {
//              result *= i;
//          }
//          return result;
//        };
//
//        System.out.println("Factorial 5 = " + nf.func(5));

        MyIntNum mi = new MyIntNum(20);
        NumericFunc nf = mi::hasCommonFactor;

        boolean result = nf.func(3);
        if (result) {
            System.out.println("Найден общий делитель");
        }


        String str1 = "I love Java";
        String str2 = str1;
        System.out.println(str2);

        str1 = "I love Python";
        System.out.println(str2);
    }
}
