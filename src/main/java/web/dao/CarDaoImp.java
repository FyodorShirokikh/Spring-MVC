package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{
    private static int CARS_COUNT;
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++CARS_COUNT, "Ford", "red", 101));
        cars.add(new Car(++CARS_COUNT, "BMW", "black", 102));
        cars.add(new Car(++CARS_COUNT, "Toyota", "white", 103));
        cars.add(new Car(++CARS_COUNT, "Nissan", "grey", 104));
        cars.add(new Car(++CARS_COUNT, "Niva", "green", 105));
    }

    public List<Car> showCars(int count) {
        List<Car> listCars = new ArrayList<>();
        if (count >= 5) {
            return cars;
        } else {
            for (int i = 0; i <= count - 1; i++) {
                listCars.add(cars.get(i));
            }
            return listCars;
        }
    }
}
