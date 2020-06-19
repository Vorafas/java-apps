package TryCatch;

public class Rethrow {
    public static void genException() {
        int[] numer = {1, 2, 3, 4, 5, 9};
        int[] denom = {2, 0, 3, 7, 0};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
            } catch(ArithmeticException exc) {
                System.out.println("/ by zero".toUpperCase());
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("not found".toUpperCase());
                throw exc;
            }
        }
    }
}
