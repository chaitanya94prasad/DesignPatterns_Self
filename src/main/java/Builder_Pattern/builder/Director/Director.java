package Builder_Pattern.builder.Director;

import Builder_Pattern.builder.buliderInterface.Builder;
import Builder_Pattern.builder.enums.CarType;
import Builder_Pattern.builder.enums.TransmissionType;
import Builder_Pattern.builder.models.Engine;
import Builder_Pattern.builder.models.GPSNavigator;
import Builder_Pattern.builder.models.TripComputer;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0,0));
        builder.setTransmissionType(TransmissionType.SEMI_AUTOMATIC);
        builder.setGPSNavigator(new GPSNavigator());
        builder.setTripComputer(new TripComputer());
    }

    public void constructCitysCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(4);
        builder.setEngine(new Engine(1.2,0));
        builder.setTransmissionType(TransmissionType.AUTOMATIC);
        builder.setGPSNavigator(new GPSNavigator());
        builder.setTripComputer(new TripComputer());
    }

    public void constructSUVsCar(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(6);
        builder.setEngine(new Engine(4.0,0));
        builder.setTransmissionType(TransmissionType.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
        builder.setTripComputer(new TripComputer());
    }

}
