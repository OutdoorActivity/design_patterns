package patterns.builderPattern;

import patterns.builderPattern.builder.CarBuilder;
import patterns.builderPattern.car.Car;
import patterns.builderPattern.director.Director;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        System.out.println(carBuilder.getResult());
    }
}
