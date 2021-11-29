package br.com.andersonchoren.yournewcar.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.andersonchoren.yournewcar.model.Car;
import br.com.andersonchoren.yournewcar.model.dto.CarDTO;
import br.com.andersonchoren.yournewcar.repository.CarRepository;
import br.com.andersonchoren.yournewcar.util.CarMapping;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public CarDTO insertOrUpdate(CarDTO car) {
        var result = carRepository.save(CarMapping.toCar(car));
        return CarMapping.fromCar(result);
    }

    // public Car insertOrUpdate(Car car) {
    // return carRepository.save(car);
    // }

    public List<CarDTO> findAll() {
        return carRepository.findAll().stream().map(car -> CarMapping.fromCar(car)).collect(Collectors.toList());
    }

    public CarDTO findById(int id) {
        var result = carRepository.findById(id);

        if (result.isPresent())
            return CarMapping.fromCar(result.get());
        else
            return new CarDTO();
    }

    public boolean delete(int id) {
        carRepository.deleteById(id);

        var result = carRepository.findById(id);
        return result.isEmpty();
    }

}
