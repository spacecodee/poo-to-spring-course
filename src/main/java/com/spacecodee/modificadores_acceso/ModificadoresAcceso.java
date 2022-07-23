package com.spacecodee.modificadores_acceso;

public class ModificadoresAcceso {
    /*Public → accesible desde cualquier lugar
     * private → accesible solo desde la misma clase
     * protected → accesible desde la misma clase y desde clases que heredan de esta
     * default o package → accesible desde la misma clase y desde clases que heredan de esta
     * static → accesible desde la misma clase y desde clases que heredan de esta
     * final → accesible desde la misma clase y desde clases que heredan de esta
     * abstract → accesible desde la misma clase y desde clases que heredan de esta
     */

    /*
     * ¿qué es un objeto? → un objeto es una instancia de una clase
     *     ¿qué es una clase? → una clase es una plantilla para crear objetos
     *  */

    public static Bebe antesDeNacer() {
        Bebe mateoFernadez = new Bebe();
        mateoFernadez.setNombre("Mateo");
        mateoFernadez.setApellido("Fernandez Sandoval");
        return mateoFernadez;
    }

    public static Bebe despuesDeNacer() {
        Bebe mateoFernadez = ModificadoresAcceso.antesDeNacer();
        mateoFernadez.setDni("12345678");
        return mateoFernadez;
    }

    public void hola() {
        System.out.println("hola");
    }

    public static void main(String[] args) {
        Bebe returnValue = ModificadoresAcceso.antesDeNacer();
        System.out.println("returnValue = " + returnValue);
        Bebe bebeMateoF = ModificadoresAcceso.despuesDeNacer();
        System.out.println("\nbebeMateoF = " + bebeMateoF);

        System.out.println("********************");
        System.out.println(bebeMateoF.llorar());
        System.out.println(bebeMateoF.aprenderGatear());
        System.out.println(bebeMateoF.aprendiendoCaminar());
        System.out.println(bebeMateoF.comer());
    }
}