package MyThread.ImplementRunnable;

public class UseThread {
    public static void main(String[] args) {
        System.out.println("Start main thread");

        MyThread mt = new MyThread("Child #1");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Interrupted main thread");
            }
        }

        System.out.println("Completion main thread");
    }
}
