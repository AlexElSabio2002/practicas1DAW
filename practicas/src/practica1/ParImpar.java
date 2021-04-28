/*
 * Alejandro Garay López (1º DAW)
 * Programa que solicita un número
 * y averigua si es par o impar
 */

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {	
		/* tecladoNumerico es un canal de entrada por teclado a través de un Scanner.
		   Necesita importar el paquete java.util
		 */
		Scanner tecladoNumerico = new Scanner(System.in);
		
		//Declaramos la variable
		int numero;
		
		//Solicita un número
		System.out.println("Introduce un número:");  //Mensaje en pantalla
		numero = tecladoNumerico.nextInt(); //Entrada por teclado
		
		//Averiguamos si es par o impar
		if(numero % 2 == 0) { //Si el resto de la división es 0
			System.out.println("El número " + numero + " es par");  //Mensaje en pantalla
			
		} else { //Resto de casos
			System.out.println("El número " + numero + " es impar");  //Mensaje en pantalla
			
		}
	}
}
