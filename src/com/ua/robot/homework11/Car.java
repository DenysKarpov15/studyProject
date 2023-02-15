package com.ua.robot.homework11;

import java.util.Objects;

public class Car extends Vehicle {

    private String color;
    private String transmission;
    private int clearance;

    public Car() {
        super();
    }

    public Car(String brand, String model, int year, String color, String transmission, int clearance) {
        super(brand, model, year);
        this.color = color;
        this.transmission = transmission;
        this.clearance = clearance;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getClearance() {
        return clearance;
    }

    public void setClearance(int clearance) {
        this.clearance = clearance;
    }

    @Override
    public String getType() {
        return "car";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Car car = (Car) o;

        if (clearance != car.clearance) return false;
        if (!Objects.equals(color, car.color)) return false;
        return Objects.equals(transmission, car.transmission);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (transmission != null ? transmission.hashCode() : 0);
        result = 31 * result + clearance;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", transmission='" + transmission + '\'' +
                ", clearance=" + clearance +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
