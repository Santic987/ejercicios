/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Punto3 {
     public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        LocalDate fechaActual = LocalDate.now();

        int actualAño = fechaActual.getYear();

        System.out.println("Ingresa tu año de nacimiento(AAAA): ");
        int añoNacimiento = lector.nextInt();
        int edad = actualAño - añoNacimiento;

        if (edad >= 18) {
            System.out.println("Usted puede votar");
        } else {
            System.out.println("Usted no puede votar");
        }
    }
}


