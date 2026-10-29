/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examen_ra3;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author perez
 */
public class EXAMEN_RA3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUM_CLASES = 3, NUM_PLAZAS = 12;

        boolean[][] plazas = new boolean[NUM_CLASES][NUM_PLAZAS];

        for (int i = 0; i < NUM_CLASES; i++) {
            for (int j = 0; j < NUM_PLAZAS; j++) {
                plazas[i][j] = false;
            }

        }

        int eleccion;
        int clase;
        int plaza;
        do {
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("1. Reservar una plaza");
            System.out.println("2. Cancelar una reserva");
            System.out.println("3. Mostrar todas las plazas por tipo de clase");
            System.out.println("4. Porcentaje reservado por clase");
            System.out.println("5. Salir del menu");
            System.out.println("--------------------------------");
            System.out.println("Escoje una opcion(1-5)");
            eleccion = scanner.nextInt();

            while (eleccion < 1 || eleccion > 5) {
                System.out.println("Opcion escojida incorrecta, porfavor escoja un valor valido (1-5)");
                eleccion = scanner.nextInt();

            }

            switch (eleccion) {
                case 1:

                    System.out.println("Cual clase quiere reservar? (1-3)");
                    clase = scanner.nextInt();
                    plaza = 1;
                    while (clase < 1 || clase > 3) {
                        System.out.println("Valor escojido incorrecto, porfavor escoja un valor valido: (1-3)");
                        clase = scanner.nextInt();

                    }
                    while (plaza <= 12 && plazas[clase - 1][plaza - 1]) {
                        plaza++;
                    }
                    if (plaza <= 12) {
                        plazas[clase - 1][plaza - 1] = true;
                        System.out.println("Reserva confirmada clase " + clase + ", plaza " + plaza);

                    } else {
                        System.out.println("No hay plazas disponibles para esta clase");
                    }
                    break;
                case 2:
                    System.out.println("Introduce una clase: (1-3) ");
                    clase = scanner.nextInt();
                    while (clase < 1 || clase > 3) {
                        System.out.println("Valor escojido incorrecto, porfavor escoja un valor valido: (1-3)");
                        clase = scanner.nextInt();
                    }

                    System.out.println("Dime el numero de plaza: (1-12)");
                    plaza = scanner.nextInt();

                    while (clase < 1 || clase > 3) {
                        System.out.println("Valor escojido incorrecto, porfavor escoja un valor valido: (1-3)");
                        plaza = scanner.nextInt();
                    }

                    if (plazas[clase - 1][plaza - 1]) {
                        plazas[clase - 1][plaza - 1] = false;
                        System.out.println("Reserva clase " + clase + ", plaza " + plaza + " anulada.");
                    } else {
                        System.out.println("Reserva no encontrada!");
                    }
                    break;

                case 3:
                    for (int i = 0; i < NUM_CLASES; i++) {
                        System.out.print("\nClase " + (i + 1) + ": ");
                        for (int j = 0; j < NUM_PLAZAS; j++) {
                            String texto = plazas[i][j] ? "ocupada" : "libre";
                            System.out.print(texto);
                            if (j != NUM_PLAZAS) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    int contador = -1;
                    int PLAZAS_OCUPADAS = 0;

                    System.out.println("Introduce el numero de sala el cual quieres ver el porcentaje de reservas: (1-3)");
                    clase = scanner.nextInt();

                    while (clase < 1 || clase > 3) {
                        System.out.println("Valor escojido incorrecto, porfavor escoja un valor valido: (1-3)");
                        clase = scanner.nextInt();
                    }

                    for (int j = 0; j < NUM_PLAZAS; j++) {
                        if (plazas[clase-1][j]=true ) {
                            contador++;
                        }
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
            }

        } while (eleccion != 5);

        System.out.println("Program terminado.");
    }
}
