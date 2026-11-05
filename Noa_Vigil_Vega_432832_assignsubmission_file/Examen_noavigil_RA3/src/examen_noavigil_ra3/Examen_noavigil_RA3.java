/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_noavigil_ra3;

import java.util.Scanner;

public class Examen_noavigil_RA3 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        
        boolean[][] matriz = new boolean[3][12];
        //&& || \n
        
        for(int tipoclase =0; tipoclase<matriz.length; tipoclase++){
           for(int plazas =0; plazas<matriz[tipoclase].length; plazas++){
           matriz[tipoclase][plazas]=false;
            }
        }
        
        
        int option;
 
        do {
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("1. Reservar una plaza");
            System.out.println("2. Cancelar una reserva");
            System.out.println("3. Mostrar todas las plazas por tipo de clase");
            System.out.println("4. Porcentaje reservado por clase");
            System.out.println("5. Salir del menu");
            System.out.println("--------------------------------");
            System.out.print("Por favor introduzca una opcion: ");
            option = scanner.nextInt();
 
            switch (option) {
                case 1:
                  int clase;
                  int plaza;  
                  do{
                  System.out.println("Introduzca el tipo de clase que quiere resvervar (1-3)");
                  clase=scanner.nextInt()-1;
                  plaza=1;
                  }
                  while(clase<0||clase>2);
                  
                  while(plaza<=12&& matriz[clase-1][plaza-1]){
                      plaza++;
                  }
                  if (plaza<=12){ 
                  System.out.println("Reserva confirmada clase + (reservar_tipo_clase+1) + \", plaza \" + (primera_clase_vacia+1)");
                  }
                  else{
                      System.out.println("No hay plazas disponibles para esta clase");  
                  }
                    
                    
              
                break;   
 
                case 2:
                    int clase_cancelada;
                    int plaza_cancelada;
                    do{
                        System.out.println("Introduzca el tipo de clase que quiere resvervar (1-3)");
                        clase_cancelada = scanner.nextInt()-1;
                    if(clase_cancelada < 0 || clase_cancelada > 2){
                        System.out.println("Error. Solo puede elegir un tipo de clase del 1 al 3");
                    }
                    }
                    while(clase_cancelada < 0 || clase_cancelada > 2);
                    
                    do{
                        System.out.println("Introduzca el numero de plaza que quiere resvervar (1-12)");
                        plaza_cancelada = scanner.nextInt()-1;
                    if(plaza_cancelada < 0 || plaza_cancelada > 11){
                        System.out.println("Error. Solo puede elegir una plaza del 1 al 12");
                    }
                    }
                    while(plaza_cancelada < 0 || plaza_cancelada > 11);
                    
                    
                    if (matriz[clase_cancelada][plaza_cancelada]){
                       matriz[clase_cancelada][plaza_cancelada] = false;
                       System.out.println("Reserva clase " + (clase_cancelada+1) + " plaza " + (plaza_cancelada+1) + "anulada");
                    }
                    else{
                       System.out.println("Reserva no encontrada"); 
                    }
                    
                    
                    
                break;
 
                case 3:
                    for(int tipoclase =0; tipoclase<matriz.length; tipoclase++){
                        System.out.print("Clase " + (tipoclase+1)+ ": ");
                        switch (tipoclase){
                            case 0: 
                                System.out.print("Yoga, ");
                            break;
                            case 1: 
                                System.out.print("Spinning, ");
                            break;
                            case 2: 
                                System.out.print("Boxeo, ");
                            break;
                        }
                        for(int plazas =0; plazas<matriz[tipoclase].length; plazas++){
                       
                        if(matriz[tipoclase][plazas]){
                            System.out.print("reservada, ");
                            
                        }
                        else{
                            System.out.print("libre, ");                            
                        }
                        
                          
                        }
                        System.out.println();
                    }
                    
                    
                    
                break;
                
                case 4:
                    int tipo_clase;
                    int num_reservas=0;
                    do{
                        System.out.println("Introduzca el tipo de clase");
                        tipo_clase = scanner.nextInt()-1;
                    if(tipo_clase < 0 || tipo_clase > 2){
                        System.out.println("Error. Solo puede elegir un tipo de clase del 1 al 3");
                    }
                    }
                    while(tipo_clase < 0 || tipo_clase > 2);
                    
                    for(int plazas =0; plazas<matriz[tipo_clase].length; plazas++){
                        if(matriz[tipo_clase][plazas]){
                        num_reservas++;    
                        }
                        }
                    System.out.println("El porcentaje de reservas de la clase de " + tipo_clase + " es de un " + (num_reservas/12) + "%");
                    
                    
                    
                    
                break;
                
                case 5:
                break;
                
                default:
                System.out.println("Solo puede escoger una opcion del menu");
                break;
            }
 
        } while (option != 5);
 
        System.out.println("Programa terminado.");
    
}
    
}
