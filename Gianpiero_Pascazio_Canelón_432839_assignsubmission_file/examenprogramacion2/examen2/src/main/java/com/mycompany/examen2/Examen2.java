
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examen2;

import java.util.Scanner;

/**
 *
 * @author gianp
 */
public class Examen2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] gimnasio = new boolean[3][12];
        int clase = 0;
        int plaza = 0;
        int opcion;
        for (clase = 0; clase < 3; clase++) {
            for (plaza = 0; plaza < 12; plaza++) {
            }
        }
        do {
            System.out.println("1: Reservar una plaza");
            System.out.println("2: Cancelar una reserva");
            System.out.println("3: mostrar todas las plazas por tipo de clase");
            System.out.println("4: Porcentaje reservador por clase");
            System.out.println("5: Salir del menu");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("elija la clase: ");
                    clase = scanner.nextInt();
                    System.out.println("elija la plaza: ");
                    plaza = scanner.nextInt();
                    if (gimnasio[clase - 1][plaza - 1] = false) {
                        gimnasio[clase - 1][plaza - 1] = true;

                    }
                    System.out.println("Plaza reservada.");
                    break;

                case 2:
                    System.out.println("elija la clase");
                    clase = scanner.nextInt();
                    System.out.println("elija la plaza");
                    plaza = scanner.nextInt();
                    if (gimnasio[clase - 1][plaza - 1] = true) {
                        gimnasio[clase - 1][plaza - 1] = false;
                    }
                    System.out.println("Reserva cancelada.");
                    break;
                case 3:
                    for(clase = 0; clase < 3;){
                    for (plaza = 0; plaza < 12;){
                    }
                    }
                    if(clase == 0){
                    if(plaza ==0){
                        System.out.print(clase + plaza+ "");
                        System.out.println("");
                    }
                    }
            }
            
        } while (opcion != 5);
    }
}
