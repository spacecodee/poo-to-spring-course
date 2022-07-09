package com.spacecodee.modificadores_acceso;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Bebe {
    private String dni;
    private String nombre;
    private String apellido;

    public String llorar() {
        return "Bebe llorando";
    }

    public String aprenderGatear() {
        return "Bebé aprendiendo a gatear";
    }

    public String aprendiendoCaminar() {
        return "Bebé aprendiendo a caminar";
    }

    public String comer() {
        return "Bebé comiendo";
    }
}
