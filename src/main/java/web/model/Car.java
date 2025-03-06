package web.model;

import java.util.Arrays;
import java.util.List;

public class Car {

    private String brand;
    private String color;
    private int horsePower;

    public Car() {
    }

    public Car(String brand, String color, int horsePower) {
        this.brand = brand;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }

    public static List<Car> makeListOfFiveCars() {
        Car car1 = new Car("BMW", "red", 180);
        Car car2 = new Car("VAZ", "blue", 110);
        Car car3 = new Car("Mercedes", "black", 215);
        Car car4 = new Car("Toyota", "yellow", 143);
        Car car5 = new Car("Nissan", "green", 121);
        return Arrays.asList(car1, car2, car3, car4, car5);
    }

}
