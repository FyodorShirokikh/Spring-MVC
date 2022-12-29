package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.dao.CarDao;
import java.util.List;
@Service
public class CarServiceImp implements CarService{
    private final CarDao carDao;

    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> showCars(int count) {
        return carDao.showCars(count);
    }
}
