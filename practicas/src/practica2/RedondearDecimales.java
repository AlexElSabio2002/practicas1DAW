/**
 * RedondearDecimales.java
 * Programa que pide números decimales, los redondea  y muestra cuál es el mayor en la consola del sistema hasta que se usa el número 0
 * agl - 07.11.202
 */

import java.util.Scanner;

public class RedondearDecimales {
	public static void main(String args[]) {
		
		// Método Scanner para solicitar datos en la consola
		Scanner teclado = new Scanner(System.in);
		
		int contador = 0;
		double numeroDecimal, numeroRedondeado;
		int decimales = 0;
		
		System.out.println("Para finalizar el programa introduce el número 0\n"); // Indicamos como finalizar el programa
		
		
		// Bucle para solicitar números decimales y redondearlos
		do {
			
			System.out.println("Introduce un número con decimales"); // Solicitamos un número
			numeroDecimal = teclado.nextDouble(); // Guardamos el número
			
			if(numeroDecimal == 0) { // Si numeroDecimal es igual a 0
				
				contador = 1; // Incumplimos la condición del bucle
				System.out.println("Programa finalizado");
				
			} else { // Si numero decimal no es igual a 0
				
				System.out.println("¿Cuántos decimales quieres incluir?"); // Solicitamos los decimales
				decimales = teclado.nextInt(); // Guardamos el número de decimales
				decimales = (int) Math.pow(10, decimales); // Ajustamos los decimales para el método .rint
				numeroRedondeado = Math.rint(numeroDecimal * decimales) / decimales; // Redondeamos el número
				System.out.println("Número redondeado: " + numeroRedondeado);
				
			}
					
		} while(contador == 0); // Si contador es igual a 0
		
	}

}
