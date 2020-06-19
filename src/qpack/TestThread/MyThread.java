package qpack.TestThread;

public class MyThread implements Runnable {
    Thread thrd;

    volatile boolean suspended;
    volatile boolean stopped;

    MyThread(String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
        thrd.start();
    }


    public void run() {
        try {
            for (int i = 0; i < 1000; i++) {
                System.out.print(i + " ");
                if ((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }
                synchronized (this) {
                    while(suspended) {
                        wait();
                    }
                    if (stopped) {
                        break;
                    }
                }
            }
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted");
        }
    }

    synchronized void mystop() {
        stopped = true;
        suspended = false;
        notify();
    }

    synchronized void mysuspend() {
        suspended = true;
    }

    synchronized void myresume() {
        suspended = false;
        notify();
    }
}
