/**
 * Alejandro Garay López (1º DAW)
 * Programa que muestra algunos mensaje en pantalla
 * y solicita dos números para averiguar cual de los dos
 * es el mayor
**/

import java.util.Scanner;

public class Hola3 {
    public static void main(String argumentos[]) {     
        //teclado es un canal de entrada por teclado a través de un Scanner.
        //Necesita importar el paquete java.util
        Scanner teclado = new Scanner(System.in);
        int num;               //Declaramos una variable
        
        //Asignamos un valor a la variable num y mostramos mensajes en pantalla
        num = 1;
        System.out.println("Hola, Soy un modesto ");
        System.out.print("programa de ordenador...\n");
        System.out.println("Mi número de orden es el " + num + " por ser el primero.");
        //Solicitamos la entrada de dos números y lo guardamos en sus respectivas variables
        System.out.println("Escribe dos números...\n");
        int dato1 = teclado.nextInt();
        int dato2 = teclado.nextInt();
        //Mostramos en pantalla los datos introducidos
        System.out.println("Dato1: " + dato1);
        System.out.println("Dato2: " + dato2);
        //Averiguamos que número es el mayor con estructuras if
        String mensaje = "";
        if (dato1 == dato2) {
            mensaje = "Ninguno de los dos es mayor... ";
        }
        if (dato1 > dato2) {
            mensaje = "El mayor es: " + dato1;
        }
        if (dato2 > dato1) {
            mensaje = "El mayor es: " + dato2;
        }
        System.out.println(mensaje);
    }
}
