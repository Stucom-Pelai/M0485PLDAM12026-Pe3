/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen2borjamatute;

import java.util.Scanner;

/**
 *
 * @author kibmo
 */
public class Examen2BorjaMatute {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        final int CLASE=3,PLAZA=12;
        boolean[][] sitio= new boolean [CLASE][PLAZA];
        int opcion;
        for (int i = 0; i < CLASE; i++) {
            for (int j = 0; j < PLAZA; j++) {
                sitio[i][j]=false;
            }
        }
        
        
        do {    
            System.out.println("\n\n1. Reservar plaza");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Mostrar todas las plazas por tipo de clase");
            System.out.println("4. Porcentaje reservado por clase");
            System.out.println("5. Salir");
            opcion=sc.nextInt();
            
            switch (opcion) {
                case 1:
                    int tipoclase;
                    int plaza1=1;
                    System.out.println("Introduca la el tipo de clase que quiere realizar:\n1.Yoga\n2.Spinning\n3.Boxeo");
                    tipoclase=sc.nextInt();
                    while (sitio[tipoclase-1][plaza1-1]&&plaza1<=12) {                        
                        plaza1++;
                    }if (plaza1<=12) {
                        sitio[tipoclase-1][plaza1-1]=true;
                        System.out.println("Reserva confirmada para la clase "+tipoclase+", plaza "+plaza1);
                    }else{System.out.println("No hay plazas disponibles para esta clase");}
                    
                    break;
                case 2:
                    int tipoclase2;
                    int plaza2;
                    System.out.println("Introduza su clase:\n1.Yoga\n2.Spinning\n3.Boxeo");
                    tipoclase2=sc.nextInt();
                    System.out.println("Introduca su plaza");
                    plaza2=sc.nextInt();
                    if (sitio[tipoclase2-1][plaza2-1]==true) {
                        sitio[tipoclase2-1][plaza2-1]=false;
                        System.out.println("Reserva de la clase "+tipoclase2+", plaza "+plaza2+" anulada");
                    }
                    else { System.out.println("Reserva no encontrada");}
                    break;
                case 3:
                    for (int i = 0; i < CLASE; i++) {
                        System.out.print("\nClase "+(i+1)+":");
                                for (int j = 0; j < PLAZA; j++) {
                                    boolean clase=sitio[i][j];
                                    System.out.print(clase+",");
                        }
                    }
                    break;
                case 4:
                    int clase3;
                    double plazasOcp=1.0;
                    System.out.println("Introduzca una clase:");
                    clase3=sc.nextInt();
                    for (int i = 1; i < 12; i++) {
                        if (sitio[clase3-1][i]==true) {
                            plazasOcp++;
                        }
                    }
                    double porcentaje=(double)(plazasOcp/12)*100.0;
                    System.out.println("El porcentaje de reservas de la "+clase3+" es del "+porcentaje+"%");
                    break;
                case 5: System.out.println("Cerrando sistema"); break;
                default: System.out.println("Valor no valido, introduzca otra opcion");
            }
        } while (opcion!=5);
    }
}
