package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private static List<Car> carList = new ArrayList<>();

    @Autowired
    public CarServiceImp() {
        carList.add(new Car("BMW", "m5 f90"));
        carList.add(new Car("LandRover", "evoque"));
        carList.add(new Car("Audi", "q3"));
        carList.add(new Car("Skoda", "Rapid"));
        carList.add(new Car("Volvo", "XC40"));
    }

    @Override
    public List<Car> getCarList(Integer count) {
        return carList.stream().limit(count).toList();
    }
}
