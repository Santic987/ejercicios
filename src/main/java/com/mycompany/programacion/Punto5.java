/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Punto5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double[][] notas = new double[5][4];
        for (int i = 0; i<= 4; i++){
            for (int j = 0; j <= 3; j++){
                System.out.println("ingrese la nota #" + (j+1) + " para el estudiante #" + (i+1));
                notas [i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i<=4; i++){
            double prom = 0;
            System.out.println("las notas del estudiante #" + (i+1) + "son :");
            for (int j = 0; j <= 3; j++){
                prom = notas [i][j] + prom;
                System.out.println(notas[i][j]);
            }
            System.out.println("y su promedio es : "+ (prom / 4));
        }
    }
    
}
