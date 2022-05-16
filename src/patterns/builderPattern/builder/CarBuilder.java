package patterns.builderPattern.builder;


import patterns.builderPattern.car.Car;
import patterns.builderPattern.car.CarType;
import patterns.builderPattern.engine.Engine;
import patterns.builderPattern.transmission.Transmission;

public class CarBuilder implements Builder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;

    private CarBuilder() {
    }

    public static CarBuilder getCarBuilder() {
        return new CarBuilder();
    }

    @Override
    public Builder setCarType(CarType carType) {
        this.carType = carType;
        return this;
    }

    @Override
    public Builder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Builder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public Car build() {
        return new Car(carType, seats, engine, transmission);
    }


}
