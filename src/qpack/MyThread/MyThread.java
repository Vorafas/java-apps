package qpack.MyThread;

public class MyThread implements Runnable {
    Thread thrd;
    Queue queue;

    MyThread(Queue queue, String name) {
        thrd = new Thread(this, name);
        thrd.setPriority(Thread.NORM_PRIORITY + 4);
        this.queue = queue;
        thrd.start();
    }

    public void run() {
        if (thrd.getName().compareTo("put") == 0) {
            for (int i = 0; i < 6; i++) {
                queue.put((char) ('A' + i));
            }
        } else {
            for (int i = 0; i < 6; i++) {
                queue.get();
            }
        }
    }
}
