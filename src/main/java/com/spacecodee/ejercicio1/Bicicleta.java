package com.spacecodee.ejercicio1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Bicicleta {
    private String uniqueCode;
    private String marca;
    private String modelo;
    private String color;
}
