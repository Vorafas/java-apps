package MyEnum.Traffic;

public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightSimulator tl = new TrafficLightSimulator(TrafficLightColor.GREEN);

        for (int i = 0; i < 9; i++) {
            System.out.println(tl.getColor());
            tl.waitForChange();
        }

        tl.cancel();
    }
}

enum TrafficLightColor {
    RED(2000), GREEN(1000), YELLOW(1000);
    private int delay;

    TrafficLightColor(int delay) {
        this.delay = delay;
    }

    public int getDelay() {
        return delay;
    }
}
