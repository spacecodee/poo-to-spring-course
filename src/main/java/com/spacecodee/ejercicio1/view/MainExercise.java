package com.spacecodee.ejercicio1.view;

import com.spacecodee.ejercicio1.model.Bicicleta;
import com.spacecodee.ejercicio1.model.Car;
import com.spacecodee.ejercicio1.model.People;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainExercise {

    /* persona tiene muchos carros y bicicletas
     * - Bienvenida del sistema
     * - menu de opciones
     * - menu para personas (agregar, editar, eliminar, buscar y listar)
     * - menu para carros (agregar, editar, eliminar, buscar y listar)
     * - menu para bicicletas (agregar, editar, eliminar, buscar y listar)
     * */

    private static final Scanner SCANNER = new Scanner(System.in);


    public static void main(String[] args) {
        int option;
        final Set<People> globalPeoples = new HashSet<>(); //Lista global de personas
        final Set<Car> globalCars = new HashSet<>(); //Lista global de carros
        final Set<Bicicleta> globalBicicletas = new HashSet<>(); //Lista global de bicicletas

        System.out.println("Bienvenido al sistema de gestión de personas, carros y bicicletas");

        do {
            option = MainExercise.getOptionMainMenu();
        } while (option > 4 || option < 1);

        while (MainExercise.isGlobalMenuValid(option)) {

            switch (option) {
                case 1:
                    int peopleMenu;

                    do {
                        peopleMenu = MainExercise.getSystemInternalMenu();
                    } while (peopleMenu > 6 || peopleMenu < 1);

                    while (MainExercise.isMenuValid(peopleMenu)) {
                        switch (peopleMenu) {
                            case 1:
                                char carMenuOption;
                                char bicicletaMenuOption;
                                final People people = new People(); // Crear una persona
                                final Set<Car> carsPerson = new HashSet<>();
                                final Set<Bicicleta> bicicletasPerson = new HashSet<>();

                                System.out.println("Por favor, ingrese los datos de la persona:");
                                //Pasar los datos de la persona
                                System.out.println("DNI:");
                                people.setDni(SCANNER.next());
                                System.out.println("Nombre:");
                                people.setName(SCANNER.next());
                                System.out.println("Apellido:");
                                people.setLastName(SCANNER.next());

                                do {
                                    carMenuOption = MainExercise.getVehicleOption("¿Desea agregar un carro?");
                                } while (carMenuOption != 'S' && carMenuOption != 's');

                                while (carMenuOption == 'S' || carMenuOption == 's') {
                                    Car car = new Car();

                                    System.out.println("Por favor, ingrese los datos del carro:");
                                    System.out.println("Placa:");
                                    car.setUniqueCode(SCANNER.next());
                                    System.out.println("Marca:");
                                    car.setMarca(SCANNER.next());
                                    System.out.println("Modelo:");
                                    car.setModelo(SCANNER.next());
                                    System.out.println("Color:");
                                    car.setColor(SCANNER.next());

                                    carsPerson.add(car);
                                    System.out.println("El carro ha sido agregado");

                                    carMenuOption = MainExercise.getVehicleOption("¿Desea agregar un carro?");
                                }

                                do {
                                    bicicletaMenuOption = MainExercise.getVehicleOption(
                                            "¿Desea agregar una bicicleta?");
                                } while (bicicletaMenuOption != 'S' && bicicletaMenuOption != 's');

                                while (bicicletaMenuOption == 'S' || bicicletaMenuOption == 's') {
                                    Bicicleta bicicleta = new Bicicleta();

                                    System.out.println("Por favor, ingrese los datos de la bicicleta:");
                                    System.out.println("Código:");
                                    bicicleta.setUniqueCode(SCANNER.next());
                                    System.out.println("Marca:");
                                    bicicleta.setMarca(SCANNER.next());
                                    System.out.println("Modelo:");
                                    bicicleta.setModelo(SCANNER.next());
                                    System.out.println("Color:");
                                    bicicleta.setColor(SCANNER.next());

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
                            case 2:
                                String searchDni = MainExercise.getDni();

                                for (People people1 : globalPeoples) {
                                    if (people1.getDni().equals(searchDni)) {
                                        System.out.println("Persona encontrada:");

                                        System.out.println("Nombre:");
                                        people1.setName(SCANNER.next());
                                        System.out.println("Apellido:");
                                        people1.setLastName(SCANNER.next());

                                        System.out.println("Persona editada con éxito");
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("Eliminar persona");
                                break;
                            case 4:
                                String dni = MainExercise.getDni();
                                globalPeoples.forEach(people1 -> {
                                    if (people1.getDni().equals(dni)) {
                                        System.out.println("Persona encontrada");
                                        System.out.println("Nombre: " + people1.getName());
                                        System.out.println("Apellido: " + people1.getLastName());
                                        System.out.println("Cantidad de carros: " + people1.getCars().size());
                                        System.out.println("Cantidad de bicicletas: " + people1.getBicicletas().size());
                                    }
                                });
                                break;
                            case 5:
                                System.out.println("Lista de personas");
                                System.out.println(globalPeoples);
                                break;
                            default:
                                System.out.println("Opción inválida");
                                break;
                        }

                        peopleMenu = MainExercise.getSystemInternalMenu();
                    }

                    break;
                case 2:
                    int carroMenu;
                    carroMenu = MainExercise.getSystemInternalMenu();
                    break;
                case 3:
                    int bicicletaMenu;
                    bicicletaMenu = MainExercise.getSystemInternalMenu();
                    break;
                default:
                    System.out.println("Gracias por usar el sistema");
                    break;
            }

            option = MainExercise.getOptionMainMenu();
        }
    }

    private static boolean isMenuValid(int menu) {
        return menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu == 5;
    }

    private static boolean isGlobalMenuValid(int menu) {
        return menu == 1 || menu == 2 || menu == 3;
    }

    private static int getOptionMainMenu() {
        int option;
        System.out.println("Por favor, seleccione una opción:");
        System.out.println("1. Personas\n2. Carros\n3. Bicicletas\n4. Salir");
        option = Integer.parseInt(MainExercise.SCANNER.next());
        return option;
    }

    private static int getSystemInternalMenu() {
        int option;
        System.out.println("Por favor, seleccione una opción:");
        System.out.println("1. Agregar\n2. Editar\n3. Eliminar\n4. Buscar\n5. Listar\n6. Salir");
        option = Integer.parseInt(MainExercise.SCANNER.next());
        return option;
    }

    private static char getVehicleOption(String question) {
        char carMenuOption;
        System.out.println(question);
        System.out.println("S. Si\nN. No");
        carMenuOption = MainExercise.SCANNER.next().charAt(0);
        return carMenuOption;
    }

    private static String getDni() {
        System.out.println("Por favor, ingrese el DNI:");
        return MainExercise.SCANNER.next();
    }
}
