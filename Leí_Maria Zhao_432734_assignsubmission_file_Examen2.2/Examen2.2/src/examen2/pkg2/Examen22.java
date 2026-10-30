/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2.pkg2;

import java.util.Scanner;

/**
 *
 * @author lzhao
 */
public class Examen22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean [][] numbers  = new boolean [3][12];
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = false;
                
            }
            
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
    }
    
}
        do {
            
            System.out.println("1 - Reservar una plaza.");
            System.out.println("2 - Cancelar una reserva.");
            System.out.println("3 - Mostrar todas las plazas por tipo de clase.");
            System.out.println("4 - Porcentaje reservado por clase");
            System.out.println("5 - Salir del menú.");
            System.out.println("Seleccionar una option");
            int option = scanner.nextInt();
            int num1 = 0;
            int num2 = 0;
            
            
            switch (option) {
                
                case 1:
                    System.out.println("Dame la clase(1-3)");
                    num1 = scanner.nextInt();
                    System.out.println("Dame la plaza(1-12)");
                    num2 = scanner.nextInt();
                    for (int i = 0; i < numbers[num1-1].length; i++) {
                        for (int j = 0; j < numbers[num2-1].length; j++) {
                           if(numbers[num1-1][num2-1]){
                               numbers[num1-1][num2-1] = false;
                               System.out.println("Reserva confirmada clase " + num1 + ", " + "plaza " + num2);            
                        }else{
                               System.out.println("No hay plazas disponibles para esta clase.");
                        }
                    }
                    }
                    break;
                
                case 2:
                    System.out.println("Dame la clase(1-3)");
                    num1 = scanner.nextInt();
                    System.out.println("Dame la plaza(1-12)");
                    num2 = scanner.nextInt();
                    for (int i = 0; i < numbers[num1-1].length; i++) {
                        for (int j = 0; j < numbers[num2-1].length; j++) {
                            if(!numbers[num1-1][num2-1]){
                                numbers[num1-1][num2-1] = false;
                                System.out.println("Reserva clase " + num1 + " plaza" + num2 + "anulada");
                            }else{
                                System.out.println("Reserva no encontrada");
                            }
                            
                        }
                        
                    }
                    break;
                
                case 3:
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.print("Clase " + ( i + 1));
                        for (int j = 0; j < numbers[i].length; j++) {
                            System.out.print(numbers[i][j] + ",");
                            
                        }System.out.println("");
                    }
                
                case 4:
                    int reserva = 0;
                    
                    
                    
                
                case 5:
                    exit = true;
                    break;
            }
            
            
        } while (!exit);
    }
}
