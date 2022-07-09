package com.spacecodee.ejercicio1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class People {
    private int id;
    private String dni;
    private String name;
    private String lastName;
    private Set<Car> cars = new HashSet<>();
    private Set<Bicicleta> bicicletas = new HashSet<>();
}
