package MyEnum;

public class EnumDemo {
    public static void main(String[] args) {
        Transport tp;

        System.out.println("Speed airplane: " + Transport.AIRPLANE.getSpeed());
        System.out.println("Transport SPEED: ");
        for (Transport t : Transport.values()) {
            System.out.println(t.getSpeed());
        }
    }
}

enum Transport {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
    private int speed;

    Transport(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

