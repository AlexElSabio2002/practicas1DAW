/**
 * MayorMenor.java
 * Programa que pide números y cuando se acaba el programa te dice en la consola cuál es el menor, el mayor y la cantidad de números válidos introducidos
 * agl - 07.11.202
 */

import java.util.Scanner;

public class MayorMenor {
	public static void main(String args[]) {
		
		// Método Scanner para solicitar datos en la consola
	    Scanner teclado = new Scanner(System.in);
	    Scanner tecladoTexto = new Scanner(System.in);
	    
	    // Declaración de variables
	    int valorEntrada;
	    int elMayor = 0, elMenor = 0;
	    int contadorDatosValidos = 0;
	    String condicion = "0";
	   
	    /**
	     * Bucle para solicitar números y determinar cual es el mayor y el menor de todos ellos.
	     * Si valorEntrada es 0 se habilitará la opción de finalizar el programa introduciendo la tecla T.
	     * Si valorEntrada es el valor más grande de los introducidos se le asigna su valor a la variable elMayor
	     * y si valorEntrada es el menor de todos los introducidos se le asigna su valor a la variable elMenor
	     * Si valorEntrada es válido se le suma 1 a contadorDatosValidos
	     */
    	do {
    		
    		System.out.println("Introduce un número entero:"); // Solicitamos número
    		valorEntrada = teclado.nextInt(); // Guardamos número
    		
    		if(valorEntrada == 0) { // Si valorEntrada es igual a 0
    			
    			if(contadorDatosValidos < 2) { // Si contadorDatosValidos es menor que 2 
    				
    				System.out.println("Antes de finalizar el programa introduce al menos 2 números enteros"); // Indicamos que debes introducir al menos 2 números
    				
    			} else { // Si contadorDatosValidos no es menor que 2
    				
    				System.out.println("Introduce la letra T para finalizar el programa"); // Indicamos como se finaliza el programa
        			condicion = tecladoTexto.nextLine(); // Guardamos la letra
        			
        			if(!condicion.equalsIgnoreCase("T")) { // Si no es igual a T
        				
        				System.out.println("El programa no se ha finalizado"); // No finaliza el programa
        				
        			}
    				
    			}
    			
    		} else if(valorEntrada > elMayor && valorEntrada > elMenor) { // Si valorEntrada es mayor que elMayor y elMenor
    			
    			elMayor = valorEntrada; // valorEntrada es el número más grande por lo que lo guardamos en elMayor
    			contadorDatosValidos++; // Sumamos 1 a contadorDatosValidos
    			
    		} else{
    			
    			elMenor = valorEntrada; // valorEntrada es el número más grande por lo que lo guardamos en elMayor
    			contadorDatosValidos++; // Sumamos 1 a contadorDatosValidos
    			
    		}
    		
    		
    	} while (!condicion.equalsIgnoreCase("T")); // Si condicion es igual a T se cierra el bucle
    	
    	System.out.println("El mayor valor es " + elMayor); // Mostramos cual es el mayor de todos los datos introducidos
    	System.out.println("El menor valor es " + elMenor); // Mostramos cual es el menor de todos los datos introducidos
    	System.out.println("El número de números introducidos es " + contadorDatosValidos); // Mostramos la cantidad de números válidos introducidos
    	
	    System.out.println("Programa finalizado");
		
	}

}
