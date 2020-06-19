package TryCatch;

public class Example {
    public static void main(String[] args) {
        int[] numer = {3, 5, 7, 5, 7, 4, 3, 2};
        int[] denom = {2, 0, 7, 9, 3, 6};

        for (int i = 0; i < numer.length; i++) {
            try {
                if ((numer[i] % 2) != 0) {
                    throw new NonIntResultException(numer[i], denom[i]);
                }
                System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
            } catch(ArithmeticException exc) {
                System.out.println("Попытка деления на нуль");
            } catch(ArrayIndexOutOfBoundsException exc) {
                System.out.println("Соответсвующий элемент не найден");
            } catch(NonIntResultException exc) {
                System.out.println(exc);
            }
        }
    }
}
