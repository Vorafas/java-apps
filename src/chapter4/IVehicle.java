package chapter4;

public interface IVehicle {
    int range();

    double fuelNeeded(int miles);

    public int getPassengers();

    void setPassengers(int passengers);

    int getFuelcap();

    void setFuelcap(int fuelcap);

    int getMpg();

    void setMpg(int mpg);
}
