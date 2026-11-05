/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen_ra3;

import java.util.Scanner;

/**
 *
 * @author joser
 */
public class Examen_RA3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eleccion;
        final int num_clase = 3, num_plaza = 12;
        boolean [][] clases = new boolean [num_clase][num_plaza];
        
        for(int i = 0; i < num_clase; i++){
            for(int j = 0; j < num_plaza; j++){
                clases[i][j]=false;
            }
        }
        
        int clase, plaza;
        
        do{
            System.out.println("---------------------------------------------");
            System.out.println("1. Reservar una plaza");
            System.out.println("2. Cancelar una reserva");
            System.out.println("3. Mostrar todas las plazas por tipo de clase");
            System.out.println("4. Porcentaje reservado por clase");
            System.out.println("5. Salir del menu");
            System.out.println("---------------------------------------------");
            eleccion = scanner.nextInt();
            
            while(eleccion < 1 || eleccion > 5){
                System.out.println("Opcion elegida incorrecta, porfavor escoja un valor valido entre (1 - 5)");
                eleccion = scanner.nextInt();
            }
            
            switch (eleccion){
                case 1:
                    System.out.println("Dime una clase el tipo de clase (1-3) donde quieres hacer la reserva.");
                    clase = scanner.nextInt();
                    plaza = 1;
                    
                    while(plaza <= 12 && clases[clase-1][plaza-1] ){
                          plaza++;
                    }
                    
                        if(plaza <= 12){
                            clases[clase-1][plaza-1]=true;
                            System.out.println("Reserva confirmada clase " + clase + ", plaza " + plaza);
                        }else{
                            System.out.println("No hay plazas disponibles para esta clase");
                        }
                    
                    
                    break;
                case 2:
                    System.out.println("Dime una clase (1-3) de la plaza que quieres anular");
                    clase = scanner.nextInt();
                    System.out.println("Dime una plaza (1-12) que quieres anular la reservar");
                    plaza = scanner.nextInt();
                    
                    if(clases[clase-1][plaza-1]){
                        clases[clase-1][plaza-1]=false;
                        System.out.println("Reserva clase " + clase + " plaza " + plaza + " anulada");
                        
                    }else{
                        System.out.println("Reserva no encontrada");
                    }
                    
                    break;
                case 3:
                    for(int i = 0; i < num_clase; i++){
                        System.out.println("\nClase " + (i+1) + " : ");
                        switch (i){
                            case 0:
                                System.out.print("Yoga,");
                                break;
                            case 1:
                                System.out.print("Spinning,");
                                break;
                            case 2:
                                System.out.print("Boxeo,");
                                break;
                        }
                        for (int j = 0; j < num_plaza; j++){
                            
                            String texto = clases[i][j] ? "reservada" : "libre";
                            System.out.print(texto + ", ");
                        }
                    }System.out.println();
                    break;
                case 4:
                    int contador = 0;
                    int plazas_ocupadas = 0;
                    
                    for (int i = 0; i < clases[num_clase].length;i++){
                        contador++;
                    }
                    for(int j = 0; j < clases[num_plaza].length; j++){
                        plazas_ocupadas++;
                       
                    }
                    double total = (contador + plazas_ocupadas)/2 ;
                    
                    System.out.println(total);
                    
                    break;
            }
            
        }while(eleccion != 5);
    }
}
