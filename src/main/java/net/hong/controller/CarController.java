package net.hong.controller;

import net.hong.bean.Car;
import net.hong.service.CarService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("car")
public class CarController {

    @Resource
    private CarService carService;

    @RequestMapping("save")
    public String save() {
        Car car = new Car();
        car.setCarName("宝马");
        car.setPrice("$1");
        carService.save(car);
        return "save ok";
    }

    @RequestMapping("delete")
    public String delete() {
        carService.delete(1);
        return "delete ok";
    }

    @RequestMapping("/getall")
    public Iterable<Car> getAll() {
        return carService.getAll();
    }
}
