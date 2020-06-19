package qpack.TestThread;

public class ThreadDemo {
    public static void main(String[] main) {
        MyThread mt = new MyThread("Child #1");

        try {
            Thread.sleep(1000);

            mt.mysuspend();
            System.out.println("PAUSE");
            Thread.sleep(250);

            mt.myresume();
            System.out.println("RESUME");
            Thread.sleep(250);

            mt.mysuspend();
            System.out.println("PAUSE");
            Thread.sleep(250);

            mt.myresume();
            System.out.println("RESUME");
            Thread.sleep(250);

            mt.mystop();
        } catch(InterruptedException exc) {
            System.out.println("Thread interrupted");
        }



        try {
            mt.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Thread interrupted");
        }
    }
}
