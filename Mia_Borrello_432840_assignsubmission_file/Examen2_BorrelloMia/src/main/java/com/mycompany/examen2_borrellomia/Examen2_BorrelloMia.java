/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen2_borrellomia;

import java.util.Scanner;

/**
 *
 * @author miabo
 */
public class Examen2_BorrelloMia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_PLAZAS = 12, NUM_CLASES = 3;
        boolean[][] reservas = new boolean[NUM_CLASES][NUM_PLAZAS];

        for (int i = 0; i < NUM_CLASES; i++) {
            for (int j = 0; j < NUM_PLAZAS; j++) {
                reservas[i][j] = false;
            }
        }
        int opcion;
        int clase;
        int plaza;

        do {
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("Bienvenido al menu de reserva de clase");
            System.out.println("1. Reservar una plaza");
            System.out.println("2. Cancelar una reserva");
            System.out.println("3. Mostrar estado de las clases");
            System.out.println("4. Mostrar porcentaje reservado");
            System.out.println("5. Salir del menu");
            System.out.println("--------------------------------");
            System.out.print("Ingrese su opcion: ");
            opcion = scanner.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Ingrese el tipo de clase donde quiere realizar la reserva: ");
                    clase=scanner.nextInt();
                    plaza=0;
                    
                    if (clase <= NUM_CLASES) {
                        for (int i = 0; i <= NUM_PLAZAS; i++) {
                            if (reservas[clase][i] == false) {
                                reservas[clase][i] = true;
                                plaza=i;
                            } else {
                                System.out.println("No hay plazas disponibles para esta clase");
                            }
                        }
                        System.out.println("Reserva confirmada clase " + clase + ", plaza " + plaza);
                    } else {
                        System.out.println("La clase que eligio no existe");
                    }

                    
                    break;
                case 2:
                    System.out.println("Ingrese la clase a la cual desea cancelar: ");
                    clase=scanner.nextInt();
                    System.out.println("Ingrese la plaza: ");
                    plaza=scanner.nextInt();
                    
                    if(reservas[clase][plaza]==true){
                        reservas[clase][plaza]= false;
                        System.out.println("Reserva clase "+clase+", plaza "+plaza+" ha sido anulada");
                    }
                    else{
                        System.out.println("Reserva no encontrada");
                    }
                    
                    break;
                    
                case 3:
                    for (int i = 0; i <= NUM_CLASES; i++) {
                        switch (i) {
                            case 1:
                                System.out.print("Clase " + i + ": Yoga, ");
                                for (int j = 0; j <= NUM_PLAZAS; j++) {
                                    if (j == NUM_PLAZAS) {
                                        System.out.print(reservas[i][j] + ".");
                                    } else {
                                        System.out.print(reservas[i][j] + ", ");
                                    }
                                }
                                break;
                            case 2:
                                System.out.print("Clase " + i + ": Spinning, ");
                                for (int j = 0; j <= NUM_PLAZAS; j++) {
                                    if (j == NUM_PLAZAS) {
                                        System.out.print(reservas[i][j] + ". ");
                                    } else {
                                        System.out.print(reservas[i][j] + ", ");
                                    }
                                }
                                break;
                            case 3:
                                System.out.print("Clase " + i + ": Boxeo, ");
                                for (int j = 0; j <= NUM_PLAZAS; j++) {
                                    if (j == NUM_PLAZAS) {
                                        System.out.print(reservas[i][j] + ".");
                                    } else {
                                        System.out.print(reservas[i][j] + ", ");
                                    }
                                }
                                break;
                    }
                        break;
                    }
                    break;
                    
                case 4:
                    
                    break;
            }
        } while (opcion != 5);
    }
}
