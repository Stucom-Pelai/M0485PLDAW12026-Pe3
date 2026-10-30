/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

import java.util.Scanner;

/**
 *
 * @author 7nmoy
 */
public class Examen_NúriaMoya {

    public static void main(String[] args) {

        boolean[][] matriz = new boolean[3][12];
        int i;
        int j;
        int option;
        int clase;
        int place;
        double bookedPlaces = 0;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 12; j++) {
                matriz[i][j] = false;
            }
        }

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("1. Book place");
            System.out.println("2. Cancel place");
            System.out.println("3. Show place ");
            System.out.println("4. Percentage booked per class");
            System.out.println("5. Exit");
            System.out.println("--------------------------------");
            System.out.print("Please enter an option: ");
            option = scanner.nextInt();

            switch (option) {

                case 1:

                    System.out.println("1-Yoga, 2-Spinning, 3-Boxing");
                    System.out.print("What class? (1-3): ");
                    clase = scanner.nextInt();

                    if ((clase > 3) || (clase < 1)) {
                        do {
                            System.out.print("Invalid class. Re-enter (1-3): ");
                            clase = scanner.nextInt();
                        } while ((clase > 3) || (clase < 1));
                    }

                    i = clase - 1;

                    boolean fullyBooked = false;

                    for (j = 0; j < 12; j++) {
                        if (!matriz[i][j]) {
                            matriz[i][j] = true;
                            fullyBooked = true;

                            System.out.println("Booking confirmed. Class " + (i + 1) + " place " + (j + 1));
                            break;
                        }
                    }

                    if (!fullyBooked) {
                        System.out.println("There aren`t any places left!");
                    }

                    break;

                case 2:

                    System.out.println("Cancel booking");
                    System.out.println("Give class (1-3): ");
                    clase = scanner.nextInt();

                    if ((clase > 3) || (clase < 1)) {
                        do {
                            System.out.print("Invalid class. Re-enter (1-3): ");
                            clase = scanner.nextInt();
                        } while ((clase > 3) || (clase < 1));
                    }
                    
                    System.out.println("Give place (1-12): ");
                    place = scanner.nextInt();
    
                    if ((place > 12) || (place < 1)) {
                        do {
                            System.out.print("Invalid place. Re-enter (1-12): ");
                            place = scanner.nextInt();
                        } while ((place > 12) || (place < 1));
                    }

                    i = clase -1;
                    j = place -1;
                    
                    if (matriz[i][j]) {
                        matriz[i][j] = false;
                        System.out.print("Booking in class " + (i+1) + " in place " + (j+1) + " canceled.");
                    } else {
                        System.out.println("Booking not found.");
                    } 
                    
                    break;
                    
                case 3:

                    for (i = 0; i < 3; i++) {
                        if (i == 0) {
                        System.out.print("Clase 1: Yoga, ");
                        }
                        
                        if (i == 1) {
                            System.out.print("Clase 2: Spinning, ");
                        }
                        
                        if (i == 2) {
                            System.out.print("Clase 3: Boxing, ");
                        }
                        
                        for (j = 0; j < 12; j++) {
                            if (!matriz[i][j]) {
                                System.out.print("free, ");
                            } else {
                                System.out.print("occupied, ");
                            }
                        }
                    System.out.println(" ");
                    }

                    break;

                case 4:
  
                    System.out.print("Give Class (1-3): ");
                    clase = scanner.nextInt();

                    if ((clase > 3) || (clase < 1)) {
                        do {
                            System.out.print("Invalid class. Re-enter (1-3): ");
                            clase = scanner.nextInt();
                        } while ((clase > 3) || (clase < 1));
                    }
                    
                    i = clase -1;
                    
                    for (j = 0; j < 12; j++) {
                        if (matriz[i][j]) {
                            bookedPlaces++;
                            
                        }
                    }
                    
                    if (bookedPlaces != 0) {
                        double result = (bookedPlaces / 12) * 100;
                        System.out.println("Class " + i + " booked total of: " + result + "%");
                    } else {
                        System.out.println("100% Available!");
                    }

                    break;

            }

        } while (option != 5);
    }
}
