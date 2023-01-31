package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    private static List<Car> carList = new ArrayList<>();

    public CarDaoImp() {
        carList.add(new Car("BMW", "m5 f90"));
        carList.add(new Car("LandRover", "evoque"));
        carList.add(new Car("Audi", "q3"));
        carList.add(new Car("Skoda", "Rapid"));
        carList.add(new Car("Volvo", "XC40"));
    }

    @Override
    public List<Car> getCarList(String count) {
        int value;
        try {
            value = Integer.parseInt(count);
        } catch (Exception e) {
            value = 5;
        }
        return carList.stream().limit(value).toList();
    }
}
