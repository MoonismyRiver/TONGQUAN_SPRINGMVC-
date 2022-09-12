package com.example.crud_car.service.impl;

import com.example.crud_car.model.Car;
import com.example.crud_car.service.ICRUDService;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class CarServiceImpl implements ICRUDService<Car> {
    private final ArrayList<Car> cars;

    public CarServiceImpl() {
        this.cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota", "black", 1234567890));
        cars.add(new Car(2, "KIA", "white", 1234567890));
    }

    @Override
    public void create(Car car) {
        cars.add(car);
    }

    @Override
    public void update(Car car) {
        Car carUpdate = findById(car.getId());
        int index = cars.indexOf(carUpdate);
        cars.set(index, car);
    }

    @Override
    public void deleteById(int id) {
        Car carUpdate = findById(id);
        cars.remove(carUpdate);
    }

    @Override
    public ArrayList<Car> findAll() {
        return cars;
    }

    @Override
    public Car findById(int id) {
        for (Car c : cars) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Car> findAllByName(String name) {
        ArrayList<Car> carList = new ArrayList<>();
        for (Car c : cars) {
            if (c.getName().contains(name)) {
                carList.add(c);
            }
        }
        return carList;
    }
}
