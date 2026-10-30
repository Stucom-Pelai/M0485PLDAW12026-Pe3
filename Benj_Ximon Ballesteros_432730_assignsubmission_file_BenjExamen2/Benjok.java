/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Examen2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] reserva = new boolean[3][12];

        for (int i = 0; i < reserva.length; i++) {
            for (int j = 0; j < reserva.length; j++) {
                reserva[i][j] = false;

            }
        }
        
        int opcion = 0;
        boolean exit = false;
        
        do{
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Reservar una plaza");
            System.out.println("2. Cancelar una reserva");
            System.out.println("3. Mostrar todas las plazas por tipo de clase");
            System.out.println("4. Porcentaje reservado por clase");
            System.out.println("5. Salir del menu");
            System.out.print("\nIntroduce opcion:");
            
            opcion = scanner.nextInt();
            System.out.println("Opcion " + opcion + " escogida");
            
            switch (opcion) {
                case1:
                    reserva = scanner.nextInt();
                    if (cantidad == false) {
                        System.out.println("Numero maximo");
                        break;
                    }
               
                case2:
                    
                case3:
                    for (int i = 0; i < reserva.length; i++) {
                    System.out.print("muestra" + (i + 1));
                    for (int i = 0; i < reserva.length; i++) {
                    if ()
                     }
                 }
                    
 
                case4:
                    
                case5:
                    exit = true;
                break;
                    
                default:
                    System.out.println("Invalid option.");
                    
            }
            
            
        }while (!exit);

    }
}
