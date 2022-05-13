package patterns.builderPattern.director;

import patterns.builderPattern.builder.Builder;
import patterns.builderPattern.car.Car;
import patterns.builderPattern.car.CarType;
import patterns.builderPattern.engine.Engine;
import patterns.builderPattern.transmission.Transmission;

import java.util.ArrayList;
import java.util.List;

public class Director {

    /**
     *
     * @param builder
     * without setTransmission();
     */
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0));
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(4);
        builder.setEngine(new Engine(1.2));
        builder.setTransmission(Transmission.AUTOMATIC);
    }

    public void constructSUVCar(Builder builder) {
        builder.setCarType(CarType.SUV_CAR);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5));
        builder.setTransmission(Transmission.MANUAL);
    }

}

