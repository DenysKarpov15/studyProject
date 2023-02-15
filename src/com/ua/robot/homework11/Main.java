package com.ua.robot.homework11;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("bmw", "x3", 2023);
        Car car = new Car("bmw", "x3", 2023, "white", "automatic", 144);
        Truck truck = new Truck();
        truck.setEngine("diesel");
        truck.setFuelEfficiency(10.5);
        truck.setWeight(2500);

        System.out.println(vehicle);
        System.out.println(car);
        System.out.println(truck);

        System.out.println(vehicle.hashCode());
        System.out.println(car.hashCode());
        System.out.println(car.equals(vehicle));

        String vehicleType = vehicle.getType();
        String carType = car.getType();
        String truckType = truck.getType();

        System.out.println(vehicleType);
        System.out.println(carType);
        System.out.println(truckType);
    }
}
