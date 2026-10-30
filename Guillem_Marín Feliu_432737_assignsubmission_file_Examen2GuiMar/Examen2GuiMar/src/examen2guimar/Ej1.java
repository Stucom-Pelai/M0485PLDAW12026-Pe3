package examen2guimar;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {

        boolean[][] clases = new boolean[3][12];
        Scanner scanner = new Scanner(System.in);
        int respuesta;

        for (int i = 0; i < clases.length; i++) {
            for (int j = 0; j < clases[i].length; j++) {
                clases[i][j] = false;
            }

        }

        do {

            System.out.println("----------------------------");
            System.out.println("Reserva una plaza: 1");
            System.out.println("Cancelar reserva: 2");
            System.out.println("Mostrar plazas por tipo de clase: 3");
            System.out.println("porcentaje reservado por clase: 4");
            System.out.println("Salir del menu: 5");
            System.out.println("----------------------------");
            respuesta = scanner.nextInt();

            switch (respuesta) {

                case 1:
                    System.out.println("Donde quiere reservar? (1-3)");
                    int clase = scanner.nextInt();

                    boolean lleno = false;
                    for (int j = 0; j < clases[clase - 1].length && !lleno; j++) {
                        if (!clases[clase - 1][j]) {
                            clases[clase - 1][j] = true;
                            System.out.println("Has reservado en la clase " + clase + ", " + (j + 1));
                            lleno = true;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Que clase quiere cancelar (1-3)");
                    int clase1 = scanner.nextInt();
                    System.out.println("Que plaza quiere cancelar (1-12)");
                    int plaza = scanner.nextInt();

                    if (clases[clase1 - 1][plaza - 1]) {
                        clases[clase1 - 1][plaza - 1] = false;
                    } else {
                        System.out.println("La plaza ya esta libre.");

                    }
                    System.out.println("Cancelada reserva " + clase1 + ", plaza" + plaza);
                    break;

                case 3:
                    for (int i = 0; i < clases.length; i++) {
                        System.out.println("Planta " + (i + 1));
                        for (int j = 0; j < clases[i].length; j++) {
                            if (clases[i][j]) {
                                System.out.print("ocupada, ");
                            } else {
                                System.out.print("Libre, ");
                            }
                        }
                        System.out.println("");
                    }
                    System.out.println("");

                    break;

                case 4:
                    break;
            }

        } while (respuesta != 5);
    }

}
