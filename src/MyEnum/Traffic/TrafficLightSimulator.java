package MyEnum.Traffic;

public class TrafficLightSimulator implements Runnable {
    private Thread thrd;
    private TrafficLightColor tlc;
    boolean stop = false;
    boolean changed = false;

    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;
        thrd = new Thread(this);
        System.out.println("THREAD NAME: " + thrd.getName());
        thrd.start();
    }

    TrafficLightSimulator() {
        this(TrafficLightColor.RED);
    }

    public void run() {
        while (!stop) {
            try {
                Thread.sleep(tlc.getDelay());
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }

    synchronized void changeColor() {
        if (tlc.compareTo(TrafficLightColor.RED) == 0) {
            tlc = TrafficLightColor.GREEN;
        } else if (tlc.compareTo(TrafficLightColor.YELLOW) == 0) {
            tlc = TrafficLightColor.RED;
        } else if (tlc.compareTo(TrafficLightColor.GREEN) == 0) {
            tlc = TrafficLightColor.YELLOW;
        }
        changed = true;
        notify(); // Уведомить о переключении цвета сфетофора
    }

    synchronized void waitForChange() {
        try {
            while (!changed) {
                wait();
            }
            changed = false;
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }

    TrafficLightColor getColor() {
        return tlc;
    }

    void cancel() {
        stop = true;
    }
}
