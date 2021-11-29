package br.com.andersonchoren.yournewcar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.andersonchoren.yournewcar.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer>{
    // Métodos SQL personalizados
}
