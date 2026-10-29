/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen_ra3;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Examen_RA3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CLASES=3;
        final int PLAZA=12;
        boolean [][] PLAZAS = new boolean[CLASES][PLAZA];
        for(int i = 0;i<CLASES;i++){
            for(int j=0;j<PLAZA;j++){
                PLAZAS[i][j]=false;
        }
    }
        int a;
        do{
            System.out.println("1. Reservar una plaza");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Mostrar todas las plazas disponibles");
            System.out.println("4. Porcentaje reservado");
            System.out.println("5. Salir");
            System.out.println("--------------------------");
            System.out.println("Seleccione una opción(1-5):");
        a=scanner.nextInt();
        switch(a){
            case 1: System.out.println("Seleccione una clase (1-3):");
            int b=scanner.nextInt();
            
            for(int i=b;i<CLASES;i++){
                for(int j=1;j<PLAZA;j++){
               if(b>0&&b<4){
                if (PLAZAS[i][j]==false){
                    PLAZAS[i][j]=true;
                    System.out.println("Reserva confirmada clase "+i+", plaza "+j);
                    break;
                }
                else{
                    System.out.println("No hay plazas disponibles para esa clase");
                    break;
                }}
               else{
                   System.out.println("No es una clase válida.");
                   break;
                }
            }
            }
            break;
            case 2:
                System.out.println("Seleccione una clase (1-3):");
                int clase=scanner.nextInt();
                System.out.println("Seleccione una plaza (1-12):");
                int plaza=scanner.nextInt();
                 for(int i=clase-1;i<CLASES;i++){
                for(int j=plaza-1;j<PLAZA;j++){
                    if (PLAZAS[i][j]==true){
                        PLAZAS[i][j]=false;
                        System.out.println("Reserva clase "+i+" plaza "+j+"anulada");
                        break;
                    }
                    if(PLAZAS[i][j]==false){
                        System.out.println("Reserva no encontrada");
                        break;
                    }
                    else {
                        System.out.println("Esa calse/fila no existe");
                        break;
                    }
                }
        }
            case 3: 
                for(int i=0;i<3;i++){
                   System.out.print("Clase "+(i+1)+": ");
                
                    for(int j=0;j<12;j++){
                   
                    if (PLAZAS[i++][j]==false){
                        System.out.print("libre ");
                    }
                    if( PLAZAS[i++][j]==true){
                        System.out.print("reservada ");
                    }
                    
                   
                    
                }}
                break;
            case 4:
                
        
        }
        
        }while(a !=5);
}}
