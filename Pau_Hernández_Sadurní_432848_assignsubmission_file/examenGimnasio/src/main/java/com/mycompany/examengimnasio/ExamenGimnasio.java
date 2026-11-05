/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examengimnasio;

import java.util.Scanner;

/**
 *
 * @author pauhe
 */
public class ExamenGimnasio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[][] gimnasio = new boolean[3][12];

        int opc;

        do {

            System.out.println("");
            System.out.println("------------------------------------");
            System.out.println("1.Escribe que plaza desea reservar:");
            System.out.println("2.Cancelar una reserva");
            System.out.println("3.Mostrar todas las plazas por tipo de clase");
            System.out.println("4. Porcentaje reservado por clase.");
            System.out.println("5. Salir del programa");
            System.out.println("");
            System.out.print("Escribe tu opcion:(1-5)");

            opc = scanner.nextInt();

            switch (opc) {
                
                case 1:
                    System.out.println("Escribe el numero de tu clase (1-3)");
                    int filaReserva = scanner.nextInt() - 1;
                    System.out.println("Escribe la plaza:");
                    int plazaReserva = scanner.nextInt() - 1;

                    if (filaReserva >= 0 && filaReserva < 3 && plazaReserva >= 0 && plazaReserva < 12) {
                        if (!gimnasio[filaReserva][plazaReserva]) {
                            gimnasio[filaReserva][plazaReserva] = true;
                            System.out.println("Clase Reservada: Fila " + (filaReserva + 1) + ", Clase " + (plazaReserva + 1));
                        } else {
                            System.out.println("La clase  ya está ocupada");
                        }
                    } else {
                        System.out.println("Clase o plaza incorrecta.");
                    }
                    break;

                    
                case 2:
                    System.out.print("Introduce el numero de fila (1-4):");
                    int filaCancela = scanner.nextInt() - 1;
                    System.out.print("Introduce el numero de asiento (1-12):");
                    int columnaCancela = scanner.nextInt() - 1;

                    if (filaCancela >= 0 && filaCancela < 3 && columnaCancela >= 0 && columnaCancela < 12) {

                        if (gimnasio[filaCancela][columnaCancela]) {
                            gimnasio[filaCancela][columnaCancela] = false;
                            System.out.println("Reserva cancelada: Fila " + (filaCancela + 1) + ", Asiento " + (columnaCancela + 1));
                        } else {
                            System.out.println("La clase no estaba reservada");
                        }
                    } else {
                        System.out.println("Fila o clase incorrecta");
                    }
                    break;
                    
                case 3:
                    System.out.println("Mostrar Plazas:");
                    for (int i = 0; i < gimnasio.length; i++) {
                        System.out.print("Clase 1: " + (i + 1) + ": ");
                        for (int j = 0; j < gimnasio[i].length; j++) {
                            System.out.print(gimnasio[i][j]);
                            if (j < gimnasio[i].length) {
                                System.out.print(", ");
                               
                                
                            }
                            break;

                        }

                        break;
                    }
                    
                case 4:
                    System.out.println("");
                    break;
            }
        } while (opc != 5);
        System.out.println("------------------------");
        System.out.println("Has Salido  del menu correctamente ");
        System.out.println("------------------------");

    }
}
