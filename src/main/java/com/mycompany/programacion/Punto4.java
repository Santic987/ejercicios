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
public class Punto4 {
    public static void main(String[] args) {
        System.out.println("hola");
   int[]numeros = new int [ 10 ];
   int suma = 0;
   Scanner sc = new Scanner(System.in);
   for (int i = 0; i<= 9; i++) {
       System.out.println("ingrese el # " + i + " del array");
          numeros [i] = sc.nextInt();
          suma = numeros [i] + suma; 
   }
        System.out.println("el promedio de los numeros es:" + (suma/10));
        for (int i = 0; i<=9;i++){
            int temporal = 0;  
            System.out.println("- ." + numeros[i]+ ":");
            for (int j = 0;j<=9;i++){
                if (numeros[i] == numeros [j]){
                    temporal = temporal + 1;
                }
            }
            System.out.println(temporal);
        }
    }
}
