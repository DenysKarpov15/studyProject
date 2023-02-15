package com.ua.robot.homework11;

public class Truck extends Vehicle {

    private String engine;
    private double fuelEfficiency;
    private int weight;

    public Truck() {
        super();
    }

    public Truck(String brand, String model, int year, String engine, double fuelEfficiency, int weight) {
        super(brand, model, year);
        this.engine = engine;
        this.fuelEfficiency = fuelEfficiency;
        this.weight = weight;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String getType() {
        return "truck";
    }

    @Override
    public String toString() {
        return "Truck{" +
                "engine='" + engine + '\'' +
                ", fuelEfficiency=" + fuelEfficiency +
                ", weight=" + weight +
                '}';
    }
}
