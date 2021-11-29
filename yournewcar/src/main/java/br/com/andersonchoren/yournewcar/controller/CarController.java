package br.com.andersonchoren.yournewcar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.andersonchoren.yournewcar.model.dto.CarDTO;
import br.com.andersonchoren.yournewcar.service.CarService;

@RestController
@RequestMapping("/carros")
public class CarController {
    @Autowired
    private CarService carService;

    @PostMapping
    public ResponseEntity<CarDTO> insert(@RequestBody CarDTO carDTO) {
        if (carDTO != null) {
            var result = carService.insertOrUpdate(carDTO);

            if (result != null) {
                return new ResponseEntity<>(result, HttpStatus.CREATED);
            }
            return new ResponseEntity<>(new CarDTO(), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(new CarDTO(), HttpStatus.BAD_REQUEST);
    }
}
