package base;

import java.util.Scanner;

public class Diccionario {
	
	private static Scanner teclado = new Scanner(System.in);
	
	public Diccionario() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String palabra = new String();
		do {
		System.out.print ("Introduce palabra: ");
		palabra = teclado.next();
		
		if(palabra != null && palabra.equalsIgnoreCase("palabra")) {
			System.out.println("Significado:");
			System.out.println("Unidad léxica constituida por un sonido o conjunto de sonidos articulados que tienen un significado fijo y una categoría gramatical.");
		}
		else {
			
			System.out.println("Palabra no encontrada, introduce otra palabra");}
		}
		
		while(!(palabra != null && palabra.equalsIgnoreCase("palabra")));{

		}
		}
		


}
