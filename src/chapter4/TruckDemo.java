package chapter4;

public class TruckDemo {
    public static void main(String[] args) {
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        int dist = 252;
        double gallons = semi.fuelNeeded(dist);

        System.out.println("Гpyзoвик может перевезти " + semi.getCargocap() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль пикапу требуется " + gallons + " галлонов топлива.");
    }
}
