/**
 * Alejandro Garay López (1º DAW)
 * Programa que solicita tres números
 * y averigua cual es el mayor
**/

import java.util.Scanner; //Importamos librería scanner

public class MayorDeTres {
	public static void main(String args []) {
		
		Scanner teclado = new Scanner(System.in);  //Construimos la clase Scanner
		
		//Declaramos variables
		int numero1, numero2, numero3;
		
		//Solicitamos los números
		System.out.println("Introduce el número 1:");  //Solicitamos el primer número
		numero1 = teclado.nextInt();  //Entrada de teclado
		System.out.println("Introduce el número 2:");
		numero2 = teclado.nextInt();
		System.out.println("Introduce el número 3:");
		numero3 = teclado.nextInt();
		
		//Averiguamos cual es el mayor de los tres
        if(numero1 == numero2 || numero1 == numero3 || numero2 == numero3) {  //Si los uno de los 3 números coinciden
			
			System.out.println("Algunos números coinciden, introduce números distintos entre sí");  //Mensaje en pantalla
			
		} else if(numero1 > numero2 && numero1 > numero3) {  //Si numero1 es mayor que numero2 y que numero3
			
			System.out.println("El número " + numero1 + " es mayor que " + numero2 + " y " + numero3);  //Mensaje en pantalla
			
		} else if(numero2 > numero1 && numero2 > numero3) {  //Si numero2 es mayor que numero1 y que numero3
			
			System.out.println("El número " + numero2 + " es mayor que " + numero1 + " y " + numero3);  //Mensaje en pantalla
			
		} else if(numero3 > numero2 && numero3 > numero1) {  //Si numero3 es mayor que numero2 y que numero1
			
			System.out.println("El número " + numero3 + " es mayor que " + numero2 + " y " + numero1);  //Mensaje en pantalla
			
		}
		
	}
}
