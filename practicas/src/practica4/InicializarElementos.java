// InicializarElementos.java
// Fecha: 23/01/2021
// Autor: Alejandro Garay López
// Muestra el valor de los elementos de un array
public class InicializarElementos {
	public static void main(String args[]) {
		
		// Declaración de array
		int[] myArray = new int[10];
		mostrarArray(inicializarElementos(myArray)); // Mostramos y asignamos los elementos del array
		
		
	}

	static int[] inicializarElementos(int[] myArray) { // Asignamos valores al array
		
		for(int i=0; i < myArray.length; i++) {
			myArray[i] = 7;
			
		}
		
		return myArray;	// Retornamos los elementos
	}
	
	static void mostrarArray(int[] myArray) { // Mostramos los valores del array
		
		int contador = 0; // Contador de elementos
		// Sacamos uno a uno los elementos del array
		for(int elementos:myArray) {
			System.out.println("Elemento " + contador + "= " + elementos);
			contador++;
			
		}
		
	}
	
}
