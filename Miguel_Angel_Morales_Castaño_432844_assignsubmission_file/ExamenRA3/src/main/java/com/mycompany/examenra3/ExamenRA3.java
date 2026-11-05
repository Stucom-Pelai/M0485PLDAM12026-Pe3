/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examenra3;

import java.util.Scanner;

/**
 *
 * @author mmora
 */
public class ExamenRA3 {

    public static void main(String[] args) {
        final int CLASES = 3;
        final int PLAZAS = 12;

        boolean[][] participantes = new boolean[CLASES][PLAZAS];
        int option;
        int clase;
        int count = 0;
        int plaza;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < CLASES; i++) {
            for (int j = 0; j < PLAZAS; j++) {
                participantes[i][j] = false;
            }
        }

        do {
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("1. Reservar una plaza");
            System.out.println("2. Cancelar una plaza");
            System.out.println("3. Estado clases");
            System.out.println("4. Porcentaje de reservas por clase");
            System.out.println("5. Salir");
            System.out.println("--------------------------------");
            System.out.print("Introducce una opcion: ");
            do {

                option = scanner.nextInt();
                if (option > 5 || option < 1) {
                    System.out.println("Error: Prueba otro valor.");
                }
            } while (option > 5 || option < 1);

            switch (option) {
                case 1:
                    do {
                        System.out.println("Indique la clase: Yoga=1 Spinning=2 o Boxeo=3: ");
                        clase = scanner.nextInt();
                        if (clase > 3 || clase < 1) {
                            System.out.println("Error: Try another one.");
                        }
                    } while (clase > 3 || clase < 1);
                    for (int i = 0; i < PLAZAS; i++) {
                        if (participantes[clase-1][i]==false) {
                            participantes[clase-1][i]=true;
                            System.out.println("Reserva confirmada clase "+ clase + ", plaza " + (i+1));
                            break;
                        }
                        if(i==11){
                        System.out.println("No hay plazas disponibles para esta clase");
                        }
                    }

                    break;

                case 2:
                    do {
                        System.out.println("Indique la clase: Yoga=1 Spinning=2 o Boxeo=3: ");
                        clase = scanner.nextInt();
                        if (clase > 3 || clase < 1) {
                            System.out.println("Error: Try another one.");
                        }
                    } while (clase > 3 || clase < 1);

                    do {
                        System.out.println("Indique la plaza: ");
                        plaza = scanner.nextInt();
                        if (plaza > 12 || plaza < 1) {
                            System.out.println("Error: Try another one.");
                        }
                    } while (plaza > 12 || plaza < 1);
                    if (participantes[clase - 1][plaza - 1] == true) {
                        participantes[clase - 1][plaza - 1] = false;
                        System.out.println("Reserva clase " + clase + " plaza " + plaza + " anulada");
                    } else {
                        System.out.println("Reserva no encontrada.");
                    }

                    break;

                case 3:

                    for (int i = 0; i < CLASES; i++) {
                        String nombre;
                        if (i == 0) {
                            nombre = "Yoga";

                        } else if (i == 1) {
                            nombre = "Spinning";
                        } else {
                            nombre = "Boxeo";
                        }
                        System.out.print("Clase " + (i + 1) + ": " + nombre + ", ");
                        for (int j = 0; j < PLAZAS; j++) {
                            if (participantes[i][j] == false) {
                                System.out.print("Libre");
                                if (j != PLAZAS - 1) {
                                    System.out.print(", ");
                                }
                            } else {
                                System.out.print("Reservada");
                                if (j != PLAZAS - 1) {
                                    System.out.print(", ");
                                }
                            }

                        }
                        System.out.println();
                    }

                    break;
                case 4:
                    do {
                        System.out.println("Indique la clase: Yoga=1 Spinning=2 o Boxeo=3: ");
                        clase = scanner.nextInt();
                        if (clase > 3 || clase < 1) {
                            System.out.println("Error: Try another one.");
                        }
                    } while (clase > 3 || clase < 1);
                    for (int j = 0; j < PLAZAS; j++) {
                        if (participantes[clase - 1][j] == true) {
                            count++;
                        }
                    }
                    float porcentaje = count*100 / PLAZAS;
                    System.out.println("Para la clase ingresada hay un " + porcentaje + "% reservado");

                    break;
            }

        } while (option != 5);

        System.out.println("Program terminated.");
    }
}
