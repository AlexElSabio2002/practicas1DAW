/**
 * Alejandro Garay López (1º DAW)
 * PruebaLiterales.java
 * Programa simple que declara variables válidas
 */

public class PruebaLiterales {
	public static void main(String[] args) {	

		double dato1 = -11.1;
		double dato2 = -88.28;
		double dato3 = .3e27;
		//double dato4 = 23e2.3; Un valor en notación científica no puede contener decimales
		String dato5 = "cañón";
		int dato6 = 0377;
		int dato7 = 9999;
		//int dato8 = 099; Está fuera del rango
		double dato9 = +521.6;
		double dato10 = 1.26;
		double dato11 = 5E-002;
		double dato12 = 0xFE;
		//int dato13 = \xFE; Las variables no pueden empezar con el carácter \
		int dato14 = 1234;
		double dato15 = .567;
		double dato16 = 0xFFFE;
		//double dato17 = XGA; Debe ir entre comillas ("")
		String dato18 = "a";
		//char dato19 = 'abc'; El tipo de dato char solo admite un carácter y debe tener estas comillas ('')y el tipo de dato String debe tener estas comillas ("")
		double dato20 = 02.45;
		char dato21 = 'a';
		//String dato22 = xF2E; Debe ir entre comillas ("")
		double dato23 = 0xf;
		//String dato24 = abc; Debe ir entre comillas ("")
		//String dato25 = ab"c; Toda la variable debe ir entre comillas, no solo una parte
		//String dato26 = "abc; La variable debe estar entre comillas, una de apertura y otra de cierre
		//String dato27 = "abc'; El tipo de dato char solo admite un carácter y debe tener estas comillas ('')y el tipo de dato String debe tener estas comillas ("")
		//char dato28 = a'; Falta la comilla de apertura
		String dato29 = "abc;";
		String dato30 = "abc'";
		//String dato31 = "abc""; Sobra una comilla al final
		//String dato32 = ""abc""; Sobra una comilla de apertura y otra de cierre
		String dato33 = "true";
		//boolean dato34 = True; La variable True debe ir en minúscula
		boolean dato35 = false;
		char dato36 = '\\';

	}
}
