package MyEnum;

public class EnumDemo3 {
    public static void main(String[] main) {
        Vehicle tp, tp2, tp3;

        System.out.println("Константты  перечисления Vehicle и их порядковое значение: ");
        for (Vehicle t : Vehicle.values()) {
            System.out.println(t + " " + t.ordinal());
        }

        tp = Vehicle.AIRPLANE;
        tp2 = Vehicle.TRAIN;
        tp3 = Vehicle.AIRPLANE;
        System.out.println();

        if (tp.compareTo(tp2) < 0) {
            System.out.println(tp + " идет перед " + tp2);
        }

        if (tp.compareTo(tp2) > 0) {
            System.out.println(tp2 + " идет перед " + tp);
        }

        if (tp.compareTo(tp3) == 0) {
            System.out.println(tp + " совпадает с " + tp3);
        }

    }
}

enum Vehicle {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}