/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenra3;

import java.util.Scanner;

/**
 *
 * @author nooba
 */
public class ExamenRA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        
      boolean gym [][] = new boolean [3][12];
      
        for (int i = 0; i < gym.length; i++) { //Fila
            for (int j = 0; j < gym[i].length; j++) { //Columna
                
                
                gym[i][j] = false;
            }
        }
             
        boolean exit = false;
        int option = 0;
        
        
        
          do {            
            
              System.out.println("");  
              System.out.println(" -- Menu Gestion de plazas --");  
              System.out.println("1. Reservar plaza");  
              System.out.println("2. Cancelar plaza");  
              System.out.println("3. Mostrar plazas");  
              System.out.println("4. Porcentaje");  
              System.out.println("5. Salir");  
              
              System.out.println("");
              System.out.print("Elige una opcion: ");
              option = scanner.nextInt();
              
              
              switch (option) {
                  
                  case 1:
                      System.out.println("Reservas: ");
                      System.out.println("Tipo de clase(1-3):");
                      int clase = scanner.nextInt();
                      
                         
                            
                      boolean reservado = false;
                      for (int i = 0; i < gym[clase-1].length; i++) { // fila
                           if (gym[clase-1][i] = reservado) {
                               
                                  System.out.println("Reserva confirmada clase " + clase+ ", "+ "plaza" + i);
                                  reservado = true;
                               
                                  
                              }
                                  
                          }
                                 if (!reservado) {
                                   System.out.println("No hay plazas disponibles para esta clase");
                                 }               
                              
                                
                                 
                      break;
                              
                                                       
                              
                              
                              
 
                  case 2:
                      break;
                          
                      
                  
                  
                  
                  
                  
                  case 3:
                      System.out.println("Reservas: ");
                         reservado = false;
                      for (int i = 0; i < gym.length; i++) {
                          System.out.print("Clase " + (i + 1) + ": ");
                          for (int j = 0; j < gym[i].length; j++) {
                              if (gym[i][j] = false) {
                                  System.out.print("reservada, ");
                                  reservado = true;
                              } else {
                                  System.out.print("Libre, ");
                              }
                            
                          }
                          System.out.println("");
                      }
                      System.out.println("");
                      break;
                  
                  
                  
                  
                  
                  
                  
                  case 5:
                      exit = true;
                      break;
                  
                     
              
              
              default:
              System.out.println("Opcion invalida");
              }
              
              
        } while (!exit);
          System.out.println("Programa terminado");
  
        
        
        
        
        
        
        
    }
    
}
