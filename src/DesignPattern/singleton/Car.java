package DesignPattern.singleton;

public class Car {

    //Eager initialization of creating a sigle object
    private static Car car = new Car();

    private Car() {

    }

    public static Car getCar() {
        return car;
    }
}
