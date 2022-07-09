package com.spacecodee.ejercicio1;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MainExercise {

    /*TODO:persona tiene muchos carros y bicicletas
     * Bienvenida del sistema
     * menu de opciones
     * - menu para personas (agregar, editar, eliminar, buscar y listar)
     * - menu para carros (agregar, editar, eliminar, buscar y listar)
     * - menu para bicicletas (agregar, editar, eliminar, buscar y listar)
     * */

    public static void main(String[] args) {
        char option = '0';
        Scanner scanner = new Scanner(System.in);
        List<People> people;
        List<Car> cars;
        List<Bicicleta> bicicletas;

        System.out.println("Bienvenido al sistema de gestión de personas, carros y bicicletas");

        do {
            System.out.println("Por favor, seleccione una opción:");
            System.out.println("1. Personas\n2. Carros\n3. Bicicletas");
            option = scanner.next().charAt(0);

            switch (option) {
                case '1':
                    System.out.println("Personas");
                    break;
                case '2':
                    System.out.println("Carros");
                    break;
                case '3':
                    System.out.println("Bicicletas");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (option != '1' && option != '2' && option != '3');
    }
}
