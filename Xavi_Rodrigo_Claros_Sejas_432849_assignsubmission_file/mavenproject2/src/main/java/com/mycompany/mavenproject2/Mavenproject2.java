/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author xavic
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean matriz[][] = new boolean[3][12];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = false;
            }

        }
        int option;
        do {
            System.out.println("\nMENU GESTION PLAZAS");
            System.out.println("------------------------");
            System.out.println("OPCION 1: RESERVAR UNA PLAZA");
            System.out.println("OPCION 2: CANCELAR UNA RESERVA");
            System.out.println("OPCION 3: MOSTRAR TODAS LAS PLAZAS POR TIPO DE CLASE");
            System.out.println("OPCION 4: PORCENTAJE RESERVADO POR CLASE");
            System.out.println("OPCION 5: SALIR");
            System.out.println("------------------------");
            System.out.println("Escoge una opcion: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Donde quiere hacer la reserva? (1-3)");
                    int reserva = scanner.nextInt();
                    int truereserva = reserva - 1;
                    for (int i = 0; i < 12; i++) {
                        if (matriz[truereserva][i] == false) {
                            matriz[truereserva][i] = true;
                            System.out.println("Reserva confirmada clase " + reserva + ", plaza " + (i + 1));
                            break;
                        } else {
                            System.out.println("No hay plazas disponibles para esta clase");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ingrese clase (1-3)");
                    int clase = scanner.nextInt();
                    System.out.println("Ingrese plaza (1-12)");
                    int plaza = scanner.nextInt();
                    int trueclase = clase - 1;
                    int trueplaza = plaza - 1;
                    if (matriz[trueclase][trueplaza] == true) {
                        matriz[trueclase][trueplaza] = false;
                        System.out.println("Reserva clase " + clase + " plaza " + plaza + " anulada");
                        break;
                    } else {
                        System.out.println("Reserva no encontrada");
                    }
                    break;
                case 3:

                    for (int i = 0; i < 3; i++) {
                        System.out.print("\nClase " + (i + 1) + ":");
                        if (i == 0) {
                            System.out.print(" Yoga, ");
                        } else if (i == 1) {
                            System.out.print(" Spinning, ");
                        } else if (i == 2) {
                            System.out.print(" Boxeo, ");
                        }
                        for (int j = 0; j < 12; j++) {
                            if (matriz[i][j] == false) {
                                System.out.print("libre");
                            } else {
                                System.out.print("reservada");
                            }
                            if (j < 11) {

                                System.out.print(", ");
                            }

                        }

                    }
                    break;
                case 4:
                    System.out.println("Ingrese clase (1-3)");
                    int clasesreservadas = 0;
                    int clase1 = scanner.nextInt();
                    int trueclase1 = clase1 - 1;
                    for (int i = 0; i < 12; i++) {
                        if (matriz[trueclase1][i] == true) {
                            clasesreservadas++;
                        }
                    }
                    
                    int average = (clasesreservadas*100/12); 
                    System.out.println("El porcentaje de reservas es: " + average + "%");
                    break;
                case 5:
                    System.out.println("Adios!!");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }
        } while (option != 5);
    }
}
