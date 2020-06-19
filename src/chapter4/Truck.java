package chapter4;

public class Truck extends Vehicle {
    private int cargocap; // грузоподъемность в фунтах

    public Truck(int passengers, int fuelcap, int mpg, int c) {
        super(passengers, fuelcap, mpg);
        cargocap = c;
    }

    public int getCargocap() {
        return cargocap;
    }

    public void setCargocap(int cargocap) {
        this.cargocap = cargocap;
    }
}
