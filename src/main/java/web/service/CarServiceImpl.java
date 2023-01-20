package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAOImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarDAOImpl carDAO;

    public CarServiceImpl() {
        this.carDAO = new CarDAOImpl();
    }

    @Override
    public List<Car> getNumOfCars(int count) {
        return carDAO.getNumOfCars(count);
    }

}
