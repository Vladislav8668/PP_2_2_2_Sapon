package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {

    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "red", 180));
        cars.add(new Car("VAZ", "blue", 110));
        cars.add(new Car("Mercedes", "black", 215));
        cars.add(new Car("Toyota", "yellow", 143));
        cars.add(new Car("Nissan", "green", 121));
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
