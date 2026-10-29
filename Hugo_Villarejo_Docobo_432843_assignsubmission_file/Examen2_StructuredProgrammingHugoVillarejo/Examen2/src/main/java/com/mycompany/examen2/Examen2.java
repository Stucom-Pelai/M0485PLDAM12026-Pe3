/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen2;

import java.util.Scanner;

/**
 *
 * @author hugov
 */
public class Examen2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clase=3;
        int plaza=12;
       
        boolean[][] gym=new boolean [clase][plaza];
        int activo=0;
        
        
        for (int i = 0; i <clase; i++) {
            for (int j = 0; j < plaza; j++) {
                gym[i][j]=false;
            }
            
        }
        do{
            System.out.println("_____________________");
            System.out.println("1-Reservar una plaza");
            System.out.println("2-Cancelar una reserva");
            System.out.println("3-Mostrar todas las plazas por tipo de clase");
            System.out.println("4-Porcentaje reservado por clase");
            System.out.println("5-Salir del menu");
            System.out.println("_____________________");
            activo=scanner.nextInt();
            
            switch (activo) {
                case 1:
                    System.out.println("Elige una clase(1-3)");
                    int claseelegida=scanner.nextInt();
                    int plazacount=0;
               while(plazacount<12 && gym[claseelegida-1][plazacount]==true)
               {plazacount++;}
               
               if (plazacount<12) {gym[claseelegida-1][plazacount]=true; 
               System.out.println("Reserva confirmada clase "+claseelegida+" plaza "+(plazacount+1));}
               
               else System.out.println("No hay plazas disponibles para esta clase");
                    break;
                case 2:
                    System.out.println("Numero de clase(1-3)");
                    int clasecan=scanner.nextInt();
                    System.out.println("Numero de plaza(1-12)");
                    int plazacan=scanner.nextInt();
                    if (gym[clasecan-1][plazacan-1]==true){gym[clasecan-1][plazacan-1]=false; 
                    System.out.println("Reserva clase "+clasecan+ " plaza "+plazacan+" anulada");
                    
                    }
                    else System.out.println("Reserva no encontrada");
                    break;
                case 3:
                    for (int i = 0; i < clase; i++) {
                    
                        System.out.println("");
                          System.out.print("Clase "+(i+1)+": ");
                          if (gym[i]==gym[0]){System.out.print("yoga,");}
                           if (gym[i]==gym[1]){System.out.print("Spinning,");}
                           if (gym[i]==gym[2]){System.out.print("Box,");}
                        for (int j = 0; j < plaza; j++) { 
                            if(gym[i][j]==true)System.out.print(" reservada,");
                            else System.out.print(" libre,");
                            
                        }
                        
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Elige una clase para ver el porcentage(1-3)");
                    int claseperc=scanner.nextInt();
                    double counter=0.0;
                    for (int i = 0; i < 12; i++) {
                       
                       if (gym[claseperc-1][i]==true)
                               {counter++;}
                    }
                    double operacion=(counter/12)*100.00;
                    System.out.println(operacion +"%");
                    break;
              
            }
            
            
            
            
            
            
            
        }while(activo!=5);
       
    }
}
