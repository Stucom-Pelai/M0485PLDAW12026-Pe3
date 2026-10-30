/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenra3;

import java.util.Scanner;

/**
 *
 * @author roger
 */
public class ExamenRA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean stop = true;
        boolean matriz[][] = new boolean[3][12];
        for (int a = 0; a < matriz.length; a++) {
            for (int b = 0; b < matriz[a].length; b++) {
                matriz[a][b] = false;

            }
        }
        while (stop) {
            System.out.println("1.Reservar una plaza");
            System.out.println("2.Cancelar una reserva");
            System.out.println("3.Mostrar todas las plazas por tipo de clase");
            System.out.println("4.Procentaje reservado por clase");
            System.out.println("5.Salir del menu");
            int menu_choice = scanner.nextInt();
            if (menu_choice < 5 && menu_choice > 0) {

                switch (menu_choice) {

                    case 1:
                        System.out.println("Tipo de clase(1-3)");
                        int clase = scanner.nextInt();
                        if (clase > 0 && clase <= 3) {
                            clase--;
                            for (int c = 0; c < matriz[clase].length; c++) {
                                if (matriz[clase][c] == false) {
                                    matriz[clase][c] = true;
                                    System.out.println("Reserva confirmada clase " + (clase+1) + ", plaza " + c);
                                    break;
                                }
                            }
                        } else {
                            System.out.println("Number not allowed");
                        }
                        break;
                    case 2:
                        System.out.println("Tipo de clase(1-3)");
                        clase = scanner.nextInt();
                        if (clase > 0 && clase <= 3) {
                            for (int d = 0; d < matriz[clase].length; d++) {
                                d--;
                                if (matriz[clase][d] == true) {
                                    matriz[clase][d] = false;
                                    System.out.println("Reserva clase " + (clase+1) + " plaza " + d + " anulada");
                                    break;
                                } else {
                                    System.out.println("Reserva no encontrada");
                                    break;
                                }

                            }
                        } else {
                            System.out.println("Number not allowed");
                        }

                        break;
                    case 3:

                        for (int a = 0; a < matriz.length; a++) {
                            System.out.print("Clase " + a + ":");
                            switch (a) {
                                case 0:
                                    System.out.print(" Yoga");
                                    break;
                                case 1:
                                    System.out.print(" Spinning");
                                    break;
                                case 2:
                                    System.out.print(" Boxeo");
                                    break;
                            }
                            for (int b = 0; b < matriz[a].length; b++) {
                                if (matriz[a][b]) {
                                    System.out.print("Reservada,");
                                } else {
                                    System.out.print("Libre,");
                                }

                            }
                            System.out.println("\n");
                        }

                        break;
                    case 4:
                        int reserved = 0;
                        int free = 0;
                        System.out.println("Clase para calcular media (1-3):");

                        int clas_av = scanner.nextInt();
                        if (clas_av > 0 && clas_av <= 3) {
                            clas_av--;
                            for (int b = 0; b < matriz[clas_av].length; b++) {
                                if (matriz[clas_av][b] == false) {
                                    free++;
                                } else {
                                    reserved++;
                                }

                            }

                            System.out.println("Average of class " + (clas_av+1) + ": " + reserved * 12 / 100);
                        } else {
                            System.out.println("Number not allowed");
                        }
                        break;
                    case 5:
                        stop = false;
                        break;

                }
            } else {
                System.out.println("Number not allowed");
            }
        }
    }

    // TODO code application logic here
}
