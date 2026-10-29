/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examenra3;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Examenra3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] gimnasio = new boolean[3][12];
        for (int i = 0; i < gimnasio.length; i++) {
            for (int j = 0; j < gimnasio[i].length; j++) {
                gimnasio[i][j] = false;

                int opcion;
                do {
                    System.out.println();
                    System.out.println("1. Tipo de la clase");
                    System.out.println("2. Cancelar reserva");
                    System.out.println("3. Mostrar todas las plazas");
                    System.out.println("4. Porcentage reservado");
                    System.out.println("5. Salir");

                    do {
                        System.out.print("Elige una opción (1-5): ");
                        opcion = scanner.nextInt();
                        if (opcion < 1 || opcion > 5) {
                            System.out.println("Opción no valida");
                        }
                    } while (opcion < 1 || opcion > 5);

                    int plaza;
                    int clase;

                    switch (opcion) {
                        case 1:
                            do {
                                System.out.print("Introduce la clase (1-3): ");
                                clase = scanner.nextInt();
                                if (clase < 1 || clase > 3) {
                                    System.out.println("Clase no encontrada.");
                                }
                            } while (clase < 1 || clase > 3);
                            boolean reservada = false;
                            for (int j = 0; j < gimnasio[clase - 1].length && !reservada; j++) {
                                if (!gimnasio[clase - 1][j]) {
                                    gimnasio[clase - 1][j] = true;
                                    reservada = true;
                                    System.out.println("Clase reservada de " + clase + ", plaza " + (j + 1));
                                }
                            }
                            if (!reservada) {
                                System.out.println("No hay plazas disponibles para la clase " + clase);
                            }
                            break;
                        case 2:
                            do {
                                System.out.print("Introduce la clase (1-3): ");
                                clase = scanner.nextInt();
                                if (clase < 1 || clase > 3) {
                                    System.out.println("Clase no econtrada.");
                                }
                            } while (clase < 1 || clase > 3);
                            do {
                                System.out.print("Introduce el número de plaza (1-12): ");
                                plaza = scanner.nextInt();
                                if (plaza < 1 || plaza > 12) {
                                    System.out.println("Plaza no encontrada.");
                                }
                            } while (plaza < 1 || plaza > 12);
                            if (gimnasio[clase - 1][clase - 1]) {
                                gimnasio[clase - 1][clase - 1] = false;
                                System.out.println("Plaza " + plaza + " de la clase " + clase + " liberada correctamente");
                            } else {
                                System.out.println("Esa plaza ya estaba libre");
                            }
                            break;

                        case 3:
                            for (int i = 0; i < gimnasio.length; i++) {
                                System.out.print("Clase " + (i + 1) + ": ");
                                for (int j = 0; j < gimnasio[i].length; j++) {
                                    if (gimnansio[i][j]) {
                                        System.out.print("ocupada");
                                    } else {
                                        System.out.print("libre");
                                    }
                                    if (j < gimnansio[i].length - 1) {
                                        System.out.print(", ");
                                    }
                                }
                                System.out.println();
                            }
                            break;
                              
    }
