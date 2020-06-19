package Outer;

public class Outer {
    int[] array;

    Outer(int[] array) {
        this.array = array;
    }

    void analyze() {
        Inner inner = new Inner();
        System.out.println("MAN: " + inner.max());
        System.out.println("MIX: " + inner.min());
        System.out.println("AVG: " + inner.avg());
    }

    class Inner {
        int max() {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
            return max;
        }

        int min() {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
            return min;
        }

        double avg() {
            int result = 0;
            for (int i = 0; i < array.length; i++) {
                result += array[i];
            }
            return (double) result / array.length;
        }
    }
}
