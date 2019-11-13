package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App {

    // one line comment
    public static void main(String[] args) {
        System.out.println("Welcome to the racing game!");

        Car carReference = new Car();
        carReference.name = "Dacia";
        carReference.color = "red";
        carReference.milage = 9.8;
        carReference.fuelLevel = 60;
        carReference.maxSpeed = 200;
        carReference.running = false;
        carReference.doorcount = 4;

        Car car2 = new Car();
        car2.name = "BMW";
        car2.milage = 14;
        car2.color = "blue";
        car2.fuelLevel = 45;
        car2.running = true;
        car2.doorcount = 1;

        System.out.println("First car name; " + carReference.name);

        System.out.println(carReference.color);
        System.out.println(carReference.milage);
        System.out.println(carReference.fuelLevel);
        System.out.println(carReference.maxSpeed);
        System.out.println(carReference.traveledDistance);

        System.out.println("Second car name; " + car2.name);
        System.out.println(car2.color);
        System.out.println(car2.milage);
        System.out.println(car2.fuelLevel);
        System.out.println(car2.maxSpeed);
        System.out.println(car2.traveledDistance);

        car2.name = "VW";
        System.out.println(car2.name);

        Car car3 = car2;
        car3.name = "Audi";
        System.out.println("car2.name:  " +  car2.name);
        System.out.println("car3.name:  "  + car3.name);

    }
}