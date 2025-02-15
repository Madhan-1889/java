package com.wipro.java.designpattern.builder.builders;

import com.wipro.java.designpattern.builder.cars.CarType;
import com.wipro.java.designpattern.builder.componenets.Engine;
import com.wipro.java.designpattern.builder.componenets.GPSNavigator;
import com.wipro.java.designpattern.builder.componenets.Transmission;
import com.wipro.java.designpattern.builder.componenets.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}