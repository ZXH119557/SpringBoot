package net.hong.service;

import net.hong.bean.Car;
import net.hong.repository.CarRespository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
public class CarService {

    @Resource
    private CarRespository carRespository;

    @Transactional
    public void save(Car car) {
        carRespository.save(car);
    }

    @Transactional
    public void delete(int carid) {
        carRespository.deleteById(carid);
    }

    @Transactional
    public Iterable<Car> getAll() {
        return carRespository.findAll();
    }
}
