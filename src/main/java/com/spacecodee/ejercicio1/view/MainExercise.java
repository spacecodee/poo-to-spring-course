package com.spacecodee.ejercicio1.view;

import com.spacecodee.ejercicio1.model.Bicicleta;
import com.spacecodee.ejercicio1.model.Car;
import com.spacecodee.ejercicio1.model.People;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainExercise {

    /*TODO: persona tiene muchos carros y bicicletas
     * - Bienvenida del sistema
     * - menu de opciones
     * - menu para personas (agregar, editar, eliminar, buscar y listar)
     * - menu para carros (agregar, editar, eliminar, buscar y listar)
     * - menu para bicicletas (agregar, editar, eliminar, buscar y listar)
     * */

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        char option;
        final Set<People> globalPeoples = new HashSet<>(); //TODO: Lista global de personas
        final Set<Car> globalCars = new HashSet<>(); //TODO: Lista global de carros
        final Set<Bicicleta> globalBicicletas = new HashSet<>(); //TODO: Lista global de bicicletas

        System.out.println("Bienvenido al sistema de gestión de personas, carros y bicicletas");

        do {
            option = MainExercise.getOptionMainMenu();

            switch (option) {
                case '1':
                    char peopleMenu;
                    peopleMenu = MainExercise.getSystemInternalMenu();

                    while (MainExercise.isMenuValid(peopleMenu)) {
                        switch (peopleMenu) {
                            case '1':
                                char carMenuOption;
                                char bicicletaMenuOption;
                                final People people = new People(); //TODO: Crear una persona
                                final Set<Car> carsPerson = new HashSet<>();
                                final Set<Bicicleta> bicicletasPerson = new HashSet<>();

                                System.out.println("Por favor, ingrese los datos de la persona:");
                                //TODO: pasar los datos de la persona
                                System.out.println("DNI:");
                                people.setDni(scanner.next());
                                System.out.println("Nombre:");
                                people.setName(scanner.next());
                                System.out.println("Apellido:");
                                people.setLastName(scanner.next());

                                carMenuOption = MainExercise.getVehicleOption("¿Desea agregar un carro?");

                                while (carMenuOption == '1') {
                                    Car car = new Car();

                                    System.out.println("Por favor, ingrese los datos del carro:");
                                    System.out.println("Placa:");
                                    car.setUniqueCode(scanner.next());
                                    System.out.println("Modelo:");
                                    car.setModelo(scanner.next());
                                    System.out.println("Color:");
                                    car.setColor(scanner.next());

                                    carsPerson.add(car);
                                    System.out.println("El carro ha sido agregado");

                                    carMenuOption = MainExercise.getVehicleOption("¿Desea agregar un carro?");
                                }

                                bicicletaMenuOption = MainExercise.getVehicleOption(
                                        "¿Desea agregar una bicicleta?");

                                while (bicicletaMenuOption == '1') {
                                    Bicicleta bicicleta = new Bicicleta();

                                    System.out.println("Por favor, ingrese los datos de la bicicleta:");
                                    System.out.println("Código:");
                                    bicicleta.setUniqueCode(scanner.next());
                                    System.out.println("Modelo:");
                                    bicicleta.setModelo(scanner.next());
                                    System.out.println("Color:");
                                    bicicleta.setColor(scanner.next());

                                    bicicletasPerson.add(bicicleta);
                                    System.out.println("Bicicleta agregada");

                                    bicicletaMenuOption = MainExercise.getVehicleOption(
                                            "¿Desea agregar una bicicleta?");
                                }

                                people.setCars(carsPerson);
                                people.setBicicletas(bicicletasPerson);

                                globalCars.addAll(carsPerson);
                                globalBicicletas.addAll(bicicletasPerson);

                                globalPeoples.add(people);
                                System.out.println("Persona agregada con éxito");
                                break;
                            case '2':
                                System.out.println("Editar persona");
                                break;
                            case '3':
                                System.out.println("Eliminar persona");
                                break;
                            case '4':
                                System.out.println("Buscar persona");
                                break;
                            case '5':
                                System.out.println("Lista de personas");
                                System.out.println(globalPeoples);
                                break;
                            default:
                                peopleMenu = '4';
                                System.out.println("Opción inválida");
                                break;
                        }

                        peopleMenu = MainExercise.getSystemInternalMenu();
                    }
                    break;
                case '2':
                    System.out.println("Carros");
                    break;
                case '3':
                    System.out.println("Bicicletas");
                    break;
                default:
                    option = '4';
                    System.out.println("Opción inválida");
                    break;
            }
        } while (option == '4');
    }

    private static boolean isMenuValid(char menu) {
        return menu == '1' || menu == '2' || menu == '3' || menu == '4' || menu == '5';
    }

    private static char getSystemInternalMenu() {
        char peopleMenu;
        System.out.println("Por favor, seleccione una opción:");
        System.out.println("1. Agregar\n2. Editar\n3. Eliminar\n4. Buscar\n5. Listar\n6. Salir");
        peopleMenu = scanner.next().charAt(0);
        return peopleMenu;
    }

    private static char getVehicleOption(String question) {
        char carMenuOption;
        System.out.println(question);
        System.out.println("1. Si\n2. No");
        carMenuOption = MainExercise.scanner.next().charAt(0);
        return carMenuOption;
    }

    private static char getOptionMainMenu() {
        char option;
        System.out.println("Por favor, seleccione una opción:");
        System.out.println("1. Personas\n2. Carros\n3. Bicicletas");
        option = MainExercise.scanner.next().charAt(0);
        return option;
    }
}
