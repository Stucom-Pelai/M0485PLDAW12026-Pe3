/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenra3;

import java.util.Scanner;

/**
 *
 * @author WIN10
 */
public class ExamenRA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean matriz[][] = new boolean[3][12];

        int input;
        int tipoClase;
        boolean exit = false;
        boolean ocupado = true;
        boolean reservada = false;

        String valor = "";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = false;
            }

        }

        do {
            System.out.println("op1-ReservarPlaza");
            System.out.println("op2-CancelarReserva");
            System.out.println("op3-MostrarTodasLasPlazasPorTipoDeClase");
            System.out.println("op4-PorcentajePorClase");
            System.out.println("op5-Exit");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Tipo de clase: 1-Yoga 2-Spinning 3-Boxeo");
                    tipoClase = sc.nextInt();
                    if (tipoClase >= 1 || tipoClase <= 3) {
                        switch (tipoClase) {
                            case 1 ->
                                valor = "Yoga";
                            case 2 ->
                                valor = "Spinning";
                            case 3 ->
                                valor = "Boxeo";
                            default -> {
                                System.out.println("no es valido");
                            }
                        }
                        for (int i = 0; i < matriz.length; i++) {
                            if (matriz[tipoClase - 1].equals(false)) {
                                ocupado = false;   //no ocupado
                            }
                        }
                        if (ocupado == false) {
                            reservada = matriz[tipoClase - 1];
                            System.out.println("Guardado");
                        } else {
                            System.out.println("No hay plazas disponibles para esta clase");

                        }

                    }
                    System.out.println("Reserva confirmada clase" + valor + reservada);
                    break;
                case 2:
                    break;
                case 3:
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            System.out.print(" ");
                            System.out.print(matriz[tipoClase - 1].length);
                            System.out.print(matriz[tipoClase - 1][j]);
                        }

                    }
                    break;

                case 4:
                    break;
                case 5:
                    System.out.println("Cerrando Programa...");
                    exit = true;
                    break;
            }

        } while (!exit);

    }

}
