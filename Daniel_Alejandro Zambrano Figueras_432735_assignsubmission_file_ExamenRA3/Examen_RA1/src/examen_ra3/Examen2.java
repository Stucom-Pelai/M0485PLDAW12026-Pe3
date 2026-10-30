/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_ra3;

import java.util.Scanner;

/**
 *
 * @author DAZ
 */
public class Examen2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        boolean posiciones[][] = new boolean[3][12];
        
        for (int i = 0; i < posiciones.length; i++) {
            for (int j = 0; j < posiciones[i].length; j++) {
                posiciones[i][j] = false;
                
            }
        }
        int opcion = 0;
        do { 
            System.out.println("---------------------------------");
            System.out.println("1. Reservar una plaza.");
            System.out.println("2. Cancelar una reserva.");
            System.out.println("3. Mostrar todas las plazas por tipo de clase.");
            System.out.println("4. Porcentaje reservado por clase.");
            System.out.println("5. Salir del menu.");
            System.out.println("---------------------------------");
            System.out.println("Por favor introduce un numero: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Escribe el numero de clase (1-3): ");
                    int clase_caso1 = scanner.nextInt();
                    int plaza = 0;
                                        
                    for (int i = 0; i < posiciones.length; i++) {
                        for (int j = 0; j < posiciones[i].length; j++) {
                            if (posiciones[clase_caso1 - 1][plaza] == false) {
                                posiciones[clase_caso1 - 1][plaza] = true;
                                System.out.println("Reserva confirmada clase " + clase_caso1 + ", plaza " + (plaza + 1));
                               
                            } else {
                                System.out.println("No hay plazas disponibles para esta clase");

                            }
                        } 
                    }
                    break;
                    
                case 2:
                    System.out.println("Escribe el numero de clase (1-3): ");
                    int numero_caso2 = scanner.nextInt();
                    System.out.println("Escrive el numero de plaza (1-12): ");
                    int plaza_caso2 = scanner.nextInt();
                    
                    if (posiciones[numero_caso2 -1][plaza_caso2 -1] == true) {
                        posiciones[numero_caso2 - 1][plaza_caso2 - 1] = false;
                        System.out.println("Reserva clase " + numero_caso2 + " plaza " + plaza_caso2 + " anulada.");
                    } else {
                        System.out.println("Reserva no encontrada");
                    }
                    break;
                    
                    
                case 3:
                    for (int i = 0; i < posiciones.length; i++) {
                        System.out.print("Clase " + (i + 1) + ": ");
                        for (int j = 0; j < posiciones[i].length; j++) {
                            System.out.print(posiciones[i][j] + ",");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    break;
                    
                case 4:
                    
                    break;
                    
                case 5:
                    System.out.println("Saliendo del menu");
                    break;
                    
            }
        } while (opcion != 5);
    }
}
