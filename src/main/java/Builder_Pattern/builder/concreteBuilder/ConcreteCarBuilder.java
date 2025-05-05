package Builder_Pattern.builder.concreteBuilder;

import Builder_Pattern.builder.buliderInterface.Builder;
import Builder_Pattern.builder.enums.CarType;
import Builder_Pattern.builder.enums.TransmissionType;
import Builder_Pattern.builder.models.Car;
import Builder_Pattern.builder.models.Engine;
import Builder_Pattern.builder.models.GPSNavigator;
import Builder_Pattern.builder.models.TripComputer;

public class ConcreteCarBuilder implements Builder {

    private Car car;

    public ConcreteCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void setCarType(CarType carType) {
        this.car.setCarType(carType);
    }

    @Override
    public void setSeats(int seats) {
        this.car.setSeats(seats);
    }

    @Override
    public void setEngine(Engine engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTransmissionType(TransmissionType transmissionType) {
        this.car.setTransmissionType(transmissionType);
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.car.setTripComputer(tripComputer);
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.car.setGpsNavigator(gpsNavigator);
    }

    public void getCar() {
        System.out.println("CarType:" + this.car.getCarType());
        System.out.println("Seats:" + this.car.getSeats());
        System.out.println("Engine:" + this.car.getEngine());
        System.out.println("Transmission:" + this.car.getTransmissionType());
        System.out.println("Trip Computer:" + this.car.getTripComputer());
        System.out.println("GPS Navigator:" + this.car.getGpsNavigator());

    }
}
