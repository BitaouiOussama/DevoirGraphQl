package com.example.devoir_surveille.service;

import com.example.devoir_surveille.dtos.CarDTO;

import java.util.List;

public interface CarService {

    public CarDTO saveCar(CarDTO carDTO);

    public List<CarDTO> getCarByModel(String model);


}
