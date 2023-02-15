package com.ua.robot.homework11;

import java.util.Objects;

public class Vehicle {

    protected String brand;
    protected String model;
    protected int year;

    public Vehicle() {
        System.out.println("Default constructor");
    }

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return "vehicle";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (year != vehicle.year) return false;
        if (!Objects.equals(brand, vehicle.brand)) return false;
        return Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + year;
        return result;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
