package MyThread.ImplementRunnable;

public class MyThread implements Runnable {
    Thread thrd;

    MyThread(String thrdName) {
        thrd = new Thread(this, thrdName);
        thrd.start();
    }

    public void run() {
        System.out.println(thrd.getName() + " - start");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("B " + thrd.getName() + ", count: " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + "- interrupted");
        }
        System.out.println(thrd.getName() + "- completion");
    }
}
