package patterns.builderPattern.car;

import patterns.builderPattern.engine.Engine;
import patterns.builderPattern.transmission.Transmission;

/**
 * POJO class
 */
public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;

    private final Transmission transmission;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (seats != car.seats) return false;
        if (carType != car.carType) return false;
        if (engine != null ? !engine.equals(car.engine) : car.engine != null) return false;
        return transmission == car.transmission;
    }

    @Override
    public int hashCode() {
        int result = carType != null ? carType.hashCode() : 0;
        result = 31 * result + seats;
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        result = 31 * result + (transmission != null ? transmission.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", engine=" + engine +
                ", transmission=" + transmission +
                '}';
    }
}
