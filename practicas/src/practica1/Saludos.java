/**
 * Alejandro Garay López (1º DAW)
 * Saludos.java
 * Programa simple que muestra varios mensajes en la consola del sistema.
 */

import java.util.Scanner;  //Librería Scanner

public class Saludos {
	public static void main(String[] args) {  //Método main()
		/* teclado es un canal de entrada por teclado a través de un Scanner.
		   Necesita importar el paquete java.util
		 */
		Scanner teclado = new Scanner(System.in);

		//Declaración de variables
		int numOrden;			// Variable numérica.
		String nombre = "";		// Variable de texto. 

		// Configura y muestra mensajes de bienvenida.
		numOrden = 1 ;  //Nuevo valor de la variable
		System.out.println("Hola,");  //Muestra mensaje en pantalla
		System.out.print("Soy un modesto ");  //Muestra mensaje en pantalla
		System.out.print("programa de ordenador...\n");  //Muestra mensaje en pantalla
		System.out.println("Bienvenido al Curso.\t" + "Este es el saludo nº " + numOrden);  //Muestra mensaje en pantalla
		numOrden++;  //Suma 1 a la variable
		System.out.println("Bienvenido a Java.\t" + "Este es el saludo nº " + numOrden);   //Muestra mensaje en pantalla
		System.out.println("\nFin programa...");   //Muestra mensaje en pantalla
	}
}