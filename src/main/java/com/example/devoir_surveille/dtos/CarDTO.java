package com.example.devoir_surveille.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CarDTO {

    private String model;
    private String color;
    private String matricul;
    private float price;
}
