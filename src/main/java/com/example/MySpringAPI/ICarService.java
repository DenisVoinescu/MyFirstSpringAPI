package com.example.MySpringAPI;

import java.util.List;
import java.util.Optional;

public interface ICarService {
    void createCar(CarEntity car);
    List<CarEntity> getCars();
   CarEntity getCarByID(Integer ID);

    void updateCar(Integer ID, CarEntity car);
    void deleteCar(Integer ID);

}
