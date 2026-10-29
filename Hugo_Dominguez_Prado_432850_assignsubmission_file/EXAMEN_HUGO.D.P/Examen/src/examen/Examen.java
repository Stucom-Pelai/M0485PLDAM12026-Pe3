/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);;
        boolean[][] gym = new boolean[3][12];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 12; j++) {
                gym[i][j] = false;
            }
        }
        int elegir;
        do {

            System.out.println("Selecciona 1 si quiere reservar una clase");
            System.out.println("Selecciona 2 si quiere cancelar una clase");
            System.out.println("Selecciona 3 si quiere mostrar todas las plazas");
            System.out.println("Selecciona 4 si quiere ver el porcentaje de clases seleccionadas");
            System.out.println("Selecciona 5 para salir");
            elegir = scanner.nextInt();

            switch (elegir) {
                case 1:
                    System.out.println("Que tipo de clases le gustaria tener:");
                    System.out.println("1. Yoga");
                    System.out.println("2. Spinning");
                    System.out.println("3. Boxeo");
                    int decision = scanner.nextInt();
                    for (int i = 0; i < 12; i++) {                       
                            if (gym[decision][i] = false) {
                                gym[decision][i] = true;
                                System.out.println("Reserva confirmada clase " + decision + ", plaza " + i);
                                break;
                            } else{
                                    

                                System.out.println("No hay plazas disponibles para esta clase");
                                break;
                            }

                        }
            
                    
                    break;
                case 2:
                    System.out.println("Que tipo de clases le gustaria tener:");
                    System.out.println("1. Yoga");
                    System.out.println("2. Spinning");
                    System.out.println("3. Boxeo");
                    int decision2 = scanner.nextInt();
                    System.out.print("Ahora el numero de la plaza: ");
                    int plaza = scanner.nextInt();
                    if (decision2 < 1 || decision2 > 3) {
                        System.out.println("Escoge un numero adequado");
                    } else if (plaza < 1 || plaza > 12) {
                        System.out.println("Escoge un numero adequado");
                    }

                    if (gym[decision2][plaza] = true) {
                        System.out.println("Reserva clase " + decision2 + " plaza" + plaza + "anulada");
                    } else {
                        System.out.println("Reserva no encontrada");
                    }
                case 3:
                    int contador = 0;
                    for (int i = 0; i < 3; i++) {
                        contador++;
                        if (contador == 1) {
                            System.out.println("Clase " + contador + ": Yoga, ");
                        } else if (contador == 2) {
                            System.out.println("Clase " + contador + ": Spinning, ");
                        } else if (contador == 3) {
                            System.out.println("Clase " + contador + ": Boxeo, ");
                        }
                        for (int j = 1; j < 12; j++) {
                            if (gym[contador - 1][j - 1] = true) {
                                System.out.print("libre, ");
                            } else {
                                System.out.print("reservada, ");
                            }
                        }

                    }
                    break;
                case 4:
                    int contadordef = 0;
                    int contador2 = 0;
                    int contador3 = 0;
                    int contador4 = 0;
                    for (int i = 0; i < 3; i++) {
                        contadordef++;
                        for (int j = 0; j < 12; j++) {
                            if (contadordef == 1) {
                                if (gym[i][j] = true) {
                                    contador2++;
                                }
                            }
                            if (contadordef == 2) {
                                if (gym[i][j] = true) {
                                    contador3++;
                                }
                            }
                            if (contadordef == 3) {
                                if (gym[i][j] = true) {
                                    contador4++;
                                }
                            }
                        }}
                        System.out.println("Elige la clase que quieres ver el porcentaje");
                        System.out.println("1. Yoga");
                        System.out.println("2. Spinning");
                        System.out.println("3. Boxeo");
                        int seleccion = scanner.nextInt();
                        if (contadordef == 1) {
                            System.out.println("Este es el porcentaje de las clases ya tomadas " + (contador2 - 1) + "%");
                        } else if (contadordef == 2) {
                            System.out.println("Este es el porcentaje de las clases ya tomadas " + (contador3 - 1) + "%");
                        } else if (contadordef == 3) {
                            System.out.println("Este es el porcentaje de las clases ya tomadas " + (contador4 - 1) + "%");
                        }

                    }

            
        } while (elegir != 5);
    }
}
