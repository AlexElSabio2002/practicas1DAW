// Principal.java
// Fecha: 26/01/2021
// Autor: Alejandro Garay López
// En función de un patrón de unos y ceros asigna que usuarios está o no vacío

import java.util.Scanner;

class Usuario {

	// Atributos
	public String nif;
	public String nombre;
	public String apellidos;
	public String correo;
	public String domicilio;
	public String fechaNacimiento;
	public String fechaAlta;
	public String claveAcceso;
	public String rol;

} // class

public class Principal {

	final static int MAX_USUARIOS = 45;

	// Almacén de datos resuelto con arrays
	public static Usuario[] datosUsuarios = new Usuario[MAX_USUARIOS];

	public static void main(String[] args) {

		//  Almacén del patrón de unos y ceros
		String[] arrayPatron = new String[solicitarTamañoArray()]; // Solicitamos el tamaño del array por teclado
		cargarDatosUsuariosPatron(solicitarPatron(arrayPatron));
		mostrarDatosUsuarios(); // Mostramos los usuarios

	}

	static int solicitarTamañoArray() { // Solicitamos el tamaño del array
		
		Scanner tecladoPatron = new Scanner(System.in);
		int tamañoPatron;
		int condicion = 0;

		/* 
		 * Si introduce un número erróneo sigue en el bucle
		 */
		do {
			
			System.out.println("¿Cuántos números tiene el patrón? (Mínimo 1 - Máximo 45)");
			tamañoPatron = tecladoPatron.nextInt();
			
			if(tamañoPatron > 45) { // Si supera los 45
				System.out.println("Se registrarán como máximo 45 usuarios" + "\n");
				condicion = 1; // Salimos del bucle
				
			} else if(tamañoPatron < 1) { // Si es inferior a 1
				System.out.println("Error, introduce un número entre 1 y 45" + "\n"); // No salimos del bucle
				
			} else { // Si está entre 1 y 45
				System.out.println("");
				condicion = 1; // Salimos del bucle
				
			}
			
		} while(condicion == 0); // Mientras que condición sea 0

		return tamañoPatron; // Retornamos el tamaño del array que almacena el patrón
	}

	static 	String[] solicitarPatron(String[] arrayPatron) { // Solicitamos el patrón
		
    	Scanner tecladoPatron = new Scanner(System.in);
    	String validarNumero = "";
    	int contador = 0;
    	
    	System.out.println("Introduce un patrón de unos y ceros");
    	System.out.println("·0: El usuario estará vacío" + "\n" + "·1: El usuario no estará vacío");
    	System.out.println("Para dejar de introducir el patrón introduce la letra Q" + "\n" + 
    	                   "-------------------------------------------------------");
    	/*
    	 * Hay que confirmar que el número que se introduce
    	 * es uno, cero o Q, el resto no son válidos
    	 */
    	do {
    		
    		validarNumero = tecladoPatron.nextLine(); // Recibimos el número introducido
    		
    		// Si es un uno, un cero o una q es válido
    		if(validarNumero.equals("1") || validarNumero.equals("0") || validarNumero.equalsIgnoreCase("q")) {
    			
    			if(!validarNumero.equalsIgnoreCase("Q")) { // Si es distinto de Q
        			arrayPatron[contador] = validarNumero; // Lo incluimos en el array
        			contador++;
        			
        			if(contador == arrayPatron.length) { // Si es igual a la longitud del patron salimos del bucle
        				break;
        				
        			}
        			
        		} else { // Si es Q
        
        			if(contador < arrayPatron.length) { // Si faltan huecos por rellenar del patrón
        				System.out.println("Todavía faltan por rellenar " + (arrayPatron.length - contador) + " huecos");
        				validarNumero = ""; // No salimos del bucle
        				
        			}
        			
        		}
    			
    		} else { // Si introduce un número que no se admite
    			System.out.println("ERROR, Introduce uno o cero");
    			
    		}
    				
    	} while(!validarNumero.equalsIgnoreCase("Q")); // Mientras que sea distinto de Q
    	
    	return arrayPatron; // Retornamos el array que almacena el patron
    }

	static void cargarDatosUsuariosPatron(String arrayPatron[]) { // Asignamos que usuarios están o no vacíos
		
		int contador = 0;
		
		/*
		 * Vamos a recorrer los 45 posibles usuarios que puede haber dentro
		 * de el array de usuarios y a asignar que usuarios están vacíos
		 * y cuales no
		 */
		for(int i=0; i < datosUsuarios.length; i++) {
			
			 // Se repite en ciclos según el tamaño del patrón
			for(int j=0; j < arrayPatron.length; j++) {
				
				if(arrayPatron[j].equals("1")) { // Si el elemento es 1
					datosUsuarios[contador] = new Usuario(); // Rellenamos ese usuario
					
				}
				
				contador++;
				
				if(contador == datosUsuarios.length) { // Si es igual al tamaño del array de usuarios
					//Salimos del bucle incumpliendo las condiciones
					i = datosUsuarios.length + 1;
					j = arrayPatron.length + 1;
					
				}
	
			}
			
		}
	
	}

	static void mostrarDatosUsuarios() { // Mostramos los elementos del array de usuarios
		
		int contador = 0;
		
		System.out.println("____________________________"); // Decoración
		//Sacamos uno a uno los elementos del array de usuarios
		for(Usuario elemento:datosUsuarios) {	
			System.out.println("Usuario " + contador + ": " + elemento);
			contador++;
			
		}
		System.out.println("____________________________");
	}
	
} // class