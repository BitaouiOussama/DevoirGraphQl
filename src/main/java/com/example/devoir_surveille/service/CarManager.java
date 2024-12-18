package com.example.devoir_surveille.service;

import com.example.devoir_surveille.dao.entities.Voiture;
import com.example.devoir_surveille.dao.repositories.VoitureRepository;
import com.example.devoir_surveille.dtos.CarDTO;
import com.example.devoir_surveille.mappers.CarMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarManager implements CarService{

    @Autowired
    private  CarMapper carMapper;
    @Autowired
    private  VoitureRepository voitureRepository;
    @Override
    public CarDTO saveCar(CarDTO carDTO) {
     /*
     if (carDTO.getPrice() <= 0) {
            throw new IllegalArgumentException("Le prix du Car doit être supérieur à 0");
        }
     * */

        Voiture voiture = carMapper.fromCarDtoToCar(carDTO);

        System.out.println(voiture);

        voiture = voitureRepository.save(voiture);
        carDTO = carMapper.fromCarToCarDto(voiture);
        return carDTO;
    }

    @Override
    public List<CarDTO> getCarByModel(String model) {
        List<Voiture> voitures = voitureRepository.findByModel(model);
        List<CarDTO> carDTOS = new ArrayList<>();
        for (Voiture voiture : voitures) {
            carDTOS.add(carMapper.fromCarToCarDto(voiture));
        }
        return carDTOS;
    }
}
