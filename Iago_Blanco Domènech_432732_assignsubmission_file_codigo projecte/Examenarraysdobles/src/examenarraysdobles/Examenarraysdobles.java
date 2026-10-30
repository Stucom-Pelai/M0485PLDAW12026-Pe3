/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenarraysdobles;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Examenarraysdobles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean[][] gimnasio = new boolean[3][12];
        for (int i = 0; i < gimnasio.length; i++) {
            for (int j = 0; j < gimnasio[i].length; j++) {
                gimnasio[i][j] = false;

            }

        }
        do {
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("1. Reservar una plaza");
            System.out.println("2. Cancelar una reserva");
            System.out.println("3. Mostrar todas las plazas por classe");
            System.out.println("4. Porcentaje reservado");
            System.out.println("5. Exit");
            System.out.println("--------------------------------");
            System.out.print("Please enter an option: ");
            option = scanner.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Elije un tipo de classe para reservar");
                    int reservaclase = scanner.nextInt();
                    System.out.println("Elije una plaza");
                    int reservaplaza = scanner.nextInt();
                    if (!gimnasio [reservaclase -1][reservaplaza -1] ) {
                        System.out.println("no hay plaza para esa classe");
                    }
                    else {
                        gimnasio [reservaclase -1][reservaplaza -1] = true;
                        System.out.println("Reserva confirmada clase " + reservaclase + " plaza " + reservaplaza);
                    }
                    break;




                case 2:
                    boolean clase = true;
                    System.out.println("Que clase quiere cancelar");
                    int cancelarclase = scanner.nextInt();
                    System.out.println("Que numero de plaza tienes");
                    int cancelarplaza = scanner.nextInt();

                    if (gimnasio[cancelarclase - 1][cancelarplaza - 1]) {
                        gimnasio[cancelarclase - 1][cancelarplaza - 1] = false;
                        System.out.println("reserva clase" + cancelarclase + cancelarplaza + " anulada");

                    } else {
                        System.out.println("Reserva no encontrada");

                    }
                    break;

                case 3:
                    for (int i = 0; i < gimnasio.length; i++) {
                        System.out.print("clase" + "");
                        System.out.println("");
                        for (int j = 0; j < gimnasio[i].length; j++) {
                            System.out.print(gimnasio[ i ][ j ]);
                        }
                    }
                    break;
            }

        } while (option != 5);
        System.out.println("Program terminated.");
    }

}
