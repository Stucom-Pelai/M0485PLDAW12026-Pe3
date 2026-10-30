/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author iker
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int plaza2 = 0;
        boolean[][] reservas = new boolean[3][12];

        for (int i = 0; i < reservas.length; i++) {
            for (int j = 0; j < reservas[i].length; j++) {
                reservas[i][j] = false;

            }
        }
        boolean exit = false;
        do {

            System.out.println("Bienvenido al Gimnasio");
            System.out.println("Reserva una plaza (1)");
            System.out.println("Cancelar una reserva (2)");
            System.out.println("Mostrar todas las plazas (3)");
            System.out.println("Porcentaje reservador por clase (4)");
            System.out.println("Salir del menu (5)");
            System.out.println("Elige una opcion entre (1-5)");
            int respuesta = scanner.nextInt();

            switch (respuesta) {

                case 1:
                    System.out.println("Introduzca el tipo de clase (1-3):");
                    int respuesta2 = scanner.nextInt();

                    for (int i = 0; i < reservas[respuesta2-1].length; i++) {

                        if (reservas[respuesta2 - 1][i] == false) {
                            reservas[respuesta2 - 1][i] = true;
                            plaza2++;
                            System.out.println("Reserva confirmada clase " + respuesta2 + ", plaza " + plaza2);
                            break;
                        }

                    }
                     

                    break;
                case 2:

                    System.out.println("Introduce la clase (1-3) y numero de plaza (1-12) para cancelar");
                    int clase = scanner.nextInt();
                    int plaza = scanner.nextInt();

                    if (reservas[clase - 1][plaza - 1] == true) {
                        reservas[clase - 1][plaza - 1] = false;
                        System.out.println("Reserva clase " + clase + " plaza " + plaza + " anulada");
                    } else {
                        System.out.println("Reserva no encontrada");
                    }

                    break;

                case 3:

                    for (int i = 0; i < reservas.length; i++) {

                        System.out.print("Clase " + (i + 1) + ":");
                        if (i == 0) {
                            System.out.print("Yoga,");
                        }
                        if (i == 1) {
                            System.out.print("Spinning,");
                        }
                        if (i == 2) {
                            System.out.print("Boxeo,");
                        }
                        for (int j = 0; j < reservas[i].length; j++) {
                            if (reservas[i][j] == false) {
                                System.out.print("Libre,");
                            } else {
                                System.out.print("Reservada,");
                            }

                        }
                        System.out.println();
                    }

                    break;

                case 5:
                    System.out.println("Hasta la proxima :)");
                    exit = true;
                    break;
                default:
                    System.out.println("Opcion no valida introduce una opcion entre (1-5)");
            }

        } while (!exit);

    }

}
