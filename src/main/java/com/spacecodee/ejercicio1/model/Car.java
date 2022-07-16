package com.spacecodee.ejercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Car {
    private String uniqueCode;
    private String marca;
    private String modelo;
    private String color;
}
