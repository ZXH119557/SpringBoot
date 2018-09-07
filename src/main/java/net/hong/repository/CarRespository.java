package net.hong.repository;

import net.hong.bean.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRespository extends CrudRepository<Car, Integer> {

}
