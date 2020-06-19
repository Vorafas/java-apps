package QuickSort;

public class QSDemo {
    public static void main(String[] args) {
        char[] a = {'a', 'x', 'd', 'r', 'p', 'j', 'i'};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        QuickSort.qsort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
