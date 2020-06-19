package finalize;

class Finalize {
    public static void main(String[] args) {
        int[] array = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j] > array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
