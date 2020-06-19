package MyThread.ImplementRunnable;

public class JoinThread {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("Child #1");
        MyThread mt2 = new MyThread("Child #2");
        MyThread mt3 = new MyThread("Child #3");

        try {
            mt1.thrd.join();
            System.out.println(mt1.thrd.getName() + " Join");
            mt2.thrd.join();
            System.out.println(mt2.thrd.getName() + " Join");
            mt3.thrd.join();
            System.out.println(mt3.thrd.getName() + " Join");
        } catch(InterruptedException exc) {
            System.out.println("Interrupted main thread");
        }

        System.out.println("Completion main thread");
    }
}
