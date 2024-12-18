package com.example.devoir_surveille.web;


import com.example.devoir_surveille.dtos.CarDTO;
import com.example.devoir_surveille.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CarGraphQLController {

    @Autowired
    private CarService carService;

    @MutationMapping
    public CarDTO saveCar(@Argument CarDTO carDTO){
        return carService.saveCar(carDTO);
    }

    @QueryMapping
    public List<CarDTO> getCarByModel(@Argument String model){
        return carService.getCarByModel(model);
    }



}
