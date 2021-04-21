/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1sentenciasif;

import java.util.Scanner;

/**
 *
 * @author lampi
 */
public class Ejercicio1SentenciasIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           //Martinez Dionicio Otniel Elihu
       Scanner miConsola = new Scanner( System.in);
       System.out.println("------------------------[Ejercicio 1]-----------------------------");
       int num1;
       int num2;
       System. out. println("Ingrese el primer numero");
        num1= miConsola.nextInt();
        System. out. println("Ingrese el segundo numero");
        num2= miConsola.nextInt();
        if(num1>num2)   {
            System.out.println(num1 + " Es mayor ");
        } else {
            System.out.println(num2 + " Es mayor ");
        }
        System.out.println("------------------------[Ejercicio 2]-----------------------------");
        if(num1>num2)   {
            System.out.println(num1 + " Es mayor y " + num2 + " es menor ");
        } else {
            System.out.println(num1 + " Es mayor y " + num2 + " es menor ");
        }
        System.out.println("------------------------[Ejercicio 3]-----------------------------");
        int numa;
        int numb;
        System. out. println("Ingrese el primer numero");
        numa= miConsola.nextInt();
        System. out. println("Ingrese el segundo numero");
        numb= miConsola.nextInt();
        if (numa>numb) {
            System.out.println(numa + " Es mayor y " + numb + " es menor ");
        } else {
            if (numb>numa) {
                System.out.println(numa + " Es mayor y " + numb + " es menor ");
            } else {
                System.out.println(numa + " Es igual a " + numb);
            }
        }
        System.out.println("------------------------[Ejercicio 4]-----------------------------");
        int año=2021;
        int añox;
        System.out.println(" Es el año 2021 ");
        System.out.println(" Ingrese un año antes del 2021 o despues ");
        añox= miConsola.nextInt();
        if (añox > año) {
            System.out.println("Falntan" + (añox - año) + " años");
        } else {
            if (año > añox){
                System.out.println("Han pasado " + (año - añox) + " años");
            }
        }
        System.out.println("------------------------[Ejercicio 5]-----------------------------");
        int numx;
        System. out. println("Ingrese un numero");
        numx= miConsola.nextInt();
        if (numx >= 0) {
            System.out.println(numx + " Es positivo ");
        } else {
            System.out.println(numx + " Es negativo ");
        }
        System.out.println("------------------------[Ejercicio 6]-----------------------------");
        int numy;
        System.out.println(" Ingrese un numero ");
        numy= miConsola.nextInt();
        if (numy>9 && numy<=99) {
             System.out.println(" El numero " + numy + " Tiene dos cifras");
        } else {
            System.out.println(" Distinto de dos cifras " );
        }
    }
    
}
