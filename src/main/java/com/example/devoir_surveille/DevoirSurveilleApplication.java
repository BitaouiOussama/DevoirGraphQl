package com.example.devoir_surveille;

import com.example.devoir_surveille.dtos.CarDTO;
import com.example.devoir_surveille.service.CarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DevoirSurveilleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevoirSurveilleApplication.class, args);
	}


	@Bean
	CommandLineRunner start(CarService carService){
		return  args -> {
			carService.saveCar(

							CarDTO.builder().model("model1").color("red").matricul("sdf64w6e").price(12345).build()
			);
		};
	}

}
