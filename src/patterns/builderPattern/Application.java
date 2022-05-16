package patterns.builderPattern;

import patterns.builderPattern.builder.Builder;
import patterns.builderPattern.builder.CarBuilder;
import patterns.builderPattern.car.Car;
import patterns.builderPattern.director.Director;

public class Application {
    public static void main(String[] args) {
        Builder builder = CarBuilder.getCarBuilder();
        Director director = Director.getDirector();
        Car car = director.constructCityCar(builder);
        System.out.println(car);
    }
}
