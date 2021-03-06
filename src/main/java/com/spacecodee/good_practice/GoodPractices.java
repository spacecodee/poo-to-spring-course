package com.spacecodee.good_practice;

import com.spacecodee.modificadores_acceso.ModificadoresAcceso;
import lombok.var;

public class GoodPractices {
    //Java => nomenclatura camelCase
    //variables => area ✅ | Area ❌ | AREA ❌ || firstName ✅ | firstname | FirstName
    //functions => public void sumar(); ✅ | Sumar() ❌ | SUMAR(); ❌ || quieroSumar();
    //Classes => Product ✅ | product ❌ | PRODUCT ❌ || UserRoles ✅ | USERroles | userRoleS
    //Constants => AGE_PEOPLE | age | AgE
    //write in english
    //utilizar loombok
    //.properties -> dev - test - prod
    //.maven -> utilzar solo dependencias necesarias
    //trabajar con git
    //encapsulate variables
    //usar getters and setters
    //use toString
    //tener clases dentro de otra clase (inner classes) ❌
    //nombre de variables o clases o metodos => deben de ser explicativas y claras
    //clases, metodos o variables estaticas => deben ser accedidas mediante el nombre de la clases
    //clases, metodos o variables no estaticas => deben ser accedidas mediante el objeto (this)
    //los metodos solo pueden tener maximo hasta 15 lineas de codigo

    public static void main(String[] args) {
        ModificadoresAcceso marco = new ModificadoresAcceso();
        marco.hola();
        //-128 hasta +127

        var myVariable = ModificadoresAcceso.despuesDeNacer();
    }
}
