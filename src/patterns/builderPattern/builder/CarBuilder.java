package patterns.builderPattern.builder;


import patterns.builderPattern.builder.Builder;
import patterns.builderPattern.car.Car;
import patterns.builderPattern.car.CarType;
import patterns.builderPattern.engine.Engine;
import patterns.builderPattern.transmission.Transmission;

import java.util.ArrayList;
import java.util.List;

public class CarBuilder implements Builder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Car getResult() {
        return new Car(carType, seats, engine, transmission);
    }
}
