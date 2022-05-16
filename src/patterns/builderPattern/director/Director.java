package patterns.builderPattern.director;

import patterns.builderPattern.builder.Builder;
import patterns.builderPattern.car.Car;
import patterns.builderPattern.car.CarType;
import patterns.builderPattern.engine.Engine;
import patterns.builderPattern.transmission.Transmission;

public class Director {
    private Director() {

    }

    public static Director getDirector() {
        return new Director();
    }

    /**
     * @param builder without setTransmission();
     */
    public Car constructSportsCar(Builder builder) {
        return builder
                .setCarType(CarType.SPORTS_CAR)
                .setSeats(2)
                .setEngine(new Engine(3.0))
                .build();
        //setTransmission(Transmission.SEMI_AUTOMATIC);
    }

    public Car constructCityCar(Builder builder) {
        return builder
                .setCarType(CarType.CITY_CAR)
                .setSeats(4)
                .setEngine(new Engine(1.2))
                .setTransmission(Transmission.AUTOMATIC)
                .build();
    }

    public Car constructSUVCar(Builder builder) {
        return builder
                .setCarType(CarType.SUV_CAR)
                .setSeats(4)
                .setEngine(new Engine(2.5))
                .setTransmission(Transmission.MANUAL)
                .build();
    }

}

