package com.example.devoir_surveille.mappers;


import com.example.devoir_surveille.dao.entities.Voiture;
import com.example.devoir_surveille.dtos.CarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class CarMapper {

    private ModelMapper modelMapper = new ModelMapper();

    public CarDTO fromCarToCarDto(Voiture voiture){
        return modelMapper.map(voiture,CarDTO.class);
    }

    public Voiture fromCarDtoToCar(CarDTO carDTO){
        return modelMapper.map(carDTO,Voiture.class);
    }




}
