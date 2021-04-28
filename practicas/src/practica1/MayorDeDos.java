/*
 * Alejandro Garay López (1º DAW)
 * Programa que solicita dos números
 * y averigua cual es mayor de los dos
 */

import java.util.Scanner;

public class MayorDeDos {
	public static void main(String[] args) {	
		/* tecladoNumerico es un canal de entrada por teclado a través de un Scanner.
		   Necesita importar el paquete java.util
		 */
		Scanner tecladoNumerico = new Scanner(System.in);
		
		//Declaramos variables
		int numero1, numero2;
		
		//Solicitamos los números
		System.out.println("Introduce un número:");
		numero1 = tecladoNumerico.nextInt();
		
		System.out.println("Introduce otro número:");
		numero2 = tecladoNumerico.nextInt();
		
		//Averiguamos que relación tienen los dos números entre sí
		if(numero1 > numero2){ //si numero1 es mayor que numero2
			System.out.println("El número " + numero1 + " es mayor que " + numero2);
			
		} else if(numero2 > numero1){ //si numero2 es mayor que numero1
			System.out.println("El número " + numero2 + " es mayor que " + numero1);
			
		} else if(numero1 == numero2){ //si numero1 es igual que numero2
			System.out.println("Los dos números son iguales");
			
		}
		
	}

}
