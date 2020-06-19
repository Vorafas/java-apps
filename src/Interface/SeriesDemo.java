package Interface;

public class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();

        int[] arr = ob.getNextArray(6);
        for (int i = 0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Next valuee: " + ob.getNext());
//        }

//        System.out.println("RESET");
//        ob.reset();
//
//        ob.setStart(100);
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Next valuee: " + ob.getNext());
//        }
    }
}
