package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{
    @Override
    public List<Car> getCarList(int count) {
        List<Car> carList=new ArrayList<>();
        carList.add(new Car("Tiko","UZ",4));
        carList.add(new Car("Kia","Korea",5));
        carList.add(new Car("Lexus","Japan",8));
        carList.add(new Car("Mazda","Japan",7));
        carList.add(new Car("Tesla","USA",2));

        return carList.stream().limit(count).toList();

    }
}
