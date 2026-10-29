package com.mycompany.ExamenRA3;

import java.util.Scanner;

public class ExamenRA3 {

    public static void main(String[] args) {
    }
    final int NUM_CLASES = 3;
    final int NUM_PLAZAS = 12;
    final int NUM_ALUMNOS = 36;

    int alumnos = 36;

    boolean[][] clases = new boolean[3][12];
    int count = 36;
    int option;
    

    Scanner scanner = new Scanner(System.in);


do{
            System.out.println();
            System.out.println("1. Yoga");
            System.out.println("2. Spinning");
            System.out.println("3. Boxeo");
            System.out.println("4. Exit");
            System.out.print("Please enter an option: ");
            option = scanner.nextInt();
            
             switch (option) {
                case 1:
                    // pedir clase
                    int clase = 0;
                      System.out.println("Give a number:");
                      clase = scanner.nextInt();
                    
                    
                    // asignar primera libre
                    
                    
                    if (reserved == NUM_PLAZAS(1-12)) {
                        System.out.println("Reserva confirmada clase X, plaza Y");
                        
                        } else {
                    
                        System.out.println("No hay plazas disponibles para esta clase.");
                        count = addAlumnos(alumnos, count, scanner);
                    }
                    break;

//                case 2:
//                    if (confirmed == NUM_CLASES)
//                        System.out.println("Reserva confirmada clase X plaza Y anulada");
//                      } else {
//                    
//                      if not == reserved    
//                          sortBy(alumnos, count, DORSAL);
//                    System.out.println("Reserva no encontrada");
//                    printAlumnos(alumnos, count);
//                    break;

//                case 3:
//                    sortBy(alumnos, count, BEST_MARK);
//                    System.out.println("Clase 1: Yoga, reservada, reservada, libre, libre, libre, libre");
//                    System.out.println("Clase 2: Spinning, reservada, libre, libre, libre, libre, libre");
//                    System.out.println("Clase 3: Boxeo, reservada, reservada, reservada, libre, libre");
//                    printParticipants(participants, count);
//                    break;
           
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             }
}

//         System.out.println("Programa finalizado.");
    }
