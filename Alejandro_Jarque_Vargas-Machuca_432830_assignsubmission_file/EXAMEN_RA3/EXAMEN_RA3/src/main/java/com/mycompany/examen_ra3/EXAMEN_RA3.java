/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen_ra3;
import java.util.Scanner;
/**
 *
 * @author jarqu
 */
public class EXAMEN_RA3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        final int  MAX_CLASES = 3;
        final int  MAX_PLAZAS = 12;
        
        boolean [][] disponibles = new boolean[MAX_CLASES][MAX_PLAZAS];
        
        int opcion = 0;
        int numClase;
        int numPlaza;
        boolean claseCorrecta;
        
        for(int i = 0; i < MAX_CLASES; i++){
            for(int j = 0; j < MAX_PLAZAS; j++){
                disponibles[i][j] = false;
            }
        }
        
        do{
            System.out.println();
            System.out.println("\n--------------------------------");
            System.out.println("1. Reservar una plaza.");
            System.out.println("2. Cancelar una reserva.");
            System.out.println("3. Mostrar todas las plazas por tipo de clase.");
            System.out.println("4. Porcentaje de reservados por clase.");
            System.out.println("5. Salir.");
            System.out.println("--------------------------------\n");
            System.out.println("Seleccione una opcion (1-5):");
            opcion = scan.nextInt();
            
            switch(opcion){
                case 1:
                    do{
                        boolean libre = true;
                        claseCorrecta = true;
                        numClase = 0;
                        numPlaza = 0;
                        System.out.println("Introduce un numero de clase (1-3):");
                        numClase = scan.nextInt();
                        if(numClase > MAX_CLASES || numClase < 1){
                            System.out.println("Opcion invalida! (1-3)");
                            claseCorrecta = false;
                        }else{
                            for(int i = 0; i < MAX_PLAZAS; i++){
                                if(disponibles[numClase -1][i] == false){
                                    disponibles[numClase -1][i] = true;
                                    numPlaza = i;
                                    libre = true;
                                    break; 
                                }else{
                                    libre = false;
                                }
                            }
                            if(libre){
                                System.out.println("Reserva confirmada clase " + numClase + ", plaza " + (numPlaza + 1));
                            }else {
                                System.out.println("No hay plazas disponibles para esta clase!.");
                            } 
                        }
                    }while(!claseCorrecta);
                    break;
                case 2:
                    do{
                        claseCorrecta = true;
                        System.out.println("Introduce un numero de clase (1-3):");
                        numClase = scan.nextInt();
                        if(numClase > MAX_CLASES || numClase < 1){
                            System.out.println("Opcion invalida! (1-3)");
                            claseCorrecta = false;
                        }else{
                            System.out.println("Introduce un numero de plaza (1-12):");
                            numPlaza = scan.nextInt();
                            if(disponibles[numClase -1][numPlaza -1] == true){
                                disponibles[numClase -1][numPlaza -1] = false;
                                System.out.println("Reserva clase " + numClase + " plaza " + numPlaza + " anulada!");
                            }else{
                                System.out.println("Reserva no encontrada!");
                            }
                        }
                    }while(!claseCorrecta);
                    break;
                case 3:
                    for(int i = 0; i < MAX_CLASES; i++){
                        if(i == 0){
                            System.out.print("Clase " + (i + 1) + ": Yoga, ");
                        }else if(i == 1){
                            System.out.print("Clase " + (i + 1) + ": Spinning, ");
                        }else{
                            System.out.print("Clase " + (i + 1) + ": Boxeo, ");
                        }
                        for(int j = 0; j < MAX_PLAZAS; j++){
                            if(disponibles[i][j] == false){
                                System.out.print("libre");
                            }else{
                                System.out.print("reservada");
                            }
                            
                            if(j != MAX_PLAZAS - 1){
                                System.out.print(", ");
                            }
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    do{
                        claseCorrecta = true;
                        int contador = 0;
                        double porcentaje = 0;
                        System.out.println("Introduce un numero de clase (1-3):");
                        numClase = scan.nextInt();
                        if(numClase > MAX_CLASES || numClase < 1){
                           System.out.println("Opcion invalida! (1-3)");
                           claseCorrecta = false;
                        }else {
                            for(int i = 0; i < MAX_PLAZAS; i++){
                                if(disponibles[numClase -1][i] == true){
                                    contador++;
                                }
                            }
                            if(contador == 0){
                                System.out.println("No hay clases reservadas!");
                            }else{
                                porcentaje = (double) contador * 100 / MAX_PLAZAS;
                                System.out.println("El porcentaje de reservas de la clase " + numClase + " es " + porcentaje);
                            }
                        }
                    }while(!claseCorrecta);
                    break;
                case 5:
                    System.out.print("Cerrando el programa...");
                    break;
                default:
                    System.out.print("Seleccione una opcion valida!");
                    break;
            }
        }while(opcion != 5);
    }
}
