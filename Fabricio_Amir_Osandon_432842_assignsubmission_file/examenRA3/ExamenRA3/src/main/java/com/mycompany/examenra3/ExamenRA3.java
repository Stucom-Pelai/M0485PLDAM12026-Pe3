/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenra3;

import java.util.Scanner;
/**
 *
 * @author Viviana
 */
public class ExamenRA3 {

    public static void main(String[] args) {
        
        
        boolean[][]gimnasio= new boolean [3][12];
        
        for(int i = 0;i < 3;i++){
            
            for(int j = 0; j < 12;j++){
                gimnasio[i][j] = false;
            }
        }
      Scanner scanner = new Scanner (System.in);

        int opcion;
        do{
            System.out.println("1-Reservar una plaza");
            System.out.println("2-Cancear reserva");
            System.out.println("3-Mostrar todas las plazas por tipo de clase");
            System.out.println("4-Porcentaje reservado por clase");
            System.out.println("5-Salir del menu");
            System.out.println("Escoge una opcion:");
            opcion = scanner.nextInt();
            
            
            switch (opcion){
                case 1:
                System.out.println("En que clase quieres hacer la reserva 1-3");
                int clase = scanner.nextInt();            
                //int clase1 = clase - 1;
                int plaza = 1;
                
                if(gimnasio[clase][plaza] == false){
                    gimnasio[clase][plaza] = true;
                    System.out.println("Reserva confirmada clase " + clase + ", plaza " + plaza);
                }else{
                    System.out.println("No hay plazas disponibles para esta clase");
                }break;
                
                case 2:
                System.out.println("Escoge una clase para cancelar 1-3");
                int claseindex = scanner.nextInt();
                System.out.println("Escoge una plaza para cancelar 1-12");
                int plazaindex = scanner.nextInt();
                    
                    int claseindex1 = claseindex - 1;
                    int plazaindex1 = plazaindex -1;
                   
                    if(gimnasio[claseindex1][plazaindex1] == true){
                        gimnasio[claseindex1][plazaindex1] = false;
                        System.out.println("Reserva clase " + claseindex + " plaza " + plazaindex + " anulada");
                    }else{
                        System.out.println("Reserva no encontrada");
                    }break;
                
                case 3:
                    for(int i = 0;i < gimnasio.length;i++){
                        System.out.print("Yoga: " + (i + 1));
                        
                        for(int j = 0; j < gimnasio[i].length;j++){
                            System.out.print(gimnasio[i][j]);
                            System.out.print(", ");
                                                   
                        }                System.out.println();    

                    }    
                
            }
        }while(opcion != 5);
        
        
        scanner.close();
    }
}
