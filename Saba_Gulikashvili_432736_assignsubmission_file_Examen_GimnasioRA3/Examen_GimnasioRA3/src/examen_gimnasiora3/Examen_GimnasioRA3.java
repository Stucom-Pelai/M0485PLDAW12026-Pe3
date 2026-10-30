/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_gimnasiora3;

import java.util.Scanner;

/**
 *
 * @author sabag
 */
public class Examen_GimnasioRA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean classes[][] = new boolean[3][12];

        for (int i = 0; i < classes.length; i++) {
            for (int j = 0; j < classes[i].length; j++) {
                classes[i][j] = false;
            }

        }

        boolean exit = false;
        int option;

        do {
            System.out.println("Menu:");
            System.out.println("1. Reservar una plaza");
            System.out.println("2. Cancelar una reserva");
            System.out.println("3. Mostrar todas las plazas por tipo de clase");
            System.out.println("4. Porcentaje reservado por clase");
            System.out.println("5. Salir del menu");
            System.out.println("Elije una opcion:");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    int clase;
                    do {
                        System.out.println("Elije una clase (1-3):");
                        clase = scanner.nextInt();
                    } while (clase < 1 || clase > 3);

                    int plaza;
                    do {
                        System.out.println("Elije una plaza (1-12)");
                        plaza = scanner.nextInt();
                    } while (plaza < 1 || plaza > 12);

                    if (classes[clase][plaza] = true) {
                        System.out.println("Reserva confirmada. Clase " + clase + ", Plaza " + plaza);
                    } else {
                        System.out.println("No hay plazas disponibles para esta clase");
                    }

                    break;

                case 2:

                    do {
                        System.out.println("Elije una clase (1-3):");
                        clase = scanner.nextInt();
                    } while (clase < 1 || clase > 3);

                    do {
                        System.out.println("Elije una plaza (1-12)");
                        plaza = scanner.nextInt();
                    } while (plaza < 1 || plaza > 12);

                    if (classes[clase][plaza] == true) {
                        System.out.println("Reserva Clase " + clase + " Plaza " + plaza + " anulada.");
                    } else {
                        System.out.println("Reserva no encontrada");
                    }

                    break;

                case 3:
                    
                    
                    
                    break;
                    
                case 4:
                    
                    
                    
                    break;

                case 5:
                    exit = true;
                    break;
            }

        } while (!exit);
    }

}
