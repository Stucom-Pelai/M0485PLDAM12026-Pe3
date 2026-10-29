/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examen2_martes27_ainhoa_garcia_aliaga;

import java.util.Scanner;

/**
 *
 * @author ainhoa
 */
public class Examen2_Martes27_Ainhoa_Garcia_Aliaga {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int num_plazas = 12, num_clases = 3;
        boolean[][] reservas = new boolean[num_clases][num_plazas];

        for (int i = 0; i <= num_clases; i++) {
            for (int j = 0; j <= num_plazas; j++) {
                reservas[i][j] = false;
            }
        }

        int option;
        int clase;
        int plaza;

        do {
            System.out.println("----Bienvenido a a la reserva de clases del gym----");
            System.out.println("1. Reservar una plaza");
            System.out.println("2. Cancelar una reserva");
            System.out.println("3. Mostrar plazas de las clases");
            System.out.println("4. Porcentaje de la reservacion de cada clase");
            System.out.println("5. Salir del menu");
            System.out.println("\nIngrese una opción por favor.");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("A que clase le gustaria hacer una reserva?: ");
                    clase = scanner.nextInt();
                    plaza = 0;
                    
                   
                    
                    if(reservas[clase][plaza]==false){
                    reservas[clase][plaza]=true;
                    System.out.println("Reserva hecha a clase "+clase+", plaza "+plaza);
                    }
                    
                    else{
                    System.out.println("Ya no hay plazas disponibles para esta clase");
                    }
                    
                    else{
                    System.out.println("Elección no valida");
                    }
            break;

            case 2:
               System.out.println("Que clase desea cancelar?: ");
               
            if(){
                
            }
            else{
                System.out.println("No hay plazas disponibles para esta clase");
            }
            else{
                System.out.println("Reserva no encontrada");
                    }
            break;

            case 3:
            System.out.println("Clase 1: Yoga "+estado+ ", ");
            System.out.println("Clase 2: Spinning "+estado+", ");
            System.out.println("Clase 3: Boxeo "+estado+", ");
            
            break;
            
            case 4:
                if{
                  System.out.println("Por favor,introduzca las clases:");
                  int=scanner.nextInt();
                }
                else{
                    System.out.println("El porcentaje seria: "+porcentaje+"%");
                }
                break;
            
            case 5:
                System.out.println("Hasta luego");
                }
            break;
            
    }

while (option!=5);
        
        
        
        
        
       
    }
}
