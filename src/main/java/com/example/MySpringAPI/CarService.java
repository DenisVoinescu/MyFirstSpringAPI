package com.example.MySpringAPI;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService implements ICarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void createCar(CarEntity car) {
        carRepository.save(car);
    }

    public List<CarEntity> getCars() {
        return carRepository.findAll();
    }

    @Override
    public CarEntity getCarByID(Integer ID) {
        Optional<CarEntity> optionalCar = carRepository.findById(ID);
        if (optionalCar.isPresent()) {
            return optionalCar.get();
        } else {
            // If the car with the given ID doesn't exist, you can choose to return null or throw an exception.
            // For this example, let's throw an exception indicating that the car was not found.
            throw new IllegalArgumentException(String.format("Car with ID %s doesn't exist", ID));
        }
    }

    @Override
    public void updateCar(Integer ID, CarEntity car) {
        CarEntity carToUpdate = carRepository.findById(ID).orElseThrow(()
                -> new IllegalStateException(String.format("Car with ID %s doesn't exist", ID)));
        carToUpdate.setBrand(car.getBrand());
        carToUpdate.setModel(car.getModel());
        carToUpdate.setColor(car.getColor());
        carToUpdate.setPrice(car.getPrice());
        carToUpdate.setKilometerCount(car.getKilometerCount());

        carRepository.save(carToUpdate);
    }

    @Override
    public void deleteCar(Integer ID) {
        boolean carExists = carRepository.existsById(ID);
        if(carExists)
        carRepository.deleteById(ID);
        else
            throw new IllegalStateException(String.format("Car with ID cardoesn't exist", ID));
    }
}
