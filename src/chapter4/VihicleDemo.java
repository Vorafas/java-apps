package chapter4;

public class VihicleDemo {
    public static void main(String[] args) {
        Vehicle miniven = new Vehicle(30, 10, 20);

        System.out.println(miniven.range());
        System.out.println(miniven.fuelNeeded(200));
    }
}
