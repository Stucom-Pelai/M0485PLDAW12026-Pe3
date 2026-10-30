/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen27.pkg10.pkg2026;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Examen27102026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);

        int[][] gimnasio = new int[3][12];

        for (int i = 0; i < gimnasio.length; i++) {
            for (int j = 0; j < gimnasio[i].length; j++) {

            }

        }

        int option;
        do {
            System.out.println("------MENU------");
            System.out.println("1.Reservar");
            System.out.println("2.Cancelar Reserva");
            System.out.println("3.Mostrar todas las plazas por tipo de clase");
            System.out.println("4.Porcentaje Reservado");
            System.out.println("5.Salir del menu");

            option = scanner.nextInt();

            switch (option) {

                case 1: 

                    System.out.println(" Selecciona tipo de clase (1-3)");
                    System.out.println("1.Yoga");
                    System.out.println("2.Spinning");
                    System.out.println("3.Boxeo");
                    option = scanner.nextInt();
                    
                    
                    
                    
                    
                    
                    int[] numbers = new int[1];
                   
        for (int i = 0; i < 1; i++) {
            System.out.println(" Selecciona tipo de clase (1-3)");
            
        }

        
        System.out.println("Reserva confirmada clase " + numbers);
        
        for (int i = 0; i < 1; i++) {
            System.out.println(numbers[i]);
                    break;
                    
                    
                    
                    
                    
                    
                    
                    
                    
                        
        }  
                    
                case 2:
                    break;
                case 3: 

                    break;

                case 4: 
                    for (int i = 0; i < gimnasio.length; i++) {
                        System.out.println("Reservas" + (i + 1));
                        for (int j = 0; j < gimnasio[i].length; j++) {
                            System.out.println(gimnasio[i][j]);
                            if (j < gimnasio[i].length - 1) {
                                System.out.println();
                            }
                        }
                    }

                    break;
                case 5: 

                    break;

            }

        } while (option != 5); 
    }

}



