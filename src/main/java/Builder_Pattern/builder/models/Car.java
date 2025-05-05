package Builder_Pattern.builder.models;

import Builder_Pattern.builder.enums.CarType;
import Builder_Pattern.builder.enums.TransmissionType;

public class Car {
    private CarType carType;
    private int seats;
    private Engine engine;
    private TransmissionType transmissionType;
    private GPSNavigator gpsNavigator;
    private TripComputer tripComputer;
    private double fuel = 0;

    private Car(CarType carType, int seats, Engine engine, TransmissionType transmissionType, GPSNavigator gpsNavigator, TripComputer tripComputer) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmissionType = transmissionType;
        this.gpsNavigator = gpsNavigator;
        this.tripComputer = tripComputer;
    }

    public Car() {
        System.out.println("Constructing CAR");
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public void setGpsNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
