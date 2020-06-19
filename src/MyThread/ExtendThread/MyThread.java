package MyThread.ExtendThread;

public class MyThread extends Thread {
    MyThread(String name) {
        super(name);
        start();
    }

    public void run() {
        System.out.println(getName() + " - start");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("B " + getName() + ", count: " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(getName() + "- interrupted");
        }
        System.out.println(getName() + "- completion");
    }
}
