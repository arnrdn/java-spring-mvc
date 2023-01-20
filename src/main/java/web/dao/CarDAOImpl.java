package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarDAOImpl implements CarDAO {
    private List<Car> cars;

    public CarDAOImpl() {
        cars = new ArrayList<>();

        cars.add(new Car("Super", 233566, "Onyx"));
        cars.add(new Car("Depression", 233586, "Blue"));
        cars.add(new Car("Hi sisters", 233577, "Rose Gold"));
        cars.add(new Car("Peek-a-boo", 233599, "Red Velvet"));
        cars.add(new Car("Lil dancey", 234466, "Deep Velvet"));
    }

    @Override
    public List<Car> getNumOfCars(int count) {
        if (count >= 5) {
            count = 5;
        }
        return cars.stream().limit(count).toList();
    }
}
