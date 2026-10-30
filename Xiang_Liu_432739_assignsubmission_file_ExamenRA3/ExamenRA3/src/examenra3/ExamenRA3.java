/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenra3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author xiang
 */
public class ExamenRA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean[][] matriz = new boolean[3][12];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = false;

            }

        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("");
        }
        Scanner scanner = new Scanner(System.in);
        boolean run = false;
        int opcion = 0;
        do {
            int clase = 0;
            int plaza = 0;
            System.out.println("");
            System.out.println("-------------------------------------------");
            System.out.println("Bienvenido al sistema de reserva de clases");
            System.out.println("-------------------------------------------");
            System.out.println("1. Hacer una reserva");
            System.out.println("2. Cancelar una reserva");
            System.out.println("3. Mostrar todas las plazas");
            System.out.println("4. Porcentaje de reserva");
            System.out.println("5. Salir de la sistema");
            System.out.println("Selecciona una opcion:");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Selecciona el tipo clase 1-3");
                    clase = scanner.nextInt();
                    while (clase < 1 || clase > 3) {
                        System.out.println("Error! Selecciona el tipo clase valida 1-3");
                        clase = scanner.nextInt();
                    }
                    for (int i = 0; i < matriz[clase - 1].length; i++) {
                        if (!matriz[clase - 1][i]) {
                            matriz[clase - 1][i] = true;
                            System.out.println("Reserva confirmada clase " + clase + ", plaza " + (i + 1));
                            break;
                        }
                        if (matriz[clase - 1][11]) {
                            System.out.println("No hay plazas disponibles para esta clase");
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Selecciona el tipo clase 1-3");
                    clase = scanner.nextInt();
                    while (clase < 1 || clase > 3) {
                        System.out.println("Error! Selecciona el tipo clase valida 1-3");
                        clase = scanner.nextInt();
                    }
                    System.out.println("Seleccione en namero de la plaza 1-12");
                    plaza = scanner.nextInt();
                    while (plaza < 1 || plaza > 12) {
                        System.out.println("Error! Seleccione el numero de la plaza valida 1-12");
                        plaza = scanner.nextInt();
                    }
                    if (matriz[clase - 1][plaza - 1]) {
                        matriz[clase - 1][plaza - 1] = false;
                        System.out.println("Reserva clase " + clase + " plaza " + plaza + " anulada");
                    } else {
                        System.out.println("Reserva no encontrada");
                    }
                    break;
                case 3:
                    for (int i = 0; i < matriz.length; i++) {
                        if (i == 0) {
                            System.out.print("Clase " + (i + 1) + ": Yoga, ");
                        } else if (i == 1) {
                            System.out.print("Clase " + (i + 1) + ": Spinning, ");
                        } else if (i == 2) {
                            System.out.print("Clase " + (i + 1) + ": Boxeo, ");
                        }
                        for (int j = 0; j < matriz[i].length; j++) {
                            if (matriz[i][j]) {
                                if (j == matriz[i].length - 1) {
                                    System.out.print("reservada");
                                } else {
                                    System.out.print("reservada, ");
                                }
                            } else {
                                if (j == matriz[i].length - 1) {
                                    System.out.print("libre");
                                } else {
                                    System.out.print("libre, ");
                                }
                            }
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    double porcentaje = 0;
                    double reservas = 0;
                    System.out.println("Introduce la clase 1-3");
                    clase = scanner.nextInt();
                    while (clase < 1 || clase > 3) {
                        System.out.println("Error! Selecciona el tipo clase valida 1-3");
                        clase = scanner.nextInt();
                    }
                    for (int j = 0; j < matriz[clase - 1].length; j++) {
                        if (matriz[clase - 1][j]) {
                            reservas++;
                        }
                    }
                    porcentaje = (reservas / 12) * 100;
                    System.out.println("Porcentaje de la clase " + clase);
                    System.out.println((int)reservas + " plazas reservadas sobre 12 plazas.");
                    System.out.printf(Locale.US, "El porcentaje de reserva: %.2f%%\n", porcentaje);
                    break;
                case 5:
                    run = true;
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Error! Introduzca una opcion valida.");
                    break;
            }
        } while (!run);
    }

}
