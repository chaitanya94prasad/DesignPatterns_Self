package Builder_Pattern.builder.buliderInterface;

import Builder_Pattern.builder.enums.CarType;
import Builder_Pattern.builder.enums.TransmissionType;
import Builder_Pattern.builder.models.Engine;
import Builder_Pattern.builder.models.GPSNavigator;
import Builder_Pattern.builder.models.TripComputer;

public interface Builder {
    public void setCarType(CarType carType);
    public void setSeats(int seats);
    public void setEngine(Engine engine);
    public void setTransmissionType(TransmissionType transmissionType);
    public void setTripComputer(TripComputer tripComputer);
    public void setGPSNavigator(GPSNavigator gpsNavigator);
}
