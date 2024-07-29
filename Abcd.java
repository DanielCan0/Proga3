/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratoriodos;

import java.util.Scanner;

public class Abcd {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = lea.nextInt();
        String resultado1 = (edad >= 18) ? "Adulto" : "Menor de edad";
        System.out.println("Resultado con valor constante: " + resultado1);

        System.out.print("Ingrese el valor de a: ");
        int a = lea.nextInt();
        System.out.print("Ingrese el valor de b: ");
        int b = lea.nextInt();
        int mayor = (a > b) ? a : b;
        System.out.println("El mayor valor entre " + a + " y " + b + " es: " + mayor);

        System.out.print("Ingrese el valor de x: ");
        int x = lea.nextInt();
        System.out.print("Ingrese el valor de y: ");
        int y = lea.nextInt();
        int diferencia = (x > y) ? (x - y) : (y - x);
        System.out.println("La diferencia entre " + x + " y " + y + " es: " + diferencia);

        
    }
}