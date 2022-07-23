package com.spacecodee.classes.abstracts;

public class ClasesAbstractas {

    /*
     * ¿Qué entiendes por abstracto?
     * */

    public static void main(String[] args) {
        int number;
        Person person;
        /*
         * 100 lines more
         * */

        person = new Ingeniero(12345678, "Mateo", "Fernandez Sandoval", "Ingeniero", (short) 10,
                               new String[]{"Java", "C++", "C#"});
        System.out.println("person = " + person);

        person = new Ingeniero("Ingeniero", (short) 10, new String[]{"Java", "C++", "C#"});
        System.out.println("person = " + person);
    }
}
