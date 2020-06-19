package MyThread.Sinchron;

public class MyThread implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int[] a;
    int answer;

    MyThread(String name, int[] nums) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();
    }

    public void run() {
        int sum;

        System.out.println(thrd.getName() + " - start");
        synchronized(sa) {
            answer = sa.sumArray(a);
        }
        System.out.println("Sum for " + thrd.getName() + ": " + answer);

        System.out.println(thrd.getName() + " - zavershenie");
    }
}
