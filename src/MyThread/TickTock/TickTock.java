package MyThread.TickTock;

public class TickTock {
    String state;

    synchronized void tick(boolean running) {
        if (!running) {
            state = "ticked";
            notify();
            return;
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted" + exc);
        }
        System.out.print("Tick ");
        state = "ticked";
        notify();

        try {
            while (!state.equals("tocked")) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) {
            state = "tocked";
            notify();
            return;
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted" + exc);
        }
        System.out.println("Tock");
        state = "tocked";
        notify();

        try {
            while (state.equals("tocked")) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted");
        }
    }

}
