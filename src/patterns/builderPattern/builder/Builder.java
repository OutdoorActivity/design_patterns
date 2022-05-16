package patterns.builderPattern.builder;


import patterns.builderPattern.car.Car;
import patterns.builderPattern.car.CarType;
import patterns.builderPattern.engine.Engine;
import patterns.builderPattern.transmission.Transmission;

public interface Builder {
    Builder setCarType(CarType carType);

    Builder setSeats(int seats);

    Builder setEngine(Engine engine);

    Builder setTransmission(Transmission transmission);

    Car build();
}
