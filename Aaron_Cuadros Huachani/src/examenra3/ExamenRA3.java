/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenra3;

import java.util.Scanner;

/**
 *
 * @author aarkr
 */
public class ExamenRA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int [][] asiento = new int [4][8];
        
         for (int i = 0; i < asiento.length; i++) {
            for (int j = 0; j < 8; j++) {
                int opcion = 0;
                
              
                
                
                
                do {                    
                    System.out.println("1- Reservar: "); 
                    System.out.println("2- Cancelar: "); 
                    System.out.println("3- Estado de los asientos: "); 
                    System.out.println("4- Ocupacion total del avion: "); 
                    System.out.println("5- Salir: "); 
                    
                    opcion = scanner.nextInt(); 
                    
                    switch (opcion) {
                        case 1:
                         System.out.println("Seleccione fila: ");
                         
                         break;
                                    
                                
                                
                            
                            
                        case 2:
                           break;
                           
                           
                        case 3:
                            break;
                            
                            
                        case 4:
                           break; 
                        
                        

                    }
                    
    
                } while (opcion != 5);
                System.out.println("Programa terminado");
                
            }
        }
    }
}
    
            
        
        
        
        
        
        