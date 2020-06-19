package LambdaDemo.example1;

public class LambdaDemo {
    public static void main(String[] args) {
        MyValue myVal;
        myVal = () -> 8.6;

        System.out.println("Постоянное значение: " + myVal.getValue());

        MyParamValue myPval = (n) -> 1.0 / n;
        System.out.println("Обратная велиина 4 равна " + myPval.getValue(4.0));
        System.out.println("Обратная велиина 8 равна " + myPval.getValue(8.0));

        // myVal = () -> "three";
    }
}
