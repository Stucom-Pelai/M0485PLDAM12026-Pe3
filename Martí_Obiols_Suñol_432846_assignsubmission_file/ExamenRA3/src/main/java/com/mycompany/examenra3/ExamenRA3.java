/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examenra3;

import java.util.Scanner;

/**
 *
 * @author mobio
 */
public class ExamenRA3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //establecer valor al maximo y a el array
        int MAX_CLASES = 3;
        int MAX_PLAZAS = 12;
        int claseUsr;
        int selection;
        int plazaUsr;
        int i;
        int contadorPlazas = 0;
        double contadorReservas;
        double porcentaje;
        boolean[][] gym = new boolean[MAX_CLASES][MAX_PLAZAS];
        String[] CLASES = new String[3];
        CLASES[0] = "Yoga";
        CLASES[1] = "Spinning";
        CLASES[2] = "Boxeo";
        //establecer valores false al array
        for (int j = 0; j < MAX_CLASES; j++) {
            for (i = 0; i < MAX_PLAZAS; i++) {
                gym[j][i] = false;
            }
        }
        //menu
        do {
            System.out.println("");
            System.out.println("-----{Bienvenido al sistema de gestion del GYM}-----");
            System.out.println("1-Reservar una plaza");
            System.out.println("2-Cancelar reserva");
            System.out.println("3-Mostrar todas las plazas por tipo de clase");
            System.out.println("4-Porcentaje reservado por calse");
            System.out.println("5-Exit");
            System.out.println("Seleciona una opcion entre 1-5:");
            System.out.println("");
            selection = scan.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("Di una clase que quieras reservar:");
                    claseUsr = scan.nextInt() - 1;

                    for (i = 0; i < MAX_PLAZAS; i++) {
                        if (gym[claseUsr][i] == false) {
                            gym[claseUsr][i] = true;
                            System.out.println("Reserva confirmada clase " + (claseUsr + 1) + ", plaza " + (i + 1));
                            break;

                        }
                    }
                    if (i == MAX_PLAZAS) {
                        System.out.println("No hay plazas disponibles para esta clase");
                    }
                    break;
                case 2:
                    System.out.println("Di una clase y numero de plaza que cancelar:");
                    claseUsr = scan.nextInt() - 1;
                    plazaUsr = scan.nextInt() - 1;
                    if (gym[claseUsr][plazaUsr] == true) {
                        gym[claseUsr][plazaUsr] = false;
                        System.out.println("Reserva cancelada en clase " + (claseUsr + 1) + ", plaza " + (plazaUsr + 1));
                        break;

                    } else {
                        System.out.println("Reserva no encontrada");
                    }

                    break;
                case 3:
                    for (int j = 0; j < MAX_CLASES; j++) {
                        System.out.println("");
                        System.out.print("Clase " + (j + 1) + ": " + CLASES[j] + ", ");
                        for (i = 0; i < MAX_PLAZAS; i++) {
                            if (gym[j][i] == true) {
                                System.out.print("reservada, ");

                            } else {
                                System.out.print("libre, ");

                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Dime una clase para hacer el porcentaje de reservas:");
                    contadorReservas=0;
                    claseUsr = scan.nextInt() - 1;
                    for (int j = 0; j < MAX_PLAZAS - 1; j++) {
                        if (gym[claseUsr][j]==true) {
                            contadorReservas+=1;
                        }
                    }
                    porcentaje = (contadorReservas / MAX_PLAZAS)*100;
                    System.out.println("El porcentaje de reservas es: " + porcentaje + "%");
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Has introducido un valor no valido");
            }

        } while (selection != 5);
    }
}
