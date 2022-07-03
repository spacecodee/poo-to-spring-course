package com.spacecodee.modificadores_acceso;

import com.spacecodee.good_practice.GoodPractices;

public class ModificadoresAcceso {
    //public => accesible desde cualquier lugar
    //private => accesible solo desde la misma clase
    //protected => accesible desde la misma clase y desde clases que heredan de esta
    //default o package => accesible desde la misma clase y desde clases que heredan de esta
    //static => accesible desde la misma clase y desde clases que heredan de esta
    //final => accesible desde la misma clase y desde clases que heredan de esta
    //abstract => accesible desde la misma clase y desde clases que heredan de esta


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

    public static void main(String[] args) {
        Bebe returnValue = ModificadoresAcceso.antesDeNacer();
        System.out.println("returnValue = " + returnValue);
        Bebe returnValue2 = ModificadoresAcceso.despuesDeNacer();
        System.out.println("\nreturnValue2 = " + returnValue2);
    }
}
