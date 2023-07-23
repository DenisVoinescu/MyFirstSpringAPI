package com.example.MySpringAPI;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/v1/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<CarEntity> getCars() {
        return carService.getCars();
    }
    @GetMapping("/{ID}")
    public CarEntity getCarByID(@PathVariable Integer ID) {
        return carService.getCarByID(ID);
    }
    @PostMapping
    public  void createCar(@RequestBody CarEntity car) {
        carService.createCar(car);
    }
    @PutMapping(path = "{ID}")
    public void updateCar(@PathVariable Integer ID, @RequestBody CarEntity car) {
        carService.updateCar(ID, car);
    }
    @DeleteMapping(path = "{ID}")
    public void deleteCar(@PathVariable Integer ID) {
        carService.deleteCar(ID);
    }

}
