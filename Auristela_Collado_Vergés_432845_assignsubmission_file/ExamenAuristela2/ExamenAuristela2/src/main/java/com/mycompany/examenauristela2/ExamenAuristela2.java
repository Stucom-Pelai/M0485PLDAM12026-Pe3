/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenauristela2;
import java.util.Scanner;
/**
 *
 * @author auristar
 */
public class ExamenAuristela2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
       final int claseNum= 3;
       final int alumnoNum= 12;
        int clase = 0;
        int plaza = 0;
        int option = 0;
        boolean loop = true;
        
        boolean[][] arrayGimnasio = new boolean[claseNum][alumnoNum];
        
        for(int i=0; i< arrayGimnasio.length; i++) {
            for (int j=0; j <arrayGimnasio[i].length; j++) {
                arrayGimnasio[i][j] = false;
            }
        }
        
        do {
            
            System.out.println();
            System.out.println("Por favor, elija una opción: ");
            System.out.println("1. Reservar una plaza");
            System.out.println("2. Cancelar una reserva");
            System.out.println("3. Mostrar todas las plazas por tipo de clase");
            System.out.println("4. Porcentaje reservado pro clase");
            System.out.println("5. Salir del sistema");
            System.out.println();
            System.out.println("Introduzca la opción aquí: ");
            option = sc.nextInt();
            
            
            switch (option) {
                case 1:
                    
                    int contador = 0;
                    boolean disponible = true;
                    
                    System.out.println("Por favor, elija el tipo de clase (1-3)");
                    clase = sc.nextInt();
                    
                    
                    for (int i=0; i < arrayGimnasio[clase-1].length; i++) {
                        
                        if (arrayGimnasio[clase-1][i] == false) {
                            arrayGimnasio[clase-1][i] = true;
                            System.out.println("Reservada confirmada clase " + clase + ", plaza " + (i+1));
                            break;
                        }
                        if(arrayGimnasio[clase-1][alumnoNum-1] == true) {
                            disponible=false;
                        }
                         
                    }
                     if (disponible==false) {
                            System.out.println("No hay plazas disponibles");
                        }  
                     
                    break;
                    
                case 2:
                    System.out.println("Por favor, elija el tipo de clase (1-3)");
                    clase = sc.nextInt();
                    System.out.println("Por favor, elija la plaza (1-12)");
                    plaza = sc.nextInt();
                    
                    if (arrayGimnasio[clase-1][plaza-1]==true) {
                        arrayGimnasio[clase-1][plaza-1]=false;
                        System.out.println("Reserva clase " + clase + " plaza " +  plaza + " anulada");
                    }
                    else if (arrayGimnasio[clase][plaza]==false) {
                        System.out.println("Reserva no encontrada");
                    }
                    
                    break;
                
                case 3:
                    for(int i=0; i< arrayGimnasio.length; i++) {
                        String[] arrayTipoClases = {"Yoga ", "Spinning ", "Boxeo "};
                                
                        System.out.print("Clase " + (i+1) + ": " + arrayTipoClases[i]);
                        for (int j=0; j <arrayGimnasio[i].length; j++) {
                            String texto = arrayGimnasio[i][j] ? "reservada" : "libre";
                            System.out.print(texto);
                            
                            if (j < arrayGimnasio[i].length) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println();
                    }
                    
                            
                    
                    break;
                        case 4:
                    
                    double plazaSum = 0;
                    
                    System.out.println("Por favor, elija el tipo de clase (1-3)");
                    clase = sc.nextInt();
                    
                    for (int i=0; i < arrayGimnasio[clase-1].length; i++) {
                        if (arrayGimnasio[clase-1][i]==true) {
                            plazaSum++;
                        }
                    }
                    
                    double avgClase = (plazaSum/alumnoNum)*100;
                            System.out.println(plazaSum);
                            System.out.println(alumnoNum);
                    System.out.println("El procentaje de plazas reservadas es del " + avgClase + "%");
                    
                    break;
                    
                case 5:
                    loop = false;
                    break;
                    
                default:
                    System.out.println("Opción no válida");
            }
            
            
            
            
            
            
        } while(loop);
        System.out.println("---------------------");
        System.out.println("Saliendo del Sistema");
        
        
        
    }
}
