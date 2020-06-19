package chapter4;

class Vehicle implements IVehicle {
    private int passengers; // количество пасажиров
    private int fuelcap; // емкость топливного бака
    private int mpg; // Потребление топлива в милях на галлон

    Vehicle(int passengers, int fuelcap, int mpg) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }

    public int range() {
        return fuelcap * mpg;
    }

    public double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }
}
