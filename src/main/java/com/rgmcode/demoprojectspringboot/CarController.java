package com.rgmcode.demoprojectspringboot;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private List<Car> cars = new ArrayList<>();

    @PostMapping
    public Car post(@RequestBody Car car){
        cars.add(car);
        return car;
    }

    @GetMapping
    public List<Car> get(){
        return cars;
    }

    @PutMapping("/{id}")
    public Car put(@PathVariable String id,  @RequestBody Car car){
        for (int i = 0; i < cars.size(); i++){
            if (cars.get(i).getId().equals(id)) {
                cars.set(i, car);
                return car;
            }
            }
        return null;
        }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        int index = -1;
        for (int i = 0; i < cars.size(); i++){
            if (cars.get(i).getId().equals(id)){
                index = 1;
                break;
            }
        }
        cars.remove(index);
    }


}
