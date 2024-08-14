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
public class Punto2 {
    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del Array");
        int numTamaño = lector.nextInt();
        
        int[] numeros = new int[numTamaño];
        for(int i = 0; i < numTamaño; i++){
            System.out.println("Ingrese el numero");
            numeros[i] = lector.nextInt();
        }
        
        int numPositivos = 0;
        int numNegativos = 0;
        int numCero = 0;
        
        for(int numero: numeros){

            if(numero > 0){
                numPositivos++;
            }else if(numero < 0){
                numNegativos++;
            }else{
                numCero++;
            }  
        }
        
        System.out.println("Los numeros positivos son: " + numPositivos);
        System.out.println("Los numeros Negativos son: " + numNegativos);
        System.out.println("Los numeros cero son: " + numCero);
    }
}
