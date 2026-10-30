package main.java.prog2;

import java.util.Scanner;

public class ExamenProg2_Act1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[][] reservas = new boolean[3][12];

        for (int i = 0; i < reservas.length; i++) {
            for (int j = 0; j < reservas.length; j++) {
                reservas[i][j] = false;
            }
        }
        int opcion = 0;
        boolean exit = false;
        do {
            System.out.println("\n\nOpcion 1 - Reservar una plaza");
            System.out.println("Opcion 2 - Cancelar reserva");
            System.out.println("Opcion 3 - Mostrar clases disponibles");
            System.out.println("Opcion 4 - Porcentaje de reservado");
            System.out.println("Opcion 5 - Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Que clase quiere escoger?");
                    int sala = scanner.nextInt();
                    for (int i = 0; i < reservas.length; i++) {
                        for (int j = 0; j < reservas[i].length; j++) {
                            if (!reservas[sala - 1][j]) {
                                reservas[sala - 1][j] = true;
                                System.out.println("Reserva confirmada clase " + (i + 1) + ", plaza " + (j + 1));
                                break;
                            }
                        }
                        break;
                    }
                    break;
                case 2:
                    System.out.println("En que clase tenia la reserva?");
                    int clss = scanner.nextInt();
                    System.out.println("Y plaza?");
                    int plz = scanner.nextInt();

                    for (int i = 0; i < reservas.length; i++) {
                        for (int j = 0; j < reservas.length; j++) {
                            if (reservas[clss - 1][plz - 1]) {
                                reservas[clss - 1][plz - 1] = false;
                                System.out.println("Reserva clase " + (i+1) + " plaza " + (j+1) + " anulada");
                            } else {
                                System.out.println("Reserva no encontrada");
                            }
                            break;
                        }
                        break;
                    }
                    break;
                case 3:
                    for (int i = 0; i < reservas.length; i++) {
                        System.out.print("\nClase " + (i + 1) + ": ");
                        for (int j = 0; j < reservas[i].length; j++) {
                            if (reservas[i][j]) {
                                System.out.print("reservada, ");
                            } else {
                                System.out.print("libre, ");
                            }

                        }
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Not a valid input");
            }
        } while (!exit);
    }

}
