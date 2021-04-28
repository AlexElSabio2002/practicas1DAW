// ElementosOrdenados.java
// Fecha: 23/01/2021
// Autor: Alejandro Garay López
// Muestra cuantos elementos de un array están ordenads

import java.util.Scanner;

public class ElementosOrdenados {
	public static void main(String[] args) {
		
		int[] myArray = asignarElementos(longitudArray());
		contarIntConsecutivos(myArray);

	}

	static int[] longitudArray() { // Asignamos el tamaño del array

		Scanner tecladoArray = new Scanner(System.in);

		System.out.println("---------------------------------------");
		System.out.println("Introduce la longitud del vector");
		int[] array = new int[tecladoArray.nextInt()];
		System.out.println("---------------------------------------");

		return array; // Retornamos el array con su tamaño
	}
	
	static int[] asignarElementos(int[] array) { // Asignamos los elementos al array

		Scanner tecladoArray = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce el elemento " + i + ":");
			array[i] = tecladoArray.nextInt();

		}

		return array; // Retornamos el array completo
	}
	
	static void contarIntConsecutivos(int[] array) { // Comprobamos cuantos elementos son consecutivos
		
		int comprobarConsecutivos1 = 0;
		int comprobarConsecutivos2 = -1;
		int contadorConsecutivos = 0;
		
		// Recorremos el vector
		for(int i=0; i<array.length; i++) {
			comprobarConsecutivos1 = array[i]; // Asignamos el elemento i a la variable
			
			if(comprobarConsecutivos1 == (comprobarConsecutivos2 + 1)){ // Si el elemento es igual al elemento anterior - 1
				contadorConsecutivos++; // Sube el contador
				
				if(contadorConsecutivos == 1) { // Si el contador es 1
					contadorConsecutivos = 2; // Asignamos el valor 2, si no faltaría sumarle 1 al contador
					
				}
				
			}
			
			comprobarConsecutivos2 = comprobarConsecutivos1; // Guardamos el elemento anterior
				
		}
		
		System.out.println("Contador: " + contadorConsecutivos); // Mostramos el contador
		
	}
	
}
